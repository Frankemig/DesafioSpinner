package cl.sulcansystem.desafiospinner

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner:Spinner? = null
        val arrayAdapter: ArrayAdapter<String>?=null
        val setupCiclovias = SetupCiclovias().init()
        val myAdapter = MyAdapter(setupCiclovias)
        recycler_lista.adapter = myAdapter

    }
    fun Sin_Filtrar(view: View){
        recycler_lista.adapter = MyAdapter(SetupCiclovias().init())

    }
    fun Las_Condes(view: View){
        recycler_lista.adapter = MyAdapter(SetupCiclovias().condes())

    }
}