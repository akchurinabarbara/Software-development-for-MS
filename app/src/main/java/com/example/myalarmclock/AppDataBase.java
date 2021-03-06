package com.example.myalarmclock;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {AlarmData.class}, version = 1)
public abstract class AppDataBase  extends RoomDatabase {
    public abstract AlarmDAO alarmDAO();

}

