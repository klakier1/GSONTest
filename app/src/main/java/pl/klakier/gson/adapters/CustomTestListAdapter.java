package pl.klakier.gson.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import pl.klakier.gson.R;
import pl.klakier.gson.ResponseTestJSON;

/**
 * Created by Łukasz on 2017-11-05.
 */

public class CustomTestListAdapter extends BaseAdapter {

    List<ResponseTestJSON.MenuBean.ItemsBean> list;
    Context mContext;
    LayoutInflater inflater;
    String empty = "*****";

    public CustomTestListAdapter(Context mContext, List<ResponseTestJSON.MenuBean.ItemsBean> list) {
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
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View rowView = view;
        ViewHolder viewHolder;
        if (rowView == null) {
            inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.single_item, viewGroup, false);

            viewHolder = new ViewHolder();
            viewHolder.id = rowView.findViewById(R.id.item_id);
            viewHolder.label = rowView.findViewById(R.id.item_label);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        ResponseTestJSON.MenuBean.ItemsBean item = (ResponseTestJSON.MenuBean.ItemsBean) getItem(i);

        if (item != null) {
            if (item.getId() != null)
                viewHolder.id.setText(item.getId());
            else
                viewHolder.id.setText(empty);

            if (item.getLabel() != null)
                viewHolder.label.setText(item.getLabel());
            else
                viewHolder.label.setText(empty);
        } else {
            viewHolder.id.setText(empty);
            viewHolder.label.setText(empty);
        }

        return rowView;
    }

    static class ViewHolder {
        TextView id;
        TextView label;
    }
}
