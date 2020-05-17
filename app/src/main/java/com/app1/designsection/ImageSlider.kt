package com.app1.designsection

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ImageSlider : AppCompatActivity() {

    // store the images
    var images = arrayOf(R.drawable.slide_1, R.drawable.slide_2, R.drawable.slide_3, R.drawable.slide_4)
    var index = 0
    lateinit var imageSlide:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_slider)

        imageSlide = findViewById<ImageView>(R.id.image_slide)
        var next_btn = findViewById<Button>(R.id.next_btn)
        var previous_btn = findViewById<Button>(R.id.previous_btn)

        next_btn.setOnClickListener{
            nextImage()
        }
        previous_btn.setOnClickListener{
            previousImage()
        }
    }

    fun nextImage(){
        if(index==images.size-1){
            index = -1
        }

        index = index + 1
        imageSlide.setImageResource(images[index])

    }

    fun previousImage(){
        if (index == 0){
            index = images.size
        }
        index = index -1

        imageSlide.setImageResource(images[index])


    }
}
