package org.kotlinlang.play

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SingleExpressionSpec : FunSpec({

    test("`multiply` 함수는 두 수의 곱을 반환합니다") {
        multiply(10, 10) shouldBe 100
    }
})
