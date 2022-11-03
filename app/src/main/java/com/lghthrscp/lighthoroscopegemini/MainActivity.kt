package com.lghthrscp.lighthoroscopegemini

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        week.setOnClickListener{
            txtHoro.text = " Thursday is a great day for new friendships to bloom when Venus in Leo trines Jupiter in Aries. Your conversational skills help you break the ice with anyone you meet. Chat people up, Gemini. You might even discover some hot gossip you can indulge in."
        }

        today.setOnClickListener{
            txtHoro.text=" It won't be surprising if you're frustrated with a close friend or partner who's far less ambitious than you, Gemini. The energy in the air can emphasize your dynamic ways of reaching goals and achieving success. Others who are passive or fearful may be difficult for you to understand. Yet people have to do things in ways that are best for them. Try to be patient."
        }

        tomorrow.setOnClickListener{
            txtHoro.text = "Welcome to another great day, Gemini! The energy from the planetary aspects is positive and encouraging, especially when it comes to communicating and interacting with others. Take advantage of this. Get together with friends and family for a pleasant visit, if possible. Consider inviting people over for games or dinner or do it virtually if need be"
        }
    }
}