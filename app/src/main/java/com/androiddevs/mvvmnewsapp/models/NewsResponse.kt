package com.androiddevs.mvvmnewsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.androiddevs.mvvmnewsapp.db.Converters

data class NewsResponse(
	val totalResults: Int? = null,
	val articles: List<ArticlesItem?>? = null,
	val status: String? = null
)

@Entity(tableName = "articles")
@TypeConverters(Converters::class)
data class ArticlesItem(
	@PrimaryKey(autoGenerate = true)
	var id:Int? = null,
	val publishedAt: String? = null,
	val author: String? = null,
	val urlToImage: String? = null,
	val description: String? = null,
	val source: Source,
	val title: String? = null,
	val url: String? = null,
	val content: String? = null
)

data class Source(
	val name: String,
	val id: String
)

