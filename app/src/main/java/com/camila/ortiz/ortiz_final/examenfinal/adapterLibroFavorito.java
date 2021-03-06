package com.camila.ortiz.ortiz_final.examenfinal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.camila.ortiz.ortiz_final.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

public class adapterLibroFavorito extends RecyclerView.Adapter<adapterLibroFavorito.userViewHolder> {


    List<libro> libroList;

    public adapterLibroFavorito(List<libro> libroList) {
        this.libroList = libroList;

    }

    @NonNull
    @Override
    public userViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_libros, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull userViewHolder holder, int position) {

        libro user = libroList.get(position);
        holder.nameUser.setText(user.getTitulo());

        Picasso.get()
                .load(user.getImagen())
                .into(holder.imageUser, new Callback() {
                    @Override
                    public void onSuccess() {
                        holder.imageUser.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        holder.imageUser.setVisibility(View.VISIBLE);
                        holder.imageUser.setImageResource(R.drawable.ic_launcher_background);
                    }
                });
    }

    @Override
    public int getItemCount() {
        return libroList.size();
    }

    static class userViewHolder extends RecyclerView.ViewHolder {

        TextView nameUser;

        ImageView imageUser;
        LinearLayout linearLayoutDetail;

        public userViewHolder(@NonNull View itemView) {
            super(itemView);
            nameUser = itemView.findViewById(R.id.name_user);

            imageUser = itemView.findViewById(R.id.image_user);
            linearLayoutDetail = itemView.findViewById(R.id.linearLayout_detail);
        }
    }
}
