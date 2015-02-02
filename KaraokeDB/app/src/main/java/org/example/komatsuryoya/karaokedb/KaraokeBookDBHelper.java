package org.example.komatsuryoya.karaokedb;

/**
 * Created by Komatsu Ryoya on 2015/01/22.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;


public class KaraokeBookDBHelper extends OrmLiteSqliteOpenHelper {

        private static final String DATABASE_NAME = "songs.db";
        private static final int DATABASE_VERSION = 1;

        public KaraokeBookDBHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
            // エンティティを指定してcreate tableします
            try {
                TableUtils.createTable(connectionSource, SongInfo.class);
            } catch (java.sql.SQLException e) {
                Log.e(KaraokeBookDBHelper.class.getName(), "データベースを作成できませんでした", e);
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i2) {
            // DBのアップグレード処理（今回は割愛）
        }
    }