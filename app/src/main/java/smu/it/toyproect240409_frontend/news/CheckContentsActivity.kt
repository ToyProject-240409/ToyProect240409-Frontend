package smu.it.toyproect240409_frontend.news

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import smu.it.toyproect240409_frontend.databinding.ActivityCheckContentsBinding

class CheckContentsActivity : AppCompatActivity() {

    private var _binding: ActivityCheckContentsBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCheckContentsBinding.inflate(layoutInflater)
        val root: View = binding.root
        setContentView(root)

        // 댓글 리사이클러뷰
        val commentsRv : RecyclerView = binding.commentsRecyclerView

        val commentsItems = ArrayList<String> ()
        commentsItems.add("text")

        val commentsRvAdapter = CommentsRVAdapter(commentsItems)
        commentsRv.adapter = commentsRvAdapter

        // 게시글 작성 화면으로 이동
        binding.buttonWrite.setOnClickListener{
            val intent = Intent(this, WritePostActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}