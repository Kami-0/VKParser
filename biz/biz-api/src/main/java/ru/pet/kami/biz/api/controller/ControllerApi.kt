package ru.pet.kami.biz.api.controller

import ru.pet.kami.common.api.dto.RequestOnParsing
import ru.pet.kami.common.api.dto.ResponseOnParsing

interface ControllerApi {
    fun request(request: RequestOnParsing): ResponseOnParsing
}