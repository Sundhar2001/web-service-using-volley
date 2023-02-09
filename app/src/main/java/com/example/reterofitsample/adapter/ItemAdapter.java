package com.example.reterofitsample.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reterofitsample.R;
import com.example.reterofitsample.model.ItemsDetails;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private Context mContext;
    private ArrayList<ItemsDetails> itemList;

    public ItemAdapter(Context mContext, ArrayList<ItemsDetails> itemList) {
        this.mContext = mContext;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemsDetails data = itemList.get(position);

        String imageUrl = data.getImgUrl();
        String creatorName = data.getCreator();
        int likeCount = data.getLikes();

        holder.creatorName.setText(creatorName);
        holder.likes.setText("Likes: " + likeCount);
        Picasso.get().load(imageUrl).fit().centerInside().into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView creatorName,likes;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view);
            creatorName = itemView.findViewById(R.id.creator_name);
            likes = itemView.findViewById(R.id.likes);
        }
    }
}
