package org.example.komatsuryoya.karaokedb;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Komatsu Ryoya on 2015/01/27.
 */
public class ListBuilder extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // データの作成
        List<CustomData> objects = new ArrayList<CustomData>();
        CustomData item1 = new CustomData();
        item1.setName("Daydream cafe");
        item1.setArtist("Various artist");
        item1.setHRange("HiF");
        item1.setLRange("midD");
        item1.setDifficulty(5);

        objects.add(item1);

        CustomAdapter customAdapter = new CustomAdapter(this, 0, objects);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(customAdapter);
    }
}