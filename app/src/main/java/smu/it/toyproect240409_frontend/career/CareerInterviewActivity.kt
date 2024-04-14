package smu.it.toyproect240409_frontend.career

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import smu.it.toyproect240409_frontend.career.dialog.ApplyDialog
import smu.it.toyproect240409_frontend.databinding.ActivityCareerInterviewBinding

class CareerInterviewActivity : AppCompatActivity() {

    private var _binding: ActivityCareerInterviewBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCareerInterviewBinding.inflate(layoutInflater)
        val root: View = binding.root
        setContentView(root)

        binding.ButtonApply.setOnClickListener{
            val newFragment = ApplyDialog()
            newFragment.show(supportFragmentManager, "applyDialog")
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}