package com.dicoding.fragmenttraining;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnFrg1, btnFrg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFrg1=findViewById(R.id.btn_frg1);
        btnFrg2=findViewById(R.id.btn_frg2);

        btnFrg1.setOnClickListener(this);
        btnFrg2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
     switch (v.getId()){
         case R.id.btn_frg1:
             ft.replace(R.id.frameLayout, new Fragment1());
             ft.commit();
             break;
         case R.id.btn_frg2:
             ft.replace(R.id.frameLayout, new Fragment2());
             ft.commit();
             break;
        }
    }
}
