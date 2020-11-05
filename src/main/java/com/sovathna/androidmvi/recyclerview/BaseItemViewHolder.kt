package com.sovathna.androidmvi.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

  open fun bindView(item: BaseItem, itemClickListener: ((Int, BaseItem) -> Unit)? = null) {
    if (itemClickListener != null) {
      itemView.setOnClickListener { itemClickListener(adapterPosition, item) }
    } else {
      itemView.setOnClickListener(null)
    }
  }

}