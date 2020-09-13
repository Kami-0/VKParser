package ru.pet.kami.biz.core.repository

import com.vk.api.sdk.objects.wall.WallPostFull
import org.springframework.stereotype.Repository
import ru.pet.kami.biz.api.repository.VkRepositoryApi
import ru.pet.kami.sdk.VkSdkApi
import java.time.LocalDate

@Repository
class VkRepository(
    val vkSdkApi: VkSdkApi
) : VkRepositoryApi {
    override fun getPostByDateRange(ownerId: Int, startDate: LocalDate, finishDate: LocalDate): List<WallPostFull> {
        vkSdkApi.getPostsFromGroupWall(ownerId)
    }
}