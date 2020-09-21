package ru.pet.kami.biz.core.repository

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.time.Instant


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class RepositoryTest {

    @Autowired
    lateinit var repository: Repository

    @Test
    fun getPostByDateRange() {
        val instant = Instant.now()
        val answer = repository.getPostByDateRange(155590170, instant, instant)
        println(answer)
    }
}