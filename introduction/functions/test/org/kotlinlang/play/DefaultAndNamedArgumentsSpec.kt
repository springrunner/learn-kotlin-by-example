package org.kotlinlang.play

import dev.springrunner.captureSystemOut
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldBeIn
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain

class DefaultAndNamedArgumentsSpec : FunSpec({

    test("`printMessage` 함수는 주어진 문자열을 콘솔에 출력합니다") {
        val output = captureSystemOut {
            printMessage("Hello, World!")
        }
        output shouldBe "Hello, World!"
    }

    test("`printMessageWithPrefix` 함수는 두 문자열을 조합해 콘솔에 출력합니다") {
        val output = captureSystemOut {
            printMessageWithPrefix("message", "prefix")
        }
        output shouldContain "message"
        output shouldContain "prefix"
    }
})
