package com.album.mundial.eslb.mundialalbum.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.album.mundial.eslb.mundialalbum.ModelsDummy.Item;
import com.album.mundial.eslb.mundialalbum.R;
import com.album.mundial.eslb.mundialalbum.Static.FragmentNames;

import java.util.ArrayList;
import java.util.List;

import static com.album.mundial.eslb.mundialalbum.Activities.Central_4.CambiarPestana;

public class PaisesFragment_6 extends Fragment {

    private RecyclerView mRecyclerView;
    private ItemsAdapter mItemsAdapter;

    public PaisesFragment_6() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.paises_fragment_6, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerPaises);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        List<Item> items = crearItems();
        mItemsAdapter = new ItemsAdapter(items);
        mRecyclerView.setAdapter(mItemsAdapter);
        return view;
    }

    private List<Item> crearItems(){
        List<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.dinamarca, "Dinamarca"));
        items.add(new Item(R.drawable.peru, "Perú"));
        items.add(new Item(R.drawable.iran,"Irán"));
        items.add(new Item(R.drawable.japon,"Japon"));
        items.add(new Item(R.drawable.portugal,"Portugal"));
        items.add(new Item(R.drawable.rusia,"Rusia"));
        items.add(new Item(R.drawable.dinamarca, "Dinamarca"));
        items.add(new Item(R.drawable.peru, "Perú"));
        items.add(new Item(R.drawable.iran,"Irán"));
        items.add(new Item(R.drawable.japon,"Japon"));
        items.add(new Item(R.drawable.portugal,"Portugal"));
        items.add(new Item(R.drawable.rusia,"Rusia"));
        return items;
    }

    private class ItemsHolder extends RecyclerView.ViewHolder{

        private TextView mText;
        private ImageView mImage;

        public ItemsHolder(View itemView) {
            super(itemView);

            mText = (TextView) itemView.findViewById(R.id.nombreItem);
            mImage = (ImageView) itemView.findViewById(R.id.imageItem);

        }

        public void bindData(Item item){
            mText.setText(item.getmText());
            if(item.getmImageId()!= 0){
                mImage.setImageResource(item.getmImageId());
            }
        }

    }

    private class ItemsAdapter extends RecyclerView.Adapter<ItemsHolder>{

        private List<Item> mItems;

        public ItemsAdapter(List<Item> items){
            mItems = items;
        }

        @Override
        public ItemsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.item_pais, parent, false);

            return new ItemsHolder(view);
        }

        @Override
        public void onBindViewHolder(ItemsHolder holder, int position) {
            Item item = mItems.get(position);
            holder.bindData(item);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CambiarPestana(FragmentNames.FUTBOLISTAS);
                }
            });
        }

        @Override
        public int getItemCount() {
            return mItems.size();
        }
    }

}
