package com.sovathna.androidmvi.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

  open fun bindView(item: BaseItem, clickListener: ((Int, Int, BaseItem) -> Unit)? = null) {
    if (clickListener != null) {
      itemView.setOnClickListener { clickListener(it.id, adapterPosition, item) }
    } else {
      itemView.setOnClickListener(null)
    }
  }

}