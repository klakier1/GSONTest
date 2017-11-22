package pl.klakier.gson.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import pl.klakier.gson.R;
import pl.klakier.gson.fragments.FragmentCarList;
import pl.klakier.gson.fragments.FragmentCarRecyclerView;
import pl.klakier.gson.fragments.FragmentTestList;

/**
 * Created by Łukasz on 2017-11-20.
 */

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {

    FragmentCarList fragmentCarList;
    FragmentTestList fragmentTestList;
    FragmentCarRecyclerView fragmentCarRecyclerView;
    FragmentManager fragmentManager;


    public CustomFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        //"android:switcher:2131689619:0"
        fragmentManager = fm;

        if ((fragmentCarList = (FragmentCarList) findFragmentByPosition(0))== null)
            fragmentCarList = new FragmentCarList();

        if ((fragmentTestList = (FragmentTestList) findFragmentByPosition(1))== null)
            fragmentTestList = new FragmentTestList();

        if ((fragmentCarRecyclerView = (FragmentCarRecyclerView) findFragmentByPosition(2))== null)
            fragmentCarRecyclerView = new FragmentCarRecyclerView();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return fragmentCarList;
            case 1:
                return fragmentTestList;
            case 2:
                return fragmentCarRecyclerView;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public Fragment findFragmentByPosition(int position) {
        return fragmentManager.findFragmentByTag("android:switcher:" + R.id.viewPager + ":" + position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Car List";
            case 1:
                return "Test List";
            case 2:
                return "Car RV List";
            default:
                return null;
        }
    }


}
