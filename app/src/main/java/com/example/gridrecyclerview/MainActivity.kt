package com.example.gridrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var  foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }
    private fun init(){
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this,2)

        foodList = ArrayList()
        addDataTOList()

        foodAdapter= FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter
    }

    private fun addDataTOList(){
        foodList.add(Food(R.drawable.food1,"food1"))
        foodList.add(Food(R.drawable.food2,"food2"))
        foodList.add(Food(R.drawable.food3,"food3"))
        foodList.add(Food(R.drawable.food4,"food4"))
        foodList.add(Food(R.drawable.food5,"food5"))
        foodList.add(Food(R.drawable.food6,"food6"))
        foodList.add(Food(R.drawable.food7,"food7"))
        foodList.add(Food(R.drawable.food8,"food8"))

    }
}