package br.eng.joaofaro.ireserv.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.eng.joaofaro.ireserv.R;

/**
 * Created by joaofaro on 12/03/17.
 */

public class TabDescricaoFragment extends Fragment {

    public TabDescricaoFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.descricao_fragment, container, false);
    }
}
