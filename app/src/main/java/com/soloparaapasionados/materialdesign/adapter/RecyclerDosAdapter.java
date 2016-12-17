package com.soloparaapasionados.materialdesign.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.soloparaapasionados.materialdesign.R;
import com.soloparaapasionados.materialdesign.model.Animal;

import java.util.List;

/**
 * Created by USUARIO on 17/12/2016.
 */

public class RecyclerDosAdapter extends RecyclerView.Adapter<RecyclerDosAdapter.MyViewHolder> {

    private static final String TAG = RecyclerDosAdapter.class.getSimpleName();

    private List<Animal> mData;
    private LayoutInflater mInflater;

    public RecyclerDosAdapter(Context context, List<Animal> data) {
        this.mData = data;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_item_dos, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Animal currentObj = mData.get(position);
        holder.setData(currentObj);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView imgThumb;

        public MyViewHolder(View itemView) {
            super(itemView);
            title       = (TextView)  itemView.findViewById(R.id.txv_row);
            imgThumb    = (ImageView) itemView.findViewById(R.id.img_row);
        }

        public void setData(Animal current) {
            this.title.setText(current.getTitle());
            this.imgThumb.setImageResource(current.getImageId());
        }
    }
}
