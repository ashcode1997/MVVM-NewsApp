package com.androiddevs.mvvmnewsapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.androiddevs.mvvmnewsapp.models.ArticlesItem

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(articlesItem: ArticlesItem):Long

    @Query("SELECT * FROM articles")
    fun getAllArticles() : LiveData<List<ArticlesItem>>

    @Delete
    suspend fun deleteArticles(article : ArticlesItem)

}