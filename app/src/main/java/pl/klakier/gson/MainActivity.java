package pl.klakier.gson;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import pl.klakier.gson.adapters.CustomFragmentPagerAdapter;
import pl.klakier.gson.fragments.FragmentCarList;
import pl.klakier.gson.fragments.FragmentTestList;

public class MainActivity extends AppCompatActivity {

    static final public String TAG = "pl.klakier.gson";
    private ViewPager viewPager;
    private CustomFragmentPagerAdapter customFragmentPagerAdapter;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private FragmentTestList fragmentTestList;
    private FragmentCarList fragmentCarList;
    private FragmentManager fragmentManager;
    private IntentFilter filter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            boolean noConnectivity = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);
            //Toast.makeText(context, Boolean.toString(noConnectivity), Toast.LENGTH_LONG).show();
            if (!noConnectivity && viewPager != null) {
                //if (viewPager.getCurrentItem() == 0)
                //if (fragmentCarList.isVisible())
                //fragmentCarList.makeList();
                //else if (fragmentTestList.isVisible())
                //fragmentTestList.makeList();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//set toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //create custom fragment adapter
        fragmentManager = getSupportFragmentManager();
        customFragmentPagerAdapter = new CustomFragmentPagerAdapter(fragmentManager);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(customFragmentPagerAdapter);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_car);

        fragmentCarList = (FragmentCarList) customFragmentPagerAdapter.getItem(0);
        fragmentTestList = (FragmentTestList) customFragmentPagerAdapter.getItem(1);
        fragmentCarList.setOnFragmentInteractionListener(new FragmentCarList.OnFragmentInteractionListener() {
            @Override
            public void onFragmentInteraction(Uri uri) {
            }

            @Override
            public void onClickItemClick(View v) {
                TextView tv = v.findViewById(R.id.tv_label);
                Toast.makeText(MainActivity.this, tv.getText() + " was clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(broadcastReceiver, filter);
    }

    @Override
    protected void onStop() {
        unregisterReceiver(broadcastReceiver);
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_refresh:
                if (viewPager.getCurrentItem() == 0)
                    fragmentCarList.makeList();
                else
                    fragmentTestList.makeList();
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

}
