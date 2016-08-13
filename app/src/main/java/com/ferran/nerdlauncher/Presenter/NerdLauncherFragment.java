package com.ferran.nerdlauncher.Presenter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ferran.nerdlauncher.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NerdLauncherFragment extends Fragment {
    private RecyclerView mRecyclerView;

    public NerdLauncherFragment() {
        // Required empty public constructor
    }

    public static NerdLauncherFragment newInstance() {
        
        Bundle args = new Bundle();
        
        NerdLauncherFragment fragment = new NerdLauncherFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_nerd_launcher,container,false);
        mRecyclerView=(RecyclerView)v.findViewById(R.id.fragment_nerd_launcher_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }

}
