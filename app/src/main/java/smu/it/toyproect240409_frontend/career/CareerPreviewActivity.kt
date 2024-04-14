package smu.it.toyproect240409_frontend.career

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import smu.it.toyproect240409_frontend.databinding.ActivityCareerPreviewBinding

class CareerPreviewActivity : AppCompatActivity() {

    private var _binding: ActivityCareerPreviewBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCareerPreviewBinding.inflate(layoutInflater)
        val root: View = binding.root
        setContentView(root)

        binding.imagePreviewGed.setOnClickListener{
            val intent = Intent(this, CareerGedActivity::class.java)
            startActivity(intent)
        }

        binding.imagePreviewComputer.setOnClickListener{
            val intent = Intent(this, CareerComputerActivity::class.java)
            startActivity(intent)
        }

        binding.imagePreviewInterview.setOnClickListener{
            val intent = Intent(this, CareerInterviewActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}