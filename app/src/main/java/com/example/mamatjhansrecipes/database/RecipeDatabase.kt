package com.example.mamatjhansrecipes.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mamatjhansrecipes.dao.RecipeDAO
import com.example.mamatjhansrecipes.entities.Recipes

@Database(entities = [Recipes::class], version = 1, exportSchema = false)

abstract class RecipeDatabase: RoomDatabase() {

    companion object {

        var recipeDatabase: RecipeDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase {
            if (recipeDatabase != null) recipeDatabase = Room.databaseBuilder(
                context.applicationContext,
                RecipeDatabase::class.java,
                "recipe.db"
            ).build()
            return recipeDatabase!!
        }
    }
    abstract fun recipeDao(): RecipeDAO
}