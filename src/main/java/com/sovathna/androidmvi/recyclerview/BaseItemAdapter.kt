package com.sovathna.androidmvi.recyclerview

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

abstract class BaseItemAdapter constructor(
  var clickListener: ((viewId: Int, pos: Int, item: BaseItem) -> Unit)? = null
) : ListAdapter<BaseItem, RecyclerView.ViewHolder>(BaseItem.ITEM_CALLBACK) {

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    if (holder is BaseItemViewHolder) holder.bindView(getItem(position), clickListener)
  }
}