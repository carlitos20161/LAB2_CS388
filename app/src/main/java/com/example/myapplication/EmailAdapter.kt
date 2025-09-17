package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MailListAdapter(private val emails: List<Email>) :
    RecyclerView.Adapter<MailListAdapter.MailViewHolder>() {

    class MailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderTextView: TextView = itemView.findViewById(R.id.senderTv)
        val titleTextView: TextView  = itemView.findViewById(R.id.titleTv)
        val summaryTextView: TextView = itemView.findViewById(R.id.summaryTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.email_item, parent, false)
        return MailViewHolder(view)
    }

    override fun onBindViewHolder(holder: MailViewHolder, position: Int) {
        val email = emails[position]
        holder.senderTextView.text = email.sender
        holder.titleTextView.text = email.title
        holder.summaryTextView.text = email.summary
    }

    override fun getItemCount(): Int = emails.size
}
