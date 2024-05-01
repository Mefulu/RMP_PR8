package com.example.myapplication_pr8.UI.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;
import android.util.Log;
import com.example.myapplication_pr8.DATA.Model.DataListRecycler;
import com.example.myapplication_pr8.R;
import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>{
    private final static String TAG = "N_Tag";
    private final LayoutInflater inflater;
    private static Context parent;
    private final ArrayList<DataListRecycler> items;
    public MyRecyclerAdapter(Context context, ArrayList<DataListRecycler> items) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
        this.parent = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataListRecycler item = items.get(position);
        holder.text.setText(item.getName());
        holder.image.setImageDrawable(inflater.getContext().getDrawable(R.drawable.flower));
        holder.layout.setOnClickListener(view -> {
            Toast.makeText(inflater.getContext(), item.getName(), Toast.LENGTH_LONG).show();
            Log.d(TAG, item.getName());
            Bundle bundle = new Bundle();
            bundle.putInt("itemID", item.getImage());
        });
    }

    @Override
    public int getItemCount(){
        return items.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text;
        public ImageView image;
        public ViewGroup layout;
        public ViewHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.item_list_text_view);
            image = itemView.findViewById(R.id.item_list_image_view);
            layout = itemView.findViewById(R.id.item_root_container);
        }
    }
}