package cl.sulcansystem.desafiospinner

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val comuna : TextView
    val ciclovia : TextView

    init {
        comuna = itemView.findViewById(R.id.txtcomuna)
        ciclovia = itemView.findViewById(R.id.txtciclovia)
    }
}

class MyAdapter(val lista : MutableList<Ciclovia>) : RecyclerView.Adapter<MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ciclovia, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
    return lista.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
holder.comuna.text = lista[position].comuna
    holder.ciclovia.text = lista[position].nombre
    }
}

class SpinnerAdapter