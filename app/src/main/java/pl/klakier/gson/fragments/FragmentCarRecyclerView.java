package pl.klakier.gson.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import pl.klakier.gson.R;
import pl.klakier.gson.ResponseCarJSON;
import pl.klakier.gson.TestJson;
import pl.klakier.gson.adapters.CustomCarRecycleViewAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCarRecyclerView#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCarRecyclerView extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView recyclerView;
    private CustomCarRecycleViewAdapter customCarRecycleViewAdapter;
    private Gson gson;
    private ResponseCarJSON response;

    public FragmentCarRecyclerView() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCarRecyclerView.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentCarRecyclerView newInstance(String param1, String param2) {
        FragmentCarRecyclerView fragment = new FragmentCarRecyclerView();
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

        View view = inflater.inflate(R.layout.fragment_fragment_car_recycler_view, container, false);
        recyclerView = view.findViewById(R.id.rcv_car_list);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gson = new Gson();
        response = gson.fromJson(TestJson.mJSONcars, ResponseCarJSON.class);
        customCarRecycleViewAdapter = new CustomCarRecycleViewAdapter(getActivity(), response.getItems());
        recyclerView.setAdapter(customCarRecycleViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
