package com.album.mundial.eslb.mundialalbum.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.album.mundial.eslb.mundialalbum.ModelsDummy.Amigo;
import com.album.mundial.eslb.mundialalbum.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AmigosFragment_10 extends Fragment {

    private RecyclerView mRecyclerView;
    private AmigosAdapter mAmigosAdapter;

    public AmigosFragment_10() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vista_amigos_fragment_10, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerAmigos);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<Amigo> amigos = crearAmigos();
        mAmigosAdapter = new AmigosAdapter(amigos);
        mRecyclerView.setAdapter(mAmigosAdapter);
        return view;
    }

    private List<Amigo> crearAmigos(){
        List<Amigo> amigos = new ArrayList<>();
        amigos.add(new Amigo("(Perú) Fernando Balvin (140/190 cartas)"));
        amigos.add(new Amigo("(Bolivia) Guillermo Perez (49/190 cartas)"));
        amigos.add(new Amigo("(Perú) Agustín Paniagua (170/190 cartas)"));
        amigos.add(new Amigo("(Perú) Carmelo Velgar (05/190 cartas)"));
        amigos.add(new Amigo("(Perú) Fernando Balvin (140/190 cartas)"));
        amigos.add(new Amigo("(Bolivia) Guillermo Perez (49/190 cartas)"));
        amigos.add(new Amigo("(Perú) Agustín Paniagua (170/190 cartas)"));
        amigos.add(new Amigo("(Perú) Carmelo Velgar (05/190 cartas)"));
        amigos.add(new Amigo("(Perú) Fernando Balvin (140/190 cartas)"));
        amigos.add(new Amigo("(Bolivia) Guillermo Perez (49/190 cartas)"));
        amigos.add(new Amigo("(Perú) Agustín Paniagua (170/190 cartas)"));
        amigos.add(new Amigo("(Perú) Carmelo Velgar (05/190 cartas)"));
        return amigos;
    }

    private class AmigosHolder extends RecyclerView.ViewHolder{
        private TextView mDescripcion;

        public AmigosHolder(View itemView) {
            super(itemView);

            mDescripcion = (TextView) itemView.findViewById(R.id.descripcionAmigo);

        }

        public void bindData(Amigo amigo){
            mDescripcion.setText(amigo.getDescripcion());
        }

    }

    private class AmigosAdapter extends RecyclerView.Adapter<AmigosHolder>{

        private List<Amigo> mAmigos;

        public AmigosAdapter (List<Amigo> amigos){
            mAmigos = amigos;
        }

        @Override
        public AmigosHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.item_amigo, parent, false);

            return new AmigosHolder(view);
        }

        @Override
        public void onBindViewHolder(AmigosHolder holder, int position) {
            Amigo amigo = mAmigos.get(position);
            holder.bindData(amigo);
        }

        @Override
        public int getItemCount() {
            return mAmigos.size();
        }
    }


}
