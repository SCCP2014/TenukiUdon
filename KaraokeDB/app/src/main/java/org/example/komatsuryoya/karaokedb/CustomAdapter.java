package org.example.komatsuryoya.karaokedb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Komatsu Ryoya on 2015/01/26.
 */
public class CustomAdapter extends ArrayAdapter<CustomData> {
    private LayoutInflater layoutInflater_;

    public CustomAdapter(Context context, int textViewResourceId, List<CustomData> objects) {
        super(context, textViewResourceId, objects);
        layoutInflater_ = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 特定の行(position)のデータを得る
        CustomData item = (CustomData)getItem(position);

        // convertViewは使い回しされている可能性があるのでnullの時だけ新しく作る
        if (null == convertView) {
            convertView = layoutInflater_.inflate(R.layout.row_layout, null);
        }

        // CustomDataのデータをViewの各Widgetにセットする
        TextView textView1;
        textView1 = (TextView)convertView.findViewById(R.id.songName);
        textView1.setText(item.getName());

        TextView textView2;
        textView2 = (TextView)convertView.findViewById(R.id.songArtist);
        textView2.setText(item.getArtist());

        TextView textView3;
        textView3 = (TextView)convertView.findViewById(R.id.songRange);
        textView3.setText(item.getLRange() + "\n▼\n" + item.getHRange());

        return convertView;
        }
}
