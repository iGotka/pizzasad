package com.example.pizzasad.adapters

import android.content.Context
import android.icu.util.ULocale
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.util.Locale

class CategoryListAdapter(context: Context) :
    BaseListAdapter<Locale.Category, CategoryListAdapter.ViewHolder>(context,
        CategoryItemCallback())  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val binding = ItemCategoryCardBinding.inflate(inflater, parent, false)
    return ViewHolder(binding)
}
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = getItem(position)
        val binding = holder.binding
        binding.root.setOnClickListener {
            callOnItemClickListener(position, category, binding.root)
        }
        binding.categoryTitle.text = category.title
        Picasso.get()
            .load(category.text)
            .into(binding.categoryTitle)
    }
    class ViewHolder(val binding: ItemCategoryCardBinding) :
        RecyclerView.ViewHolder(binding.root)
}



}