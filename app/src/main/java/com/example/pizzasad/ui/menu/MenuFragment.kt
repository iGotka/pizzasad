package com.example.pizzasad.ui.menu

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pizzasad.R
import com.example.pizzasad.activites.MainViewModel
import com.example.pizzasad.databinding.ActivityMainBinding
import com.example.pizzasad.model.Categories


class MenuFragment : Fragment() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var categoriesAdapter: CategoriesListAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        categoriesAdapter = createCategoriesAdapter()
        categoriesAdapter.setOnItemClickListener {  ,item,->
            navigateToCategoryDetails(item)
        }
        binding.recyclerView.adapter = categoriesAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        // обновление данных
        viewModel.categoriesList.observe(this) {
            onCategoryLoaded(it)
        }

    }
    private fun createCategoriesAdapter(): Any {
        val adapter = CategoriesListAdapter(this)
        // передаем существующие данные в адаптер
        adapter.submitList(viewModel.categoriesList.value)
        return adapter
    }
    private fun onCategoryLoaded(categories: List<Categories>?) {
        // передаем загруженные данные в адаптер
        categoriesAdapter.submitList(categories)

    }
    private fun navigateToCategoryDetails(category: Categories) {
        val intent = Intent(this, DetailCategoryActivity::class.java)
        intent.putExtra(DetailCategoryActivity.PRODUCT_ID_KEY, category.id)
        startActivity(intent)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }
}