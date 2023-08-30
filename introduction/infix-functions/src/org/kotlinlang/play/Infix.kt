package org.kotlinlang.play

fun main() {

    // 1. `times` 함수를 중위 함수로 선언하세요.
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    // 2. 내장된 중위 함수 `to` 사용해 `Pair` 객체를 생성하세요.
    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()

    // 3. `likes` 중위 함수를 작성하고, `Person` 객체를 매개변수로 받아 `likedPeople` 목록에 추가하세요.
    infix fun likes(other: Person) { likedPeople.add(other) }
}
