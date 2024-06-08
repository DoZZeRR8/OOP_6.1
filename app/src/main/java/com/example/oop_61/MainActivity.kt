package com.example.oop_61

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.oop_61.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btTable1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fgTable, BlankFragment.newInstance("1"))
                .commit()
        }

        binding.btTable2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fgTable, BlankFragment.newInstance("2"))
                .commit()
        }

        binding.btTable3.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fgTable, BlankFragment.newInstance("3"))
                .commit()
        }

        binding.btTable4.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fgTable, BlankFragment.newInstance("4"))
                .commit()
        }

        binding.btTable5.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fgTable, BlankFragment.newInstance("5"))
                .commit()
        }

        binding.btTable6.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fgTable, BlankFragment.newInstance("6"))
                .commit()
        }

        binding.btTable7.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fgTable, BlankFragment.newInstance("7"))
                .commit()
        }

        binding.btTable8.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fgTable, BlankFragment.newInstance("8"))
                .commit()
        }

        binding.btTable9.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fgTable, BlankFragment.newInstance("9"))
                .commit()
        }

        binding.btTable10.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fgTable, BlankFragment.newInstance("10"))
                .commit()
        }
    }
}