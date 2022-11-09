package space.beka.editcolor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.beka.editcolor.R
import space.beka.editcolor.databinding.FragmentFirsrBinding
import space.beka.editcolor.models.Color

class FirsrFragment : Fragment() {
    lateinit var binding:FragmentFirsrBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirsrBinding.inflate(layoutInflater)

        binding.btnEdtColor.setOnClickListener {
            val blankFragmentBlank2 = SecondFragment()
            val fragmentManager = parentFragmentManager
            val transaction = fragmentManager.beginTransaction()

            transaction.replace(R.id.myContainer, blankFragmentBlank2)
            transaction.commit()
        }
        binding.second.background = Color.color
        return binding.root
    }
}