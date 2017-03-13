package br.eng.joaofaro.ireserv.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joaofaro on 12/03/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{

    private final List<Fragment> listaFragmentos = new ArrayList<>();
    private final List<String> listaTitulosFragmentos = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return listaFragmentos.get(position);
    }

    @Override
    public int getCount() {
        return listaFragmentos.size();
    }

    public void addFragment(Fragment fragment, String title) {
        listaFragmentos.add(fragment);
        listaTitulosFragmentos.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listaTitulosFragmentos.get(position);
    }

}
