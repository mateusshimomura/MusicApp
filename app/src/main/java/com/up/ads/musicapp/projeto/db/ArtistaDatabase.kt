package com.up.ads.musicapp.projeto.db

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import kotlinx.coroutines.experimental.CoroutineScope
import kotlinx.coroutines.experimental.Dispatchers
import kotlinx.coroutines.experimental.IO
import kotlinx.coroutines.experimental.launch

@Database(entities = [Artista::class], version = 1)
abstract class ArtistaDatabase: RoomDatabase() {

    abstract fun ArtistaDao(): ArtistaDao

    companion object {

        @Volatile
        private var INSTANCE: ArtistaDatabase? = null
        fun getDatabase(context: Context, scope: CoroutineScope):ArtistaDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        ArtistaDatabase::class.java,
                        "artista-database"
                )
                        .fallbackToDestructiveMigration()
                        .build()
                INSTANCE = instance
                instance
            }
        }

//        private class FriendDatabaseCalback(
//                private val scope: CoroutineScope
//        ): RoomDatabase.Callback(){
//            override fun onOpen(db: SupportSQLiteDatabase) {
//                super.onOpen(db)
//                INSTANCE?.let { database ->
//                    scope.launch(Dispatchers.IO) {
//                        populaTabela(database.friendDAO())
//                    }
//                }
//            }
//
////            fun populaTabela(friendDao: FriendDao) {
//////                friendDao.deleteAll()
//////                friendDao.insert(Friend(id = 1, nome = "Mateus"))
//////                friendDao.insert(Friend(id = 2, nome = "Eduardo"))
//////                friendDao.insert(Friend(id = 3, nome = "Leonardo"))
//////                friendDao.insert(Friend(id = 4, nome = "Willian"))
////            }
//        }


    }

}