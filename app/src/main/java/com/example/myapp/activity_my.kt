package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.myactivity.*

class activity_my : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.myactivity)
    init()
}

    private fun init(){

        Glide.with(this).load("https://cdn.business2community.com/wp-content/uploads/2017/08/blank-profile-picture-973460_640.png")
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
            .circleCrop()
            .into(profileImageView)

        Glide.with(this)
            .load("https://cdn.seeklearning.com.au/media/images/career-guide/article/career-advice/web_images/blogs/214/2016/does_anyone_actually_read_cover_letters_940x485.jpg")
            .error(R.drawable.ic_launcher_background)
            .placeholder(R.drawable.ic_launcher_background)
            .into(coverImageView)
    }
}