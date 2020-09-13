package ru.pet.kami.biz.api.repository

import com.vk.api.sdk.objects.wall.WallPostFull
import java.time.LocalDate

interface VkRepositoryApi {
    //Поиск включительный
    fun getPostByDateRange(ownerId: Int, startDate: LocalDate, finishDate: LocalDate): List<WallPostFull>
}