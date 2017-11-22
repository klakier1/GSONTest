package pl.klakier.gson.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import pl.klakier.gson.R;
import pl.klakier.gson.ResponseCarJSON;

/**
 * Created by Łukasz on 2017-11-22.
 */

public class CustomCarRecycleViewAdapter extends RecyclerView.Adapter<CustomCarRecycleViewAdapter.CarViewHolder> {

    Context mContext;
    LayoutInflater mLayoutInflater;
    List<ResponseCarJSON.ItemsBean> mItemsBeans;
    RequestOptions mRequestOptions = new RequestOptions();
    String empty = "*****";


    public CustomCarRecycleViewAdapter(Context context, List<ResponseCarJSON.ItemsBean> list) {
        mContext = context;
        mItemsBeans = list;
        mLayoutInflater = LayoutInflater.from(mContext);
        mRequestOptions.placeholder(android.R.drawable.stat_sys_download);
        mRequestOptions.error(android.R.drawable.stat_notify_error);
        mRequestOptions.fitCenter();
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.single_item2, parent, false);
        CarViewHolder carViewHolder = new CarViewHolder(view);
        return carViewHolder;

    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        ResponseCarJSON.ItemsBean item = (ResponseCarJSON.ItemsBean) mItemsBeans.get(position);

        if (item != null) {
            //Set name
            String name;
            if ((name = item.getName()) != null) {
                holder.label.setText(name);
            } else {
                holder.label.setText(empty);
            }

            //Set image
            String url;
            if ((url = item.getUrl()) != null) {
                Glide.with(mContext).load(url).apply(mRequestOptions).into(holder.logo);
            } else {
                holder.logo.setImageResource(android.R.drawable.stat_notify_error);
            }

        } else {
            holder.logo.setImageResource(android.R.drawable.stat_notify_error);
            holder.label.setText(empty);
        }
    }

    @Override
    public int getItemCount() {
        return mItemsBeans.size();
    }


    class CarViewHolder extends RecyclerView.ViewHolder {

        ImageView logo;
        TextView label;

        public CarViewHolder(View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.iv_logo);
            label = itemView.findViewById(R.id.tv_label);
        }


    }

}


