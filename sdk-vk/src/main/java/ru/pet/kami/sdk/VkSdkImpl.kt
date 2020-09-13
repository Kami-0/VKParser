package ru.pet.kami.sdk

import com.vk.api.sdk.client.TransportClient
import com.vk.api.sdk.client.VkApiClient
import com.vk.api.sdk.client.actors.UserActor
import com.vk.api.sdk.exceptions.ApiException
import com.vk.api.sdk.exceptions.ClientException
import com.vk.api.sdk.httpclient.HttpTransportClient
import com.vk.api.sdk.objects.wall.responses.GetResponse
import com.vk.api.sdk.queries.wall.WallGetFilter
import org.springframework.stereotype.Component

@Component
class VkSdkImpl: VkSdkApi {
    private var vk = VkApiClient(HttpTransportClient.getInstance())
    private var actor = UserActor(7581705, "5145035651fd6950a1d2b42224fdd9f5856e1480ac915832c844d1978ddf36dc7e53626587fef62f1bd6b")

    override fun getPostsFromGroupWall(ownerId: Int, count: Int, offset: Int): GetResponse? {
        return  vk.wall().get(actor)
                .ownerId(ownerId)
                .count(count)
                .offset(offset)
                .execute()
    }
}