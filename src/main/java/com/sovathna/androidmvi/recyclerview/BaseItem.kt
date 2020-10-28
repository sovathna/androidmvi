package com.sovathna.androidmvi.recyclerview

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

abstract class BaseItem {
  companion object {
    val ITEM_CALLBACK = object : DiffUtil.ItemCallback<BaseItem>() {
      override fun areItemsTheSame(oldItem: BaseItem, newItem: BaseItem) =
        oldItem.uniqueKey == newItem.uniqueKey

      @SuppressLint("DiffUtilEquals")
      override fun areContentsTheSame(oldItem: BaseItem, newItem: BaseItem) =
        oldItem == newItem
    }
  }

  abstract val uniqueKey: String
}