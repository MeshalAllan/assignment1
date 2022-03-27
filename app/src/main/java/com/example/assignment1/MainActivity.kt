package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.Rbutton)
        val etxt1: EditText = findViewById(R.id.Number1)
        val etxt2: EditText = findViewById(R.id.Number2)
        val resultTV: TextView = findViewById(R.id.result)
        var flag : String = "sum"
        //here .. create a spinner items (options)
        val spinnerVal : Spinner = findViewById(R.id.Slist)
        var options = arrayOf("sum","sub","mul","dev")
        spinnerVal.adapter =
            ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

            button.setOnClickListener { view ->
            var x: Int = etxt1.text.toString().toInt();
            var y: Int = etxt2.text.toString().toInt();
                if (flag=="sum")
                    resultTV.text = sum(x, y).toString();
                else if(flag=="sub")
                    resultTV.text = sub(x, y).toString();
                else if(flag=="mul")
                    resultTV.text = mul(x, y).toString();
                else
                    resultTV.text = dev(x, y).toString();
        }
    }
}
public fun sum(a: Int, b: Int): Int
{
    return a+b;
}
public fun sub(a: Int, b: Int): Int
{
    return a-b
}
public fun mul(a: Int, b: Int): Int
{
    return a*b
}
public fun dev(a: Int, b: Int): Int
{
    return a/b
}


