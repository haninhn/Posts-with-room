package posts.hanin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import posts.hanin.DB.PostsDataBase
import posts.hanin.DB.PostsModel

class MainActivity : AppCompatActivity() {
    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val postDataBase =  PostsDataBase.getAppDatabase(this)

        postDataBase?.postDao()?.insertPost( PostsModel(1,1,"lol","test test"))
    }
}