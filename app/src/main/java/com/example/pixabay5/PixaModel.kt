package com.example.pixabay5

data class PixaModel(
    var hits: ArrayList<ImageModel>
)

data class ImageModel(
    var largeImageURL: String
)
