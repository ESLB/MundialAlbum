package com.album.mundial.eslb.mundialalbum.drawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.album.mundial.eslb.mundialalbum.Activities.Logging_1;
import com.album.mundial.eslb.mundialalbum.R;

import java.util.ArrayList;
import java.util.List;

import static com.album.mundial.eslb.mundialalbum.Activities.Central_4.CambiarPestana;


public class DrawerFragment extends Fragment {

    private RecyclerView mRecyclerView;

    private ItemsAdapter mItemsAdapter;

    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.drawer_fragment, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerDrawer);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<DrawerItem> items = createDatos();
        mItemsAdapter = new ItemsAdapter(items);
        mRecyclerView.setAdapter(mItemsAdapter);
        return view;
    }

    private List<DrawerItem> createDatos(){
        List<DrawerItem> items = new ArrayList<>();
        items.add(new DrawerItem("Inicio", ""));
        items.add(new DrawerItem("Mi Perfil", ""));
        items.add(new DrawerItem("Comprar Stickers",""));
        items.add(new DrawerItem("Mis Amigos", ""));
        items.add(new DrawerItem("Cerrar Sesion", ""));
        return items;
    }


    private class ItemsHolder extends RecyclerView.ViewHolder{

        private TextView mNombres, mApellidos;
        private DrawerItem mItem;


        public ItemsHolder(View itemView) {
            super(itemView);

            mNombres = (TextView) itemView.findViewById(R.id.nombre);
            mApellidos = (TextView) itemView.findViewById(R.id.apellidos);

        }

        public void bindData(DrawerItem item){
            this.mItem = item;
            mNombres.setText(item.getNombre());
            mApellidos.setText(item.getApellidos());
        }

    }

    private class ItemsAdapter extends RecyclerView.Adapter<ItemsHolder>{

        private List<DrawerItem> mItems;

        public ItemsAdapter(List<DrawerItem> items){
            mItems = items;
        }

        @Override
        public ItemsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.drawer_item, parent, false);

            return new ItemsHolder(view);
        }

        @Override
        public void onBindViewHolder(final ItemsHolder holder, int position) {
            DrawerItem item = mItems.get(position);
            holder.bindData(item);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getActivity(), holder.mNombres.getText(), Toast.LENGTH_SHORT).show();
                    String mandato =holder.mNombres.getText().toString();
                    if(mandato.equals("Cerrar Sesion"))
                    {startActivity(new Intent(getActivity(), Logging_1.class));
                        getActivity().finish();}
                    else
                    CambiarPestana(mandato);
                    mDrawerLayout.closeDrawer(GravityCompat.START);
                }
            });
        }

        @Override
        public int getItemCount() {
            return mItems.size();
        }
    }


    public void setUpDrawer(int fragmentId, DrawerLayout drawerLayout, Toolbar toolbar){

        mDrawerLayout = drawerLayout;

        mDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close){

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });

    }



}
