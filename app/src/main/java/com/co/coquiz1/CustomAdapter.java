package com.co.coquiz1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Patrick Ian Co on 9/28/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<Android> android;
    ImageView androidLogo;
    TextView androidName;

    public CustomAdapter(Context context, List<Android> android) {
        this.context = context;
        this.android = android;
    }

    @Override
    public int getCount() {
        return android.size();
    }

    @Override
    public Object getItem(int i) {
        return android.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.row_layout, null);
        androidLogo = (ImageView) v.findViewById(R.id.displayLogo);
        androidName = (TextView) v.findViewById(R.id.androidName);

        androidName.setText(android.get(i).getVersion());
        androidLogo.setImageResource(android.get(i).getLogo());
        return v;
    }
}