package dev.springrunner

import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun captureSystemOut(block: () -> Unit): String {
    val originalOut = System.out
    val byteArrayOutputStream = ByteArrayOutputStream()
    val printStream = PrintStream(byteArrayOutputStream)
    try {
        System.setOut(printStream)
        block()
    } finally {
        System.setOut(originalOut)
    }
    return byteArrayOutputStream.toString().trim()
}
