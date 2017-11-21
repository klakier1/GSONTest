package pl.klakier.gson.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import pl.klakier.gson.R;
import pl.klakier.gson.ResponseCarJSON;

/**
 * Created by Łukasz on 2017-11-08.
 */

public class CustomCarListAdapter extends BaseAdapter {

    List<ResponseCarJSON.ItemsBean> list;
    Context mContext;
    LayoutInflater inflater;
    String empty = "*****";

    public CustomCarListAdapter(Context mContext, List<ResponseCarJSON.ItemsBean> list) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View rowView = view;
        ViewHolder viewHolder;

        if (rowView == null) {
            inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.single_item2, viewGroup, false);

            viewHolder = new ViewHolder(rowView);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        ResponseCarJSON.ItemsBean item = (ResponseCarJSON.ItemsBean) getItem(i);

        if (item != null) {
            //Set name
            String name;
            if ((name = item.getName()) != null) {
                viewHolder.label.setText(name);
            } else {
                viewHolder.label.setText(empty);
            }

            //Set image
            String url;
            if ((url = item.getUrl()) != null) {
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.placeholder(android.R.drawable.stat_sys_download);
                requestOptions.error(android.R.drawable.stat_notify_error);
                requestOptions.fitCenter();
                Glide.with(mContext).load(url).apply(requestOptions).into(viewHolder.logo);
            } else {
                viewHolder.logo.setImageResource(android.R.drawable.stat_notify_error);
            }

        } else {
            viewHolder.logo.setImageResource(android.R.drawable.stat_notify_error);
            viewHolder.label.setText(empty);
        }

        return rowView;
    }

    class ViewHolder {

        ImageView logo;
        TextView label;

        ViewHolder(View v) {
            logo = v.findViewById(R.id.iv_logo);
            label = v.findViewById(R.id.tv_label);
        }
    }
}

