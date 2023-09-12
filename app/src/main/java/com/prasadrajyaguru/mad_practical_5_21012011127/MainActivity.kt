package com.prasadrajyaguru.mad_practical_5_21012011127

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.core.text.parseAsHtml

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonBrowse:Button=findViewById(R.id.)
        val editUrl:EditText=findViewById(R.id.)
        buttonBrowse.setOnClickListener { Onbrowse(editUrl.text.toString()) }
    }
    fun Onbrowse(Url:String)
    {
        Intent(Intent.ACTION_VIEW, Uri.parse(Url)).also { startActivity(it) }
    }
    fun Oncall(Number:String)
    {
        Intent(Intent.ACTION_DIAL, Uri.parse(Number)).also { startActivity(it) }

    }
    fun Oncalllog()
    {
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also { startActivity(it) }
    }
    fun Gallery()
    {
        Intent(Intent.ACTION_VIEW).setType("Image").also { startActivity(it) }
    }
    fun Oncamera()
    {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {startActivity(it) }
    }
    fun Alarm()
    {
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also { startActivity(it) }
    }
}
