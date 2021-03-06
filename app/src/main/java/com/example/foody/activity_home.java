package com.example.foody;

import android.os.Bundle;

import com.example.foody.adapter.RecyclerViewAdapter;
import com.example.foody.model.Store;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class activity_home extends Fragment {

    List<Store> lstStore;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_home,container,false);
        lstStore = new ArrayList<>();
        lstStore.add(new Store("Cua hang 1",R.drawable.image1,""));
        lstStore.add(new Store("Cua hang 1",R.drawable.image1,""));
        lstStore.add(new Store("Cua hang 1",R.drawable.image1,""));
        lstStore.add(new Store("Cua hang 1",R.drawable.image1,""));
        lstStore.add(new Store("Cua hang 1",R.drawable.image1,""));
        lstStore.add(new Store("Cua hang 1",R.drawable.image1,""));
        RecyclerView rcv = (RecyclerView) v.findViewById(R.id.recyclerview);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getActivity(),lstStore);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rcv.setAdapter(myAdapter);
        rcv.setNestedScrollingEnabled(false);
        return v;
    }
}