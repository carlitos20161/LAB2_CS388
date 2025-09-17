package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emails = EmailFetcher.getEmails()

        val rv = findViewById<RecyclerView>(R.id.emailsRv)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MailListAdapter(emails)
    }
}
