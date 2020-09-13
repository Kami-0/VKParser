package ru.pet.kami.sdk

import com.vk.api.sdk.objects.wall.responses.GetResponse
import com.vk.api.sdk.queries.wall.WallGetFilter

interface VkSdkApi {
    fun getPostsFromGroupWall(ownerId: Int, count: Int = 1000, offset: Int = 0): GetResponse?
}