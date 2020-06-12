package ru.skillbranch.devintensive.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ru.skillbranch.devintensive.extentsions.mutableLiveData
import ru.skillbranch.devintensive.models.data.ChatItem
import ru.skillbranch.devintensive.repositories.ChatRepository

class MainViewModel: ViewModel() {
    fun getChatData():LiveData<List<ChatItem>>{
        return mutableLiveData(loadChats())
    }

    private val chatRepository = ChatRepository
    private fun loadChats():List<ChatItem>{
        val chats = chatRepository.loadChats()
        return chats.map {
            it.toChatItem()
        }
    }
}