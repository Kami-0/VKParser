package ru.pet.kami.biz.core.controller

import org.springframework.stereotype.Component
import ru.pet.kami.biz.api.controller.ControllerApi
import ru.pet.kami.common.api.dto.RequestOnParsing
import ru.pet.kami.common.api.dto.ResponseOnParsing
import ru.pet.kami.sdk.VkSdkApi

@Component
class ControllerImpl: ControllerApi {
    override fun request(request: RequestOnParsing): ResponseOnParsing {
        TODO("Реализовать запрос")
    }
}