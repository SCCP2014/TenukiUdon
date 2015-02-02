package org.example.komatsuryoya.karaokedb;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.j256.ormlite.dao.Dao;
import java.util.List;

/**
 * Created by Komatsu Ryoya on 2015/01/29.
 */
public abstract class InfoManipulator extends Context {

    public List<SongInfo> findAll() {
        KaraokeBookDBHelper helper = new KaraokeBookDBHelper(this);
        try {
            Dao<SongInfo, Integer> dao = helper.getDao(SongInfo.class);
            return dao.queryForAll();
        } catch (Exception e) {
            String TAG1 = "find_exception";
            Log.e(TAG1, "例外が発生しました", e);
            return null;
        } finally {
            helper.close();
        }
    }

    public void save(SongInfo info) {
        KaraokeBookDBHelper helper = new KaraokeBookDBHelper(this);
        try {
            Dao<SongInfo, Integer> dao = helper.getDao(SongInfo.class);
            dao.createOrUpdate(info);
        } catch (Exception e) {
            String TAG2 = "save_exception";
            Log.e(TAG2, "例外が発生しました", e);
        } finally {
            helper.close();
        }
    }

    @Override
    public void sendBroadcast(Intent intent, String receiverPermission) {

    }
}