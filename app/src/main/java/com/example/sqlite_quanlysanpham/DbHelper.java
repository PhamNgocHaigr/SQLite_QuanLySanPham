package com.example.sqlite_quanlysanpham;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context) {
        super(context, "QuanLySanPham", null, 6);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE SanPham(MaSP INTEGER PRIMARY KEY AUTOINCREMENT, " + "TenSP TEXT, GiaTien REAL, Image TEXT)";
        db.execSQL(sql);
        String data = "INSERT INTO SanPham VALUES(1, 'Banh Mi', '1000', 'https://th.bing.com/th/id/R.5bef6908acefd6d439757f8d701ae1d9?rik=COKPKRfXZ2%2fiLQ&riu=http%3a%2f%2fwww.foodstylistvn.com%2fwp-content%2fuploads%2f2014%2f08%2fbanh-mi-thit-nuong-vietnam-food-stylist-1280-960.jpg&ehk=jbSlCg20au%2fBZ1f5NjSDpOY%2bnYROm1GqM6o1Pu2Vt6E%3d&risl=&pid=ImgRaw&r=0')," +
                "(2, 'Lau', '1000', 'https://www.chapter3d.com/wp-content/uploads/2020/06/anh-do-an.jpg')," +
                "(3, 'Bo Kobe', '1000', 'https://th.bing.com/th/id/OIP.E5ToALm4XSMd_22obpJpEAHaEK?rs=1&pid=ImgDetMain')";
        db.execSQL(data);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        if (i != i1){
            db.execSQL("DROP TABLE IF EXISTS SanPham");
            onCreate(db);
        }
    }
}