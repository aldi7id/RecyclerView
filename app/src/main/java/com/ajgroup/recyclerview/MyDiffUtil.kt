package com.ajgroup.recyclerview

import androidx.recyclerview.widget.DiffUtil

class MyDiffUtil(
    val listContact: ArrayList<MyContact>,
    val listContactNew: ArrayList<MyContact>
): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return listContact.size
    }

    override fun getNewListSize(): Int {
        return listContactNew.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return listContact[oldItemPosition].id == listContactNew[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when {
            listContact[oldItemPosition].id != listContactNew[newItemPosition].id -> {
                false
            }
            listContact[oldItemPosition].name != listContactNew[newItemPosition].name -> {
                false
            }
            listContact[oldItemPosition].noHp != listContactNew[newItemPosition].noHp -> {
                false
            }
            else -> true
        }
    }

}