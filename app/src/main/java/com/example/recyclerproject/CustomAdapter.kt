package com.example.recyclerproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.single_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.productImage.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.productName.text = ItemsViewModel.text
        holder.productCost.text = ItemsViewModel.text
        holder.productDesc.text = ItemsViewModel.text

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val productImage: ImageView = itemView.findViewById(R.id.image)
        val productName: TextView = itemView.findViewById(R.id.productName)
        val productCost: TextView = itemView.findViewById(R.id.productCost)
        val productDesc: TextView = itemView.findViewById(R.id.productDesc)
    }
}
// contains 3 items used in recycler views
// onCreateViewHolder() : sets the views to display the items /the layout
// onBindViewHolder() : binds the list items to our views e.g imageView
// getItemCount() : returns/specifies the number of items present in a list