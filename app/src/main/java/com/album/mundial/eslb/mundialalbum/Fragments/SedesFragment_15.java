package com.album.mundial.eslb.mundialalbum.Fragments;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.album.mundial.eslb.mundialalbum.R;
import com.album.mundial.eslb.mundialalbum.SingletonStickers;
import com.album.mundial.eslb.mundialalbum.models.StickersModel;

import java.util.List;

public class SedesFragment_15 extends Fragment {

    private RecyclerView mRecyclerView;
    private ItemsAdapter mItemsAdapter;


    public SedesFragment_15() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sedes_fragment_15, container, false);
        mRecyclerView =  (RecyclerView) view.findViewById(R.id.recyclerSedes);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        List<StickersModel> stickers = SingletonStickers.get(getActivity()).getVacioSedes();
        mItemsAdapter = new ItemsAdapter(stickers);
        mRecyclerView.setAdapter(mItemsAdapter);
        return view;
    }


    private class ItemsHolder extends RecyclerView.ViewHolder{

        private TextView textView, numeracion;
        private ImageView imageView;

        public ItemsHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.nombreItem);
            imageView = (ImageView) itemView.findViewById(R.id.imageItem);
            numeracion = (TextView) itemView.findViewById(R.id.numeracionItem);
        }

        public void bindData(StickersModel s){
            textView.setText(s.getShortTxt());
            imageView.setImageResource(s.getIdImagen());
            numeracion.setText(s.getNumeracion()+"");
        }

    }


    private class ItemsAdapter extends RecyclerView.Adapter<ItemsHolder>{

        private List<StickersModel> mStickers;

        public ItemsAdapter(List<StickersModel> stickers){
            mStickers = stickers;
        }

        @Override
        public ItemsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.item_sticker, parent, false);

            return new ItemsHolder(view);
        }

        @Override
        public void onBindViewHolder(ItemsHolder holder, int position) {
            StickersModel sticker = mStickers.get(position);
            holder.bindData(sticker);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }

        @Override
        public int getItemCount() {
            return mStickers.size();
        }
    }

}
