package com.album.mundial.eslb.mundialalbum.Fragments;


import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.album.mundial.eslb.mundialalbum.ModelsDummy.Item;
import com.album.mundial.eslb.mundialalbum.R;
import com.album.mundial.eslb.mundialalbum.SingletonStickers;
import com.album.mundial.eslb.mundialalbum.models.StickersModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.album.mundial.eslb.mundialalbum.Activities.Central_4.CambiarPestana;


public class FutbolistasFragment_8 extends Fragment {

    private RecyclerView mRecyclerView;
    private ItemsAdapter  mItemsAdapter;


    public FutbolistasFragment_8() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vista_jugadores_fragment_8, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerJugadores);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        List<Item> items = creatItems();
        mItemsAdapter = new ItemsAdapter(items);
        mRecyclerView.setAdapter(mItemsAdapter);
        return view;
    }

    private List<Item> creatItems(){
        List<Item> items = new ArrayList<>();
        SingletonStickers ss = SingletonStickers.get(getActivity());
        List<StickersModel> stickerModel = ss.getVacioFutbolistas();
        for(StickersModel s : stickerModel){
            items.add(new Item(s.getIdImagen(), s.getShortTxt()));
        }
//        items.add(new Item(R.drawable.jugador_22,"Eduardo"));
//        items.add(new Item(R.drawable.jugador_33,"Eduardo"));
//        items.add(new Item(R.drawable.jugador_44,"Eduardo"));
//        items.add(new Item(R.drawable.jugador_55,"Eduardo"));
//        items.add(new Item(R.drawable.jugador_66,"Eduardo"));
//        items.add(new Item(R.drawable.jugador_77,"Eduardo"));
//        items.add(new Item(R.drawable.jugador_88,"Eduardo"));
        return items;
    }


    private class ItemsHolder extends RecyclerView.ViewHolder{

        private TextView mText;
        private ImageView mImage;
        private Random random = new Random();
        public ItemsHolder(View itemView) {
            super(itemView);

            mText = (TextView) itemView.findViewById(R.id.nombreItem);
            mImage = (ImageView) itemView.findViewById(R.id.imageItem);

        }

        public void bindData(Item item){
            mText.setText(item.getmText());
            if(item.getmImageId()!= 0){
                mImage.setImageResource(item.getmImageId());
//                random = new Random();
//                int o = random.nextInt();
//                if(o%3==0){
//                    ColorMatrix matrix = new ColorMatrix();
//                    matrix.setSaturation(0);
//                    ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
//                    mImage.setColorFilter(filter);
//                }
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
                    CambiarPestana("DetalleJugador");
                }
            });
        }

        @Override
        public int getItemCount() {
            return mItems.size();
        }
    }



}
