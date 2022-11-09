package space.beka.editcolor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.beka.editcolor.R
import space.beka.editcolor.databinding.FragmentSecondBinding
import space.beka.editcolor.models.Color

class SecondFragment : Fragment() {
private lateinit var binding: FragmentSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        val firsrFragment = FirsrFragment()
        binding.apply {
            view1.setOnClickListener {
                Color.color = view1.background
            }
            view2.setOnClickListener {
                Color.color = view2.background
            }
            view3.setOnClickListener {
                Color.color = view3.background
            }
            view4.setOnClickListener {
                Color.color = view4.background
            }
            view5.setOnClickListener {
                Color.color = view5.background
            }
            view6.setOnClickListener {
                Color.color = view6.background
            }
            view7.setOnClickListener {
                Color.color = view7.background
            }
            view8.setOnClickListener {
                Color.color = view8.background
            }
            view9.setOnClickListener {
                Color.color = view9.background
            }
            view10.setOnClickListener {
                Color.color = view10.background
            }
            view11.setOnClickListener {
                Color.color = view11.background
            }
            view12.setOnClickListener {
                Color.color = view12.background
            }

            binding.btnSetColor.setOnClickListener {
                val fragmentManager = parentFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.myContainer, firsrFragment)
                transaction.commit()
            }
        }
        return binding.root
    }
    }

