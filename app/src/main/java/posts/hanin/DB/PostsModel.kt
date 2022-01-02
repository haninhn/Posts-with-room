package posts.hanin.DB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "posts_table")  //Entity is for change the class to table
data class PostsModel (
        @PrimaryKey(autoGenerate = true)
        val ID : Int = 0,
        val userId: Int,
        var title: String= "",
        //@Ignore is for ignore entity from the table
        var body: String="",
        )