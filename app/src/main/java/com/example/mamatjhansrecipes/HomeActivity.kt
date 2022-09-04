package com.example.mamatjhansrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mamatjhansrecipes.adapter.MainCategoryAdapter
import com.example.mamatjhansrecipes.adapter.SubCategoryAdapter
import com.example.mamatjhansrecipes.entities.Recipes
import kotlinx.android.synthetic.main.activity_splash.*

class HomeActivity : AppCompatActivity() {

    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        arrMainCategory.add(Recipes(1, "Beef"))
        arrMainCategory.add(Recipes(2, "Chicken"))
        arrMainCategory.add(Recipes(3, "Lmab"))
        arrMainCategory.add(Recipes(4, "Seafood"))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipes(1, "Beef and Mash"))
        arrSubCategory.add(Recipes(2, "Chicken Stew"))
        arrSubCategory.add(Recipes(3, "Lmab Chop"))
        arrSubCategory.add(Recipes(4, "Seafood Surf & Turf"))

        subCategoryAdapter.setData(arrSubCategory)

        rv_main_category.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_main_category.adapter = mainCategoryAdapter

        rv_sub_category.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_sub_category.adapter = mainCategoryAdapter
    }
}