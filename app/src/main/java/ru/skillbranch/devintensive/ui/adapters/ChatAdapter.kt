package ru.skillbranch.devintensive.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_chat_single.*
import ru.skillbranch.devintensive.R
import ru.skillbranch.devintensive.models.data.ChatItem

class ChatAdapter: RecyclerView.Adapter<ChatAdapter.SingleChatViewHolder>() {
    var items:List<ChatItem> = listOf();

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleChatViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        val convertView = inflater.inflate(R.layout.item_chat_single,parent, false)
        return SingleChatViewHolder(convertView)
    }

    override fun getItemCount(): Int =items.size

    override fun onBindViewHolder(holder: SingleChatViewHolder, position: Int) {
        holder.bind(items[position])
    }
    fun updateData(data:List<ChatItem>){
        items=data
        notifyDataSetChanged()
    }
    inner class SingleChatViewHolder(override val containerView: View):RecyclerView.ViewHolder(containerView), LayoutContainer {

        fun bind(item:ChatItem){
            if (item.avatar==null){

            }else{
                //TODO
            }
            sv_indicator.visibility=if (item.isOnline) View.VISIBLE else View.GONE

        }
    }
}