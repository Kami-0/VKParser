package ru.pet.kami.common.api.dto

data class RequestOnParsing(
    val groupUri: String,
    val hasLike: Boolean,
    val hasComment: Boolean,
    val hasRepost: Boolean
)