package com.sovathna.androidmvi.recyclerview

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

interface BaseItem {
  companion object {
    val ITEM_CALLBACK = object : DiffUtil.ItemCallback<BaseItem>() {
      override fun areItemsTheSame(oldItem: BaseItem, newItem: BaseItem) =
        oldItem.uid == newItem.uid

      @SuppressLint("DiffUtilEquals")
      override fun areContentsTheSame(oldItem: BaseItem, newItem: BaseItem) =
        oldItem == newItem
    }
  }

  val uid: String
}