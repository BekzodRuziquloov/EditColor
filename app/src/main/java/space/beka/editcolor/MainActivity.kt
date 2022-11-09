package space.beka.editcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import space.beka.editcolor.fragments.FirsrFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firsrFragment = FirsrFragment()
        val fragmentManager  = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        transaction.add(R.id.myContainer, firsrFragment)
        transaction.commit()
    }
    }
