package ru.pet.kami.sdk;

import com.vk.api.sdk.objects.wall.responses.GetResponse;
import com.vk.api.sdk.queries.wall.WallGetFilter;

public interface VkSdkApi {
    GetResponse getPostsFromGroupWall(int ownerId, int count, int offset, WallGetFilter filter);
}
