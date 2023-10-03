package com.example.pizzasad.adapters

import android.content.Context
import android.media.browse.MediaBrowser
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView


abstract class BaseListAdapter<T, VH : RecyclerView.ViewHolder>(
    val context: Context,
    itemCallback: MediaBrowser.ItemCallback<T>
) : ListAdapter<T, VH>(itemCallback) {
    val inflater = LayoutInflater.from(context)
    private var onItemClickListener: AdapterView.OnItemClickListener<T>? = null
    fun setOnItemClickListener(listener: AdapterView.OnItemClickListener<T>) {
        onItemClickListener = listener
    }
    protected fun callOnItemClickListener(position: Int, item: T, view: View) {
        onItemClickListener?.onItemClick(position, item, view)
    }
}
