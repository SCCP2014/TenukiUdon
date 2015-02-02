package org.example.komatsuryoya.karaokedb;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.j256.ormlite.android.AndroidConnectionSource;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.list);
        CustomData item = new CustomData();

        ConnectionSource connectionSource = new AndroidConnectionSource(new KaraokeBookDBHelper(this));
        Dao<SongInfo, Integer> dao = null;
        try {
            DaoManager.createDao(connectionSource, SongInfo.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
      try {
            List<SongInfo> songs = dao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        while () {
            // データの作成
            List<CustomData> objects = new ArrayList<>();

            item.setName("qwerty");
            item.setArtist("qwerty2");
            item.setLRange("low");
            item.setHRange("high");

            objects.add(item);
            CustomAdapter customAdapter = new CustomAdapter(this, 0, objects);
            listView.setAdapter(customAdapter);
        /**}*/
    /**    try {
            connectionSource.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}