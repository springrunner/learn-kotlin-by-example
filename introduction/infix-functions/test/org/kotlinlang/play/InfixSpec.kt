package org.kotlinlang.play

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.nulls.shouldNotBeNull
import kotlin.reflect.full.declaredFunctions

class InfixSpec : FunSpec({

    test("Person 클래스 내 `likes` 함수는 중위(infix) 함수로 작성되었습니다") {
        val likes = Person::class.declaredFunctions.find { it.name == "likes" }
        likes.shouldNotBeNull()
        likes.isInfix.shouldBeTrue()
    }

    test("`likes` 중위 함수는 `Person` 객체를 매개변수로 받아 `likedPeople` 목록에 추가합니다") {
        val sophia = Person("Sophia")
        val claudia = Person("Claudia")
        sophia likes claudia

        sophia.likedPeople shouldContain claudia
    }
})
