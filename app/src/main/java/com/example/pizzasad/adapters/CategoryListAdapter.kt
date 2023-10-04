package com.example.pizzasad.adapters

import CategoryItemCallback
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.example.pizzasad.model.Categories
import com.example.pizzasad.databinding.ItemCategoryCardBinding
import com.example.pizzasad.ui.menu.MenuFragment


class CategoryListAdapter(context: MenuFragment) :
    BaseListAdapter<Categories, CategoryListAdapter.ViewHolder>(context,
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