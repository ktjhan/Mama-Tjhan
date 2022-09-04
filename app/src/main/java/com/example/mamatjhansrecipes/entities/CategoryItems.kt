package com.example.mamatjhansrecipes.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "recipe")

data class CategoryItems(

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "idCategory")
    @Expose
    @SerializedName("idCategory")
    var idCategory: String,
    @ColumnInfo(name = "strCategory")
    @Expose
    @SerializedName("strCategory")
    var strCategory: String,
    @ColumnInfo(name = "strCategoryThumb")
    @Expose
    @SerializedName("strCategoryThumb")
    var strCategoryThumb: String,
    @ColumnInfo(name = "strCategoryDescription")
    @Expose
    @SerializedName("strCategoryDescription")
    var strCategoryDescription: String
)