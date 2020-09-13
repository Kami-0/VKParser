package ru.pet.kami.biz.core.repository

import com.vk.api.sdk.objects.wall.WallPostFull
import com.vk.api.sdk.objects.wall.responses.GetResponse
import org.springframework.stereotype.Repository
import ru.pet.kami.biz.api.repository.VkRepositoryApi
import ru.pet.kami.sdk.VkSdkApi
import java.time.Instant

@Repository
class Repository(
    private val vkSdkApi: VkSdkApi
) : VkRepositoryApi {
    override fun getPostByDateRange(ownerId: Int, startDate: Instant, finishDate: Instant): List<WallPostFull> {
        val result: MutableList<WallPostFull> = mutableListOf()
        val startDateUT = startDate.epochSecond
        val finishDateUT = finishDate.epochSecond

        do {
            val posts = vkSdkApi.getPostsFromGroupWall(ownerId)
            val lastDate = posts?.items?.last()?.date!! ?: TODO("реализовать исключение при плохом ответе от вк")
            when {
                lastDate < startDateUT -> continue
                lastDate in startDateUT..finishDateUT -> {
                    addValidValues(posts, startDateUT, finishDateUT, result)
                    break
                }
                lastDate >= startDateUT -> addValidValues(posts, startDateUT, finishDateUT, result)
            }
        } while (true)

        return result
    }

    private fun addValidValues(posts: GetResponse, startDateUT: Long, finishDateUT: Long, result: MutableList<WallPostFull>) {
        posts.items?.forEach {
            if (it.date in startDateUT..finishDateUT) {
                result.add(it)
            }
        }
    }
}
