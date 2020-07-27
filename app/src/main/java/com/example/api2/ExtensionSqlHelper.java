package com.example.api2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.api2.Utilidades.Utilidades;

public class ExtensionSqlHelper extends SQLiteOpenHelper {

    public ExtensionSqlHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Utilidades.CREAR_TABLA_CODE);
        db.execSQL(Utilidades.CREAR_TABLA_TOKEN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int VersionNueva) {
        db.execSQL("DROP TABLE IF EXISTS user_token_code");
        db.execSQL("DROP TABLE IF EXISTS user_token_name");
        onCreate(db);

    }
}
