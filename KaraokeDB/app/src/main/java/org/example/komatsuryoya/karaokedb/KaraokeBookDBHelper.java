package org.example.komatsuryoya.karaokedb;

/**
 * Created by Komatsu Ryoya on 2015/01/22.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class KaraokeBookDBHelper extends SQLiteOpenHelper {

    // コンストラクタ
    public KaraokeBookDBHelper( Context context ){
        // 任意のデータベースファイル名と、バージョンを指定する
        super( context, "karaoke.db", null, 1 );
    }


    /**
     * このデータベースを初めて使用する時に実行される処理
     * テーブルの作成や初期データの投入を行う
     */
    @Override
    public void onCreate( SQLiteDatabase db ) {
        // テーブルを作成。SQLの文法は通常のSQLiteと同様
        db.execSQL(
                "create table song_info_table ("
                        + "_id  integer primary key autoincrement not null, "
                        + "song text not null, "
                        + "artist text not null, "
                        + "range_low text, "
                        + "range_high text, "
                        + "difficulty integer)" );
        // 必要なら、ここで他のテーブルを作成したり、初期データを挿入したりする
    }


    /**
     * アプリケーションの更新などによって、データベースのバージョンが上がった場合に実行される処理
     * 今回は割愛
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // 取りあえず、空実装でよい
    }

    // Helperを使用してデータベースを開く命令
    //KaraokeBookDBHelper dbHelper = new KaraokeBookDBHelper( context );
    //SQLiteDatabase db = dbHelper.getWritableDatabase();

    //insertion
    //db.execSQL( "insert into song_info_table(song,artist,range_low,range_high,difficulty)
    //  values('string',int,...)" );

    /** データを検索
    private String searchByHoge( SQLiteDatabase db, datatype data ){
        // Cursorを確実にcloseするために、try{}～finally{}にする
        Cursor cursor = null;
        try{
            cursor = db.query( "song_info_table",
                    new String[]{ ... },
                    "age = ?", new String[]{ "" ... },
                    null, null, null );

            // 検索結果をcursorから読み込んで返す
            return readCursor( cursor );
        }
        finally{
            // Cursorを忘れずにcloseする
            if( cursor != null ){
                cursor.close();
            }
        }
    }
     */


    /** 検索結果の読み込み
    private String readCursor( Cursor cursor ){
        String result = "";

        // まず、Cursorから取り出すためのインデクス値を確認しておく
        int indexData = cursor.getColumnIndex( "data" );
     ......

        // ↓のようにすると、検索結果の件数分だけ繰り返される
        while( cursor.moveToNext() ){
            // 検索結果をCursorから取り出す
            datatype data = cursor.getString( dataName );
            ...
            result = string;
        }
        return result;
    }
     */

    /** 削除
    private void delByData( SQLiteDatabase db, datatype data ){
        db.delete( "song_jnfo_table",
                "age = ?",
                new String[]{ "" + data } );
     }
    */

    /** データを更新 (idによって検索)
    private void updateEntry( SQLiteDatabase db, int targetId, datatype newdata ){
        // 更新内容はContentValuesに格納しておく
        ContentValues val = new ContentValues();
        val.put( "data", newData );

        // 更新するデータの条件はquery()やdelete()と同じように記述する
        db.update( "song_info_table",
                val,
                "data = ?",
                new String[]{ "" + targetId } );
    }
     */

}