package com.golnaz.kmmapplication.shared

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class Data(
    @SerialName("data")
    val data: List<DataEntity>,
    @SerialName("metadata")
    val metadata: MetadataEntity
)
@kotlinx.serialization.Serializable
data class DataEntity(
    @SerialName("id")
    val id: Int,
    @SerialName("title")
    val title: String,
    @SerialName("poster")
    val poster: String,
    @SerialName("genres")
    val genres: List<String>,
    @SerialName("images")
    val images: List<String>,
)
@kotlinx.serialization.Serializable
data class MetadataEntity(
    @SerialName("current_page")
    val current_page: Int,
    @SerialName("per_page")
    val per_page: Int,
    @SerialName("page_count")
    val page_count: Int,
    @SerialName("total_count")
    val total_count: Int,
)