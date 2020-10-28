package com.sovathna.androidmvi.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

  abstract fun bindView(item: BaseItem, clickListener: ((Int, BaseItem) -> Unit)? = null)

}