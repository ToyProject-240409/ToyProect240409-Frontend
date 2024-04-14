package smu.it.toyproect240409_frontend.career

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import smu.it.toyproect240409_frontend.career.dialog.ApplyDialog
import smu.it.toyproect240409_frontend.databinding.ActivityCareerComputerBinding

class CareerComputerActivity : AppCompatActivity() {

    private var _binding: ActivityCareerComputerBinding? = null

    private val binding get() = _binding!!

    private var applyDialog: ApplyDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCareerComputerBinding.inflate(layoutInflater)
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