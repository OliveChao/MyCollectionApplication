package com.example.mycollection.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * 
 * @author olive chao
 * @date 22nd October,2013. Wednesday
 *
 */

public class SQLite extends SQLiteOpenHelper{
	
	    private static final String DATABASE_NAME = "MyCollectionDataBase";
		private static final int DATABASE_VERSION = 1;
		private static final String TABLE_USER_DETAILS = null;
		private static final String TABLE_COLUMN_FIRSTNAME = null;
		private static final String TABLE_COLUMN_LASTNAME = null;
		private static final String TABLE_COLUMN_EMAIL = null;
		private static final String TAG = null;

		/**
	     * The Constructor
	     * 
	     * @param context
	     * @param name
	     * @param factory
	     * @param version
	     */
	public SQLite(Context context, String name, CursorFactory factory, int version) {
		
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		/**
		 * Creating the database
		 */
		String createDb = "CREATE_TABLE" + TABLE_USER_DETAILS + "("
				+ TABLE_COLUMN_FIRSTNAME + "TEXT"
				+ TABLE_COLUMN_LASTNAME + "TEXT"
				+ TABLE_COLUMN_EMAIL + "TEXT);";
		
		db.execSQL(createDb);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		/**
		 * Upgrading the database
		 */
		Log.w(TAG, "Upgrade to new available version" + newVersion);
		
	}

}
