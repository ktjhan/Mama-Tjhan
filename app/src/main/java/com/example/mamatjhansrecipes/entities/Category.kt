package com.example.mamatjhansrecipes.entities

import androidx.room.*
import com.example.mamatjhansrecipes.entities.converter.CategoryListConverter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Category")

data class Category(

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "categories")
    @Expose
    @SerializedName("categories")
    @TypeConverters(CategoryListConverter::class)
    var categoriesEntity: List<CategoryItems>
)