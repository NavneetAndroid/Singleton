package com.example.singleton
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class RecyclerAdapter(val context: Context) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {
    var movieList : List<Movie> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }
    override fun getItemCount(): Int {
        return movieList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvMovieName.text = movieList.get(position).title
    }
    fun setMovieListItems(movieList: List<Movie>){
        this.movieList = movieList;
        notifyDataSetChanged()
    }
    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val tvMovieName: TextView = itemView!!.findViewById(R.id.title)
    }
}
                                         