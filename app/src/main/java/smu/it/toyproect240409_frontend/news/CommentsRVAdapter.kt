package smu.it.toyproect240409_frontend.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import smu.it.toyproect240409_frontend.R

class CommentsRVAdapter (val commentsItems : ArrayList<String>) : RecyclerView.Adapter<CommentsRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.comments_rv_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(commentsItems[position])
    }

    override fun getItemCount(): Int {
        return commentsItems.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(item : String) {

        }
    }

}