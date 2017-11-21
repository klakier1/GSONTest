package pl.klakier.gson.fragments;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;
import pl.klakier.gson.adapters.CustomTestListAdapter;
import pl.klakier.gson.R;
import pl.klakier.gson.ResponseTestJSON;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentTestList.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentTestList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTestList extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ListView listView;
    private ResponseTestJSON responseTestJSON;
    private CustomTestListAdapter adapter;
    private String url = "http://klakier.000webhostapp.com/test.json";
    private Gson gson;
    private AsyncHttpClient client;

    private OnFragmentInteractionListener mListener;

    public FragmentTestList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTestList.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTestList newInstance(String param1, String param2) {
        FragmentTestList fragment = new FragmentTestList();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_test_list, container, false);
        listView = view.findViewById(R.id.testList);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        makeList();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            //throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void setOnFragmentInteractionListener(FragmentTestList.OnFragmentInteractionListener listener) {
        mListener = listener;
    }

    public void makeList() {
        if (isOnline()) {
            client = new AsyncHttpClient();
            client.get(getActivity(), url, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    //Toast.makeText(getActivity(), R.string.toast_JSON_download_ok, Toast.LENGTH_SHORT).show();
                    String responseHttp = new String(responseBody);
                    gson = new Gson();
                    responseTestJSON = gson.fromJson(responseHttp, ResponseTestJSON.class);
                    adapter = new CustomTestListAdapter(getActivity(), responseTestJSON.getMenu().getItems());
                    listView.setAdapter(adapter);
                    Toast.makeText(getActivity(), "test adapter set", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    //Toast.makeText(getActivity(), R.string.toast_JSON_download_nok, Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            //Toast.makeText(getActivity(), R.string.toast_no_connection, Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isOnline() {
        try {
            ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = cm.getActiveNetworkInfo();
            return netInfo != null && netInfo.isConnectedOrConnecting();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
