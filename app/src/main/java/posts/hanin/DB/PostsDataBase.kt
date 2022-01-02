package posts.hanin.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [PostsModel::class], version = 2)
abstract class PostsDataBase: RoomDatabase(){
    abstract fun  postDao(): PostsDao? //3rfna il daà

    companion object {
        private var INSTANCE: PostsDataBase?= null  //rk7na il instance li chnb9aw nist3mlo faha dima

//        val migration_1_2: Migration = object: Migration(1, 2) {
//            override fun migrate(database: SupportSQLiteDatabase) {
//                database.execSQL("ALTER TABLE userinfo ADD COLUMN phone TEXT DEFAULT ''")
//            }
//        }

        fun getAppDatabase(context: Context): PostsDataBase? {

            if(INSTANCE == null ) {

                INSTANCE = Room.databaseBuilder<PostsDataBase>(
                    context.applicationContext, PostsDataBase::class.java, "posts_database"
                )
                    .fallbackToDestructiveMigration()  //m3naha kan 3mlna modificatio nwla zidna 7ajat 3al database myfs5ch il 9dima
                    .build()  //roombulder

            }
            return INSTANCE
        }
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}