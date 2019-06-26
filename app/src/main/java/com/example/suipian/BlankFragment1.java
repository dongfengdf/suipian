package com.example.suipian;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class BlankFragment1 extends Fragment {
    /*private String[] data = {"apple","banana","orange","watermelon","apple",
            "banana","orange","watermelon","apple","banana","orange","watermelon"};*/
    private List<Fruit> fruitList = new ArrayList<>();
    private void initFruits(){
        for (int i =0;i<2;i++){
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

        View view = inflater.inflate(R.layout.fragment_blank_fragment1, container,
                false);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(getContext(),
                R.layout.fruit_item,fruitList);

       /* ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_list_item_1,data);*/

        ListView listView = view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return view;
    }
}
