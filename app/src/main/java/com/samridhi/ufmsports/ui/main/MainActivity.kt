package com.samridhi.ufmsports.ui.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.samridhi.ufmsports.R
import com.samridhi.ufmsports.databinding.ActivityMainBinding
import com.samridhi.ufmsports.ui.main.adapter.MainAdapter
import com.samridhi.ufmsports.ui.main.viewModel.MainViewModel

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
    private fun initRecyclerView(){
        val llm = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.rvOfferList.setHasFixedSize(true)
        binding.rvOfferList.layoutManager = llm
        mainAdapter = MainAdapter(this)
        binding.rvOfferList.adapter = mainAdapter
    }

    private fun initObservers(){
        viewModel.sportsData.observe(this){
            if (it!= null){
                Log.d("observer3", "initObservers: $it")
               // mainAdapter.submitList(it.results)
            }
        }
    }

}


