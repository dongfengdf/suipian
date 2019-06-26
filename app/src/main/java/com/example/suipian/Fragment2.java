package com.example.suipian;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {
    private List<Fruit> fruitList = new ArrayList<>();
    private void initFruits(){
        for (int i = 0;i<2;i++){
            Fruit apple = new Fruit("Apple",R.drawable.ic_launcher_background);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana",R.drawable.ic_launcher_background);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange",R.drawable.ic_launcher_background);
            fruitList.add(orange);
            Fruit mango = new Fruit("Mango",R.drawable.ic_launcher_background);
            fruitList.add(mango);
            Fruit pear = new Fruit("Pear",R.drawable.ic_launcher_background);
            fruitList.add(pear);
        }
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        initFruits();
        RecyclerView recyclerView = view.findViewById(R.id.recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        FrutAdapter adapter = new FrutAdapter(fruitList);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
