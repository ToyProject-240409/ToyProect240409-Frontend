package smu.it.toyproect240409_frontend.news

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import smu.it.toyproect240409_frontend.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {

    private var _binding: ActivityNewsBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityNewsBinding.inflate(layoutInflater)
        val root: View = binding.root
        setContentView(root)

        // 지금 인기있는 소식 리사이클러뷰
        val popularNewsRv : RecyclerView = binding.popularNewsRecyclerView

        val popularNewsItems = ArrayList<String> ()
        popularNewsItems.add("text")

        val popularNewsRvAdapter = PopularNewsRVAdapter(popularNewsItems)
        popularNewsRv.adapter = popularNewsRvAdapter

        // 최근 소식 리사이클러뷰
        val recentNewsRv : RecyclerView = binding.recentNewsRecyclerView

        val recentNewsItems = ArrayList<String> ()
        recentNewsItems.add("text")

        val recentNewsRvAdapter = RecentNewsRVAdapter(recentNewsItems)
        recentNewsRv.adapter = recentNewsRvAdapter

        // 화면 이동 - CheckContentsActivity
        binding.buttonMoveToDetailNews.setOnClickListener{
            val intent = Intent(this, CheckContentsActivity::class.java)
            startActivity(intent)
        }

        // 화면 이동 - WritePostActivity
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