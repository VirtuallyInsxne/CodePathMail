package com.example.codepathmail

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    lateinit var emails: List<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.codepathmail)

        // Lookup the RecyclerView in activity layout
        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)
        // Fetch the list of emails
        emails = EmailFetcher.getEmails()
        // Create adapter passing in the list of emails
        val adapter = EmailAdapter(emails)
        // Attach the adapter to the RecyclerView to populate items
        emailsRv.adapter = adapter
        // Set layout manager to position the items
        emailsRv.layoutManager = LinearLayoutManager(this)
    }
}