package com.album.mundial.eslb.mundialalbum.Activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.album.mundial.eslb.mundialalbum.Fragments.GruposFragment_5;
import com.album.mundial.eslb.mundialalbum.ModelsDummy.BlueFragment;
import com.album.mundial.eslb.mundialalbum.ModelsDummy.GreenFragment;
import com.album.mundial.eslb.mundialalbum.ModelsDummy.YellowFragment;
import com.album.mundial.eslb.mundialalbum.R;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class Intercambio_13 extends AppCompatActivity {

    private static int orden = 0;
    public static Toolbar toolbar;
    public static FragmentManager fm;
    public static Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intercambio_13);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Intercambiar Stickers");
        toolbar.setSubtitle("Buscar: ");
        fm = getSupportFragmentManager();
        fragment = fm.findFragmentById(R.id.fragment_container);
        if(fragment == null){
            fragment = new BlueFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

        BottomNavigationBar bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);

        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.drawable.ic_action_name, "Buscar")).setActiveColor(R.color.colorPrimaryDark)
                .addItem(new BottomNavigationItem(R.drawable.otro, "Ofertar")).setActiveColor(R.color.colorPrimaryDark)
                .addItem(new BottomNavigationItem(R.drawable.otro_tres, "solicitudes")).setActiveColor(R.color.colorPrimaryDark)
                .initialise();

        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener(){
            @Override
            public void onTabSelected(int position) {
                if(position==0) {
                    fragment = new BlueFragment();
                    toolbar.setSubtitle("Buscar");
                    fm.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                }
                else if(position==1){
                    toolbar.setSubtitle("Ofertar");
                    fragment = new GreenFragment();
                    fm.beginTransaction().replace(R.id.fragment_container, fragment).commit();

                }
                else{
                    fragment = new YellowFragment();
                    fm.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                    toolbar.setSubtitle("Solicitudes");
                }
            }
            @Override
            public void onTabUnselected(int position) {

            }
            @Override
            public void onTabReselected(int position) {

            }
        });


    }




}
