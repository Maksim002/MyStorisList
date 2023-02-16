package com.example.mystorislist.model

data class StoryModel(
    val image: Int = 0,
    val time: Int = 0,
    val comments: String
)

data class Comment(val header: String = "", val comment: String = "")