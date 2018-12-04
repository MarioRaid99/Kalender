package com.example.opilane.kalender.dal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper{

    public static final String NOTABLE_NAME = "notes";
    public static final int NOCOLUMN_ID = 0;
    public static final int NOCOLUMN_DATE = 1;
    public static final int NOCOLUMN_TITLE = 2;
    public static final int NOCOLUMN_TEXT = 3;
    public static final String [] NOTABLE_COLUMNS = new String[] {"id","date","title", "text"};

    public static final String APTABLE_NAME = "appointments";
    public static final int APCOLUMN_ID = 0;
    public static final int APCOLUMN_DATE1 = 1;
    public static final int APCOLUMN_TIME1 = 2;
    public static final int APCOLUMN_DATE2 = 3;
    public static final int APCOLUMN_TME2 = 4;
    public static final int APCOLUMN_TEXT = 5;
    public static final int APCOLUMN_SAVE = 6;
    public static final String[] APTABLE_COLUMNS = new String[] {
            "id", "date1", "time1", "date2", "time2", "text", "save"
    };

    public static final String ANTABLE_NAME = "anniversaries";
    public static final int ANCOLUMN_ID = 0;
    public static final int ANCOLUMN_MONTH = 1;
    public static final int ANCOLUMN_DAY = 2;
    public static final int ANCOLUMN_YEAR1 = 3;
    public static final int ANCOLUMN_YEAR2 = 4;
    public static final int ANCOLUMN_NAME = 5;
    public static final String[]ANTABLE_COLUMNS = new String[]{
            "id", "month","day","year1","year2","name"
    };
    private static final String DBFILENAME = "calendar.db";
    private static final int DBVERSION = 1;

    private static final String NOINITIAL_SCHEMA = "create table notes (id integer primary key " + "autoincrement, date varchar (10) not null, title varchar(100) not null , text text)";
    private static final String APININTIAL_SCHEMA = "create table appointments(id integer primary key" + "autoincrement, date 1 varchar(10) not null, time1 varchar(8) not null," + "date2 varchar(10) not null, time 2 varchar (8) not null, text varchar (100) not null save int";
    private static final String ANININITIAL_SCHEMA = "create table anniversaries ( id integer primary key " + "autoincrement , month int not null , day int not null, year1 int default /1583), year2 int, "+ "name varchar(100)= not null )";

    public DbHelper(Context context,) {
        super(context,DBFILENAME, factory: null, DBVERSION);
        this.context = context;
    }



    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NOINITIAL_SCHEMA);
        db.execSQL(ANININITIAL_SCHEMA);
        db.execSQL(ANININITIAL_SCHEMA);

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
