package com.geektech.month5_hw3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.geektech.month5_hw3.databinding.ItemImageBinding
import com.geektech.month5_hw3.model.ImageModel

class ImageAdapter(var list: ArrayList<ImageModel>) : RecyclerView.Adapter<ImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}


class ImageViewHolder(var binding: ItemImageBinding) : ViewHolder(binding.root) {

    fun onBind(image: ImageModel) {
        binding.imageView.load(image.largeImageURL)
    }
}
