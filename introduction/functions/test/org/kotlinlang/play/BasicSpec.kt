package org.kotlinlang.play

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BasicSpec : FunSpec({

    test("`sum` 함수는 두 수의 합을 반환합니다") {
        sum(10, 10) shouldBe 20
    }
})
