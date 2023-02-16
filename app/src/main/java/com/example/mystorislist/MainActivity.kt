package com.example.mystorislist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.mystorislist.model.Comment
import com.example.mystorislist.model.StoryModel
import com.example.mystorislist.view.SnappyStoryListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        snap_view.load(
            arrayListOf(
                StoryModel(R.drawable.ic_launcher_foreground, 3, "234"),
                StoryModel(R.drawable.ic_launcher_background, 3, "2344"),
                StoryModel(R.drawable.ic_launcher_foreground, 4, "2346757"),
                StoryModel(R.drawable.ic_launcher_background, 3, "comments234"),
                StoryModel(R.drawable.ic_launcher_foreground, 3, "comments234"),
                StoryModel(R.drawable.ic_launcher_background, 3, "comments234"),
                StoryModel(R.drawable.ic_launcher_foreground, 3, "comments234"),
                StoryModel(R.drawable.ic_launcher_background, 3, "comments234"),
                StoryModel(R.drawable.ic_launcher_background, 3, "commentsefwe"),
                StoryModel(R.drawable.ic_launcher_foreground, 3, "comments3")
            ),
            object : SnappyStoryListener {
                override fun onAllFinished() {
                }

                override fun onFinished(index: Int) {
                }

                override fun setImageFor(index: Int, story: StoryModel?, imageView: ImageView) {
                    // Extra Functionality
                }

                override fun onStart() {
                    // pre-load images
                }
            }
        )
    }
}