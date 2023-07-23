package com.example.pixabay5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.pixabay5.databinding.ItemImageBinding

class ImageAdapter(var list: ArrayList<ImageModel>) : RecyclerView.Adapter<ImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}

class ImageViewHolder(var binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(image: ImageModel) {
        binding.ivImage.load(image.largeImageURL)
    }
}
