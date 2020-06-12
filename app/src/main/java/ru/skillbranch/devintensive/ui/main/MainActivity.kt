package ru.skillbranch.devintensive.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import ru.skillbranch.devintensive.R
import ru.skillbranch.devintensive.ui.adapters.ChatAdapter
import ru.skillbranch.devintensive.viewmodels.MainViewModel


class MainActivity : AppCompatActivity() {
    private lateinit var chatAdapter: ChatAdapter
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()

        initToolbar()
        initViews()
    }

    private fun initViewModel() {
        viewModel= ViewModelProviders.of(this).get(MainViewModel::class.java)
        chatAdapter= ChatAdapter()
        chatAdapter.updateData(viewModel.getChatData().value!!)
    }

    private fun initToolbar() {
    }

    private fun initViews() {
        with(rv_chat_list){
            adapter=chatAdapter
            layoutManager=LinearLayoutManager(this@MainActivity)
        }
    }
}