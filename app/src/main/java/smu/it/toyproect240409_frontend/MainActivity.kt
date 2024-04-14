package smu.it.toyproect240409_frontend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import smu.it.toyproect240409_frontend.career.CareerPreviewActivity
import smu.it.toyproect240409_frontend.career.CareerRVAdapter
import smu.it.toyproect240409_frontend.databinding.ActivityMainBinding
import smu.it.toyproect240409_frontend.news.NewsActivity
import smu.it.toyproect240409_frontend.news.PopularNewsRVAdapter

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val root: View = binding.root
        setContentView(root)

        // 커리어 데이터 리사이클러뷰
        val careerRv : RecyclerView = binding.careerRecyclerView

        val carrerItems = ArrayList<String>()
        carrerItems.add("image")

        val careerRvAdapter = CareerRVAdapter(carrerItems)
        careerRv.adapter = careerRvAdapter

        // 소식 확인하기 리사이클러뷰
        val newsRv : RecyclerView = binding.popularNewsRecyclerView

        val newsItems = ArrayList<String> ()
        newsItems.add("text")

        val newsRvAdapter = PopularNewsRVAdapter(newsItems)
        newsRv.adapter = newsRvAdapter

        // 화면 전환 -  커리어 페이지로 이동

        binding.buttonMoveToCareer.setOnClickListener{
            val intent = Intent(this, CareerPreviewActivity::class.java)
            startActivity(intent)
        }

        // 화면 전환 - 소식 확인하기 페이지로 이동

        binding.buttonCheckNews.setOnClickListener{
            val intent = Intent(this, NewsActivity::class.java)
            startActivity(intent)
        }

        binding.buttonMoveToNews.setOnClickListener{
            val intent = Intent(this, NewsActivity::class.java)
            startActivity(intent)
        }

        // 뷰페이저2
        binding.viewPagerDeclaration.adapter = NewsDeclarationViewPagerAdapter(getDeclarationList(), this) // 어댑터 생성
        // 가로 방향
        binding.viewPagerDeclaration.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        binding.indicatorDeclaration.setViewPager(binding.viewPagerDeclaration)
    }

    private fun getDeclarationList(): ArrayList<Int> {
        return arrayListOf<Int>(R.layout.declaration_list_item1, R.layout.declaration_list_item2, R.layout.declaration_list_item3)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}