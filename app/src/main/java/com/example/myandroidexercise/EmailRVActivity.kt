package com.example.myandroidexercise

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EmailRVActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_recycler_view)

        val items = arrayListOf<EmailModel>(
            EmailModel("DaZ", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            EmailModel("SomeoneUdonotknow", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            EmailModel("grizie", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            EmailModel("Luffy", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            EmailModel("TheGreatGasby", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            EmailModel("Nobody", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            EmailModel("Hackerlord", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            EmailModel("faker", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            EmailModel("yourBestfriendGF", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            EmailModel("DaZ", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
        )

        val adapter = RVEmailItemAdapter(items)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        findViewById<Button>(R.id.button_add).setOnClickListener {
            items.add(0, EmailModel("Somebody", "New email", "Check add new Email"))
            adapter.notifyItemInserted(0)
            recyclerView.scrollToPosition(0)
        }

        findViewById<Button>(R.id.button_remove).setOnClickListener {
            items.removeAt(0)
            adapter.notifyItemRemoved(0)
        }

        /*findViewById<Button>(R.id.button_update).setOnClickListener {
            items[0].caption = "Updated Item"
            adapter.notifyItemChanged(0)
        }*/
    }
}