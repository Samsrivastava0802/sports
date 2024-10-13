package com.samridhi.ufmsports.ui.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.databinding.ActivityMainBinding
import com.samridhi.ufmsports.ui.main.adapter.MainAdapter
import com.samridhi.ufmsports.ui.main.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var mainAdapter: MainAdapter

    private  lateinit var viewModel: MainViewModel

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        initRecyclerView()
        initObservers()

    }
    private fun initRecyclerView() {
        val llm2 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.vpMyMatches.setHasFixedSize(true)
        binding.vpMyMatches.layoutManager = llm2
        mainAdapter = MainAdapter(this)
        binding.vpMyMatches.adapter = mainAdapter
    }

    private fun initObservers(){
        viewModel.sportsData.observe(this){
            if (it!= null){
                Log.d("observer3", "initObservers: $it")
                mainAdapter.submitList(it)
            }
        }
    }

}


