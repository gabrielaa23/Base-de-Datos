package com.bibliosearch.libros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;




public class Adaptador extends RecyclerView.Adapter<Adaptador.UsuarioViewHolder> {

    Context context;
    List<Libros> listadLibros;

    public Adaptador(Context context , List<Libros> listadLibros) {
        this.context = context;
        this.listadLibros = listadLibros;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_usuario, viewGroup, false);
        return new UsuarioViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder usuarioViewHolder, int i) {
        usuarioViewHolder.txtNombre.setText(listadLibros.get(i).getNombre());
        usuarioViewHolder.txtCategoria.setText(listadLibros.get(i).getCategoria());
        usuarioViewHolder.txtContenido.setText(listadLibros.get(i).getContenido());
    }

    @Override
    public int getItemCount() {
        return listadLibros.size();
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombre, txtCategoria, txtContenido;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtContenido = itemView.findViewById(R.id.txtContenido);
            txtCategoria = itemView.findViewById(R.id.txtCategoria);

        }
    }

    public void filtrar(ArrayList<Libros> filtroUsuarios) {
        this.listadLibros = filtroUsuarios;
        notifyDataSetChanged();
    }
}

