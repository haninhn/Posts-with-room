package posts.hanin.DB

import androidx.room.*

@Dao //bach n3rfo il room ili hatha data acces object

interface PostsDao { //method for access to the table

    @Insert
    suspend  fun insertPost (post: PostsModel)

    @Query("SELECT * FROM posts_table ORDER BY id DESC")
    fun getAllPosts(): List<PostsModel>?

    @Delete
    fun deletePost(post: PostsModel?)

    @Update
    fun updatePost(post: PostsModel?)

}