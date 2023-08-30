# [중위 함수, Infix Functions](https://kotlinlang.org/docs/functions.html#infix-notation)

매개변수(parameter)를 하나만 받는 멤버 함수나 확장(extension) 함수는 "중위 함수" 형태로 사용할 수 있습니다. 이렇게 하면 더 자연스러운 문장 형태로 코드를 작성할 수 있습니다.

&nbsp;

```kotlin
fun main() {

  infix fun Int.times(str: String) = str.repeat(this)        // 1
  println(2 times "Bye ")                                    // 2

  val pair = "Ferrari" to "Katrina"                          // 3
  println(pair)

  infix fun String.onto(other: String) = Pair(this, other)   // 4
  val myPair = "McLaren" onto "Lucas"
  println(myPair)

  val sophia = Person("Sophia")
  val claudia = Person("Claudia")
  sophia likes claudia                                       // 5
}

class Person(val name: String) {
  val likedPeople = mutableListOf<Person>()
  infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}
```

### 코드 설명:

1. `Int` 타입에 중위 확장 함수 `times`를 정의했습니다. 이 함수는 주어진 문자열을 `Int` 값만큼 반복합니다.
2. 중위 함수 `times`를 이용하여 "Bye " 문자열을 두 번 반복하여 출력합니다. 결과는 "Bye Bye "가 됩니다.
3. 코틀린 표준 라이브러리의 중위 함수 `to`를 사용하여 `Pair` 객체를 생성하고 출력합니다.
4. `String`에 `onto`라는 새로운 중위 함수를 정의했습니다. 이 함수는 `to` 함수와 동일한 기능을 수행합니다.
5. `Person` 객체 간에 `likes`라는 중위 함수를 사용하여 관계를 설정합니다.
6. `likes` 중위 함수는 `Person` 객체를 매개변수로 받아 `likedPeople` 목록에 추가합니다. 클래스의 인스턴스 자체가 첫 번째 매개변수가 되며, 이를 통해 `likedPeople` 목록에 다른 `Person`을 추가합니다.

> ※ 이 예제에서는 `main` 함수 내에서 중위 함수를 정의하는 것과 같이 [지역 함수(어떤 함수 안에 있는 함수)](https://kotlinlang.org/docs/functions.html#local-functions)를 사용했습니다.
> 지역 함수는 그것이 정의된 함수 내에서만 호출할 수 있습니다.

### 실습:

`Infix.kt` 파일을 열고, 3개의 미션을 수행하세요.

1. `times` 함수를 중위 함수로 선언하세요.
2. 내장된 중위 함수 `to` 사용해 `Pair` 객체를 생성하세요.
3. `likes` 중위 함수를 작성하고, `Person` 객체를 매개변수로 받아 `likedPeople` 목록에 추가하세요. 

모든 미션을 수행했다면, 작업(Task) 패널에서 [확인|Check] 버튼으로 결과를 확인 할 수 있습니다. 결과는 테스트 코드를 통해 확인합니다. 올바르게 작성하지 않으면, 테스트가 실패합니다.

## 확장 함수 (Extension Functions)

확장 함수는 특정 클래스에 새로운 함수를 추가하는 것처럼 동작합니다. 이러한 확장 함수는 실제 클래스를 수정하지 않고도 그 클래스의 인스턴스에 대해 새로운 메서드를 호출할 수 있게 해줍니다.

&nbsp;

```kotlin
fun String.reverse(): String {
    return this.reversed()
}

fun main() {
    println("Hello".reverse())
}
```

이 예에서 `String` 클래스에 `reverse`라는 확장 함수를 추가했습니다. 이 함수는 문자열을 뒤집는 작업을 수행합니다. `main` 함수에서는 이 확장 함수로 문자열을 뒤집어 "olleH"를 출력합니다.

확장 함수에 대해서는 추후 좀 더 다루도록 하겠습니다.

### 확장 함수와 중위 함수

앞선 중위 함수 예제에서도 확장 함수가 사용되었습니다. 예를 들어, `Int` 클래스에 `times`라는 확장 함수를 추가했습니다. 이 함수는 `Int` 타입의 수와 `String` 타입의 문자열을 받아, 그 문자열을 `Int` 타입의 수만큼 반복합니다. 이를 통해 기존 클래스나 인터페이스에 새로운 기능을 쉽게 추가할 수 있습니다.

이렇게 확장 함수를 이용하면, 중위 함수도 더 다양한 클래스와 매개변수에 적용할 수 있게 됩니다. 따라서 중위 함수와 확장 함수는 Kotlin에서 코드를 더 간결하고 가독성 있게 만드는 데 유용한 도구입니다.
