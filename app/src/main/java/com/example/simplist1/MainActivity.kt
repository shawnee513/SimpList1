package com.example.simplist1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveStoreDepartmentsButton: Button = findViewById(R.id.save_store_departments_button)
        saveStoreDepartmentsButton.setOnClickListener {
            saveDepartments()
        }

        val addItemButton: Button = findViewById(R.id.add_item_button)
        addItemButton.setOnClickListener {
            addItem()
        }

        val viewListButton: Button = findViewById(R.id.view_list_button)
        viewListButton.setOnClickListener {
            viewList()
        }
    }

    val storeList = StoreList ()

    private fun saveDepartments () {
        val department_1_editText: EditText = findViewById(R.id.store_department_1)
        storeList.department_1 = department_1_editText.text.toString()
        storeList.itemsInDepartment_1.clear()

        val department_2_editText: EditText = findViewById(R.id.store_department_2)
        storeList.department_2 = department_2_editText.text.toString()
        storeList.itemsInDepartment_2.clear()

        val department_3_editText: EditText = findViewById(R.id.store_department_3)
        storeList.department_3 = department_3_editText.text.toString()
        storeList.itemsInDepartment_3.clear()

        val department_4_editText: EditText = findViewById(R.id.store_department_4)
        storeList.department_4 = department_4_editText.text.toString()
        storeList.itemsInDepartment_4.clear()

        val department_5_editText: EditText = findViewById(R.id.store_department_5)
        storeList.department_5 = department_5_editText.text.toString()
        storeList.itemsInDepartment_5.clear()

        val department_6_editText: EditText = findViewById(R.id.store_department_6)
        storeList.department_6 = department_6_editText.text.toString()
        storeList.itemsInDepartment_6.clear()

        val department_7_editText: EditText = findViewById(R.id.store_department_7)
        storeList.department_7 = department_7_editText.text.toString()
        storeList.itemsInDepartment_7.clear()

        val department_8_editText: EditText = findViewById(R.id.store_department_8)
        storeList.department_8 = department_8_editText.text.toString()
        storeList.itemsInDepartment_8.clear()

        val department_9_editText: EditText = findViewById(R.id.store_department_9)
        storeList.department_9 = department_9_editText.text.toString()
        storeList.itemsInDepartment_9.clear()

        val department_10_editText: EditText = findViewById(R.id.store_department_10)
        storeList.department_10 = department_10_editText.text.toString()
        storeList.itemsInDepartment_10.clear()

        Toast.makeText(this, "Departments Saved", Toast.LENGTH_SHORT).show()
    }

    private fun addItem () {
        val itemEditText: EditText = findViewById(R.id.item_entry)
        val item = itemEditText.text.toString()
        itemEditText.text.clear()

        val departmentEditText: EditText = findViewById(R.id.department_entry)
        val department = departmentEditText.text.toString()
        departmentEditText.text.clear()

        when (department){
            storeList.department_1 -> storeList.itemsInDepartment_1.add(item)
            storeList.department_2 -> storeList.itemsInDepartment_2.add(item)
            storeList.department_3 -> storeList.itemsInDepartment_3.add(item)
            storeList.department_4 -> storeList.itemsInDepartment_4.add(item)
            storeList.department_5 -> storeList.itemsInDepartment_5.add(item)
            storeList.department_6 -> storeList.itemsInDepartment_6.add(item)
            storeList.department_7 -> storeList.itemsInDepartment_7.add(item)
            storeList.department_8 -> storeList.itemsInDepartment_8.add(item)
            storeList.department_9 -> storeList.itemsInDepartment_9.add(item)
            storeList.department_10 -> storeList.itemsInDepartment_10.add(item)
            else -> Toast.makeText(this, "$department isn't a valid department", Toast.LENGTH_SHORT).show()
        }

    }

    private fun viewList () {
        val shoppingListTextView: TextView = findViewById(R.id.shopping_list)
        shoppingListTextView.text = storeList.printShoppingList()

    }
}

class StoreList {
    var department_1 = ""
    var department_2 = ""
    var department_3 = ""
    var department_4 = ""
    var department_5 = ""
    var department_6 = ""
    var department_7 = ""
    var department_8 = ""
    var department_9 = ""
    var department_10 = ""
    val itemsInDepartment_1 = mutableListOf<String>()
    val itemsInDepartment_2 = mutableListOf<String>()
    val itemsInDepartment_3 = mutableListOf<String>()
    val itemsInDepartment_4 = mutableListOf<String>()
    val itemsInDepartment_5 = mutableListOf<String>()
    val itemsInDepartment_6 = mutableListOf<String>()
    val itemsInDepartment_7 = mutableListOf<String>()
    val itemsInDepartment_8 = mutableListOf<String>()
    val itemsInDepartment_9 = mutableListOf<String>()
    val itemsInDepartment_10 = mutableListOf<String>()

    fun addItemToDepartment () {

    }

    fun printShoppingList () : String{
        var shoppingList = ""

        if(itemsInDepartment_1.isNotEmpty()){
            for(item in itemsInDepartment_1){
                shoppingList = shoppingList.plus(item).plus("\n")
            }
        }

        if(itemsInDepartment_2.isNotEmpty()){
            for(item in itemsInDepartment_2){
                shoppingList = shoppingList.plus(item).plus("\n")
            }
        }

        if(itemsInDepartment_3.isNotEmpty()){
            for(item in itemsInDepartment_3){
                shoppingList = shoppingList.plus(item).plus("\n")
            }
        }

        if(itemsInDepartment_4.isNotEmpty()){
            for(item in itemsInDepartment_4){
                shoppingList = shoppingList.plus(item).plus("\n")
            }
        }

        if(itemsInDepartment_5.isNotEmpty()){
            for(item in itemsInDepartment_5){
                shoppingList = shoppingList.plus(item).plus("\n")
            }
        }

        if(itemsInDepartment_6.isNotEmpty()){
            for(item in itemsInDepartment_6){
                shoppingList = shoppingList.plus(item).plus("\n")
            }
        }

        if(itemsInDepartment_7.isNotEmpty()){
            for(item in itemsInDepartment_7){
                shoppingList = shoppingList.plus(item).plus("\n")
            }
        }

        if(itemsInDepartment_8.isNotEmpty()){
            for(item in itemsInDepartment_8){
                shoppingList = shoppingList.plus(item).plus("\n")
            }
        }

        if(itemsInDepartment_9.isNotEmpty()){
            for(item in itemsInDepartment_9){
                shoppingList = shoppingList.plus(item).plus("\n")
            }
        }

        if(itemsInDepartment_10.isNotEmpty()){
            for(item in itemsInDepartment_10){
                shoppingList = shoppingList.plus(item).plus("\n")
            }
        }

        return  shoppingList
    }

}

