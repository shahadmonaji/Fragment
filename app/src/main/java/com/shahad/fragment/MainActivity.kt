package com.shahad.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.shahad.fragment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragmentBtn1.setOnClickListener {

            replacefragment(fragment2())
        }
        binding.fragmentBtn2.setOnClickListener {
            replacefragment(fragment1())
        }
    }

    private fun replacefragment(fragment: Fragment) {

        val fragmentManager=supportFragmentManager
        val fragmentTransactione=fragmentManager.beginTransaction()
        fragmentTransactione.replace(R.id.fragment_container_view,fragment)
        fragmentTransactione.commit()
    }
}