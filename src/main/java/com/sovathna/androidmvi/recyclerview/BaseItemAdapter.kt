package com.sovathna.androidmvi.recyclerview

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

abstract class BaseItemAdapter :
  ListAdapter<BaseItem, RecyclerView.ViewHolder>(BaseItem.ITEM_CALLBACK) {

  private var itemClickListener: ((Int, BaseItem) -> Unit)? = null

  fun setItemClickListener(itemClickListener: ((Int, BaseItem) -> Unit)?) {
    this.itemClickListener = itemClickListener
  }

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    if (holder is BaseItemViewHolder) holder.bindView(getItem(position), itemClickListener)
  }
}