package se.ju.friendos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val friendsListView = findViewById<ListView>(R.id.friends_list_view)

        friendsListView.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            friends
        )

        friendsListView.setOnItemClickListener { adapterView, view, i, l ->
            val friendId = i + 1

            startActivity(
                Intent(this, ViewFriendActivity::class.java).apply{
                    putExtra(EXTRA_FRIEND_ID, friendId)
                }
            )

        }

    }
}