package com.example.i_am_rich_2022

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // initial image ( diamond)
    private val DEFAULT_IMAGE = 0
    // change to image(cat)
    private val CHANGE_IMAGE = 1
    // show image status
    private var IMAGE_STATUS = -1

    private var imageDiamond: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageDiamond = findViewById(R.id.diamond_image)

        //initial image set to app
        IMAGE_STATUS = DEFAULT_IMAGE
        setViewImage()

        // click to change image when diamond image
        imageDiamond!!.setOnClickListener {
            // update image
            setViewImage()
        }
    }

    /**
     * setViewImage()
     * Set to view image when start app and click image
     */
    fun setViewImage(){
        val textMessage:TextView = findViewById(R.id.textView)

        when(IMAGE_STATUS){
            // initial show image
            DEFAULT_IMAGE -> {
                // image and text message setting
                imageDiamond!!.setImageResource(R.drawable.diamond_gd7b249d51_1280)
                textMessage.setText(resources.getString(R.string.rich_card_diamond_name))
                textMessage.setTextColor(Color.WHITE)

                //status change
                IMAGE_STATUS = CHANGE_IMAGE
            }

            // changet to image when click
            CHANGE_IMAGE -> {
                // image and text message setting
                imageDiamond!!.setImageResource(R.drawable.sleep_cat)
                textMessage.setText(resources.getString(R.string.rich_card_cat_name))
                textMessage.setTextColor(Color.BLACK)

                //status change
                IMAGE_STATUS = DEFAULT_IMAGE
            }
        }
    }//<< fun

}