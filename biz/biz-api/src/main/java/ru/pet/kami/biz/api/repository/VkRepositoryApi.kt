package ru.pet.kami.biz.api.repository

import com.vk.api.sdk.objects.wall.WallPostFull
import java.time.Instant

interface VkRepositoryApi {
    //Поиск включительный
    fun getPostByDateRange(ownerId: Int, startDate: Instant, finishDate: Instant): List<WallPostFull>
}