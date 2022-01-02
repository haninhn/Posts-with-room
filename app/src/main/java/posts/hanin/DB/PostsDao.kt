package posts.hanin.DB

import androidx.room.*

@Dao //bach n3rfo il room ili hatha data acces object

interface PostsDao { //method for access to the table

    @Insert
    suspend  fun insertPost (post: PostsModel)

    @Query("SELECT * FROM posts_table ORDER BY id DESC")
    suspend fun getAllPosts(): List<PostsModel>?

    @Delete
    suspend fun deletePost(post: PostsModel?)

    @Update
    suspend fun updatePost(post: PostsModel?)

}