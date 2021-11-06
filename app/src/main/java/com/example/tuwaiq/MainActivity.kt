package com.example.tuwaiq

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tuwaiq.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.hash.setOnClickListener{
            val intent = Intent(this, HashTagActivity::class.java)
            this.startActivity(intent)
        }
        binding.link.setOnClickListener{
            gotoUrl("https://satr.codes/")
        }
        binding.mediaCard.setOnClickListener{
            val intent = Intent(this, ShowImageActivity::class.java)
            this.startActivity(intent)
        }
        binding.tweetWebApp.setOnClickListener{
            gotoUrl("https://help.twitter.com/en")
        }
    }

    private fun gotoUrl(str: String) {
        val uri = Uri.parse(str)
        startActivity(Intent(Intent.ACTION_VIEW, uri))

    }

}

/*

val url = "http://www.example.com"
val i = Intent(Intent.ACTION_VIEW)
i.data = Uri.parse(url)
startActivity(i)

        ----------
val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.example.com"))
startActivity(i)*/
