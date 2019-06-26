package com.example.suipian;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button[] button = new Button[]{
                findViewById(R.id.button1),
                findViewById(R.id.button2),
                findViewById(R.id.button3),
                findViewById(R.id.button4),
        };
        for (Button n : button){
            n.setOnClickListener(this);
        }
        replaceFragment(new Fragment4());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                replaceFragment(new BlankFragment1());
                return;
            case R.id.button2:
                replaceFragment(new Fragment2());
                return;
            case R.id.button3:
                replaceFragment(new Fragment3());
                return;
            case R.id.button4:
                replaceFragment(new Fragment4());
                return;
        }
    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment, fragment).commit();
    }
}


