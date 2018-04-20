package com.kittenls.delapi.openapi.activities.main

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import com.kittenls.delapi.openapi.R
import com.kittenls.delapi.openapi.activities.base.BaseActivity
import com.kittenls.delapi.openapi.activities.main.adapter.MealAdapter
import com.kittenls.delapi.openapi.network.data.Meals
import dagger.android.AndroidInjection

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainActivityContracts.View {

    @Inject
    lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            presenter.getSearch("Ar")
        }

        val recycler = findViewById<RecyclerView>(R.id.mealRecyclerList)
        recycler.adapter = MealAdapter(null)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun showError(error: Throwable) =
            Snackbar.make(foodMain, "Error" + error.message, Snackbar.LENGTH_SHORT).show()


    override fun showData(meals: Meals) {
        Snackbar.make(foodMain, meals.meals.get(0).strMeal, Snackbar.LENGTH_SHORT).show()
        mealRecyclerList.adapter = MealAdapter(meals.meals)
    }
}
