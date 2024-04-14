package smu.it.toyproect240409_frontend.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import smu.it.toyproect240409_frontend.databinding.ActivityWritePostBinding

class WritePostActivity : AppCompatActivity() {

    private var _binding: ActivityWritePostBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityWritePostBinding.inflate(layoutInflater)
        val root: View = binding.root
        setContentView(root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}