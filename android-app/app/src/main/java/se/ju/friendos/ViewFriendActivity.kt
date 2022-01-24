package se.ju.friendos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val EXTRA_FRIEND_ID = "FRIEND_ID"

class ViewFriendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_view_friend)

        val friendId = intent.getIntExtra(EXTRA_FRIEND_ID, -1)

        val friend = friends.find {
            it.id == friendId
        }!!

        val friendNameTextView = findViewById<TextView>(R.id.friend_name_text_view)

        friendNameTextView.text = friend.name

    }
}