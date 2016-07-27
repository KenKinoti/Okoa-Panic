package ke.co.wizart.okoapanic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ms Vee on 7/20/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "registration.db";
    public static final String TABLE_NAME = "user_table";
    public static final String COL_1 = "first_name";
    public static final String COL_2 = "last_name";
    public static final String COL_3 = "age";
    public static final String COL_4 = "weight";
    public static final String COL_5 = "condition";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
               db.execSQL("create table" + TABLE_NAME + ("first_name text, last_name text, age integer, weigh integer, condition text"));

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);

    }
}
