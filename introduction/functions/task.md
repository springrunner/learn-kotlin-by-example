# [함수, Functions](https://kotlinlang.org/docs/functions.html)

코틀린에서 함수는 `fun` 키워드를 사용하여 정의합니다.

&nbsp;

```kotlin
fun sum(x: Int, y: Int): Int {          // 1
    return x + y
}

fun main() {
    println(sum(1, 2))                  // 2
}
```

### 코드 설명:

1. 이 함수는 두 개의 `정수 Int` 타입 매개변수를 받아, 그 합을 `Int` 타입으로 반환합니다.
2. `sum` 함수의 반환값을 콘솔에 출력합니다.

## 기본값 파라미터와 이름지정 파라미터, Default arguments and Named arguments

코틀린에서는 함수의 매개변수에 기본값을 설정할 수 있으며, 함수 호출 시에 매개변수의 이름을 명시적으로 지정할 수 있습니다. 이러한 기능을 통해 코드의 가독성을 높이고, 오류 가능성을 줄일 수 있습니다.

- 기본값 설정을 [`기본값 파라미터 Default arguments`](https://kotlinlang.org/docs/functions.html#default-arguments) 라고 부릅니다
- 매개변수의 이름을 지정하는 것을 [`이름지정 파라미터 Named arguments`](https://kotlinlang.org/docs/functions.html#named-arguments) 라고 부릅니다

```kotlin
fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")                                       // 3
}

fun main() {
    printMessage("Hello")                                               // 4
    printMessageWithPrefix("Hello", "Log")                              // 5
    printMessageWithPrefix("Hello")                                     // 6
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 7
}
```

### 코드 설명:

1. 이 함수는 `문자열 String` 타입의 매개변수를 하나 받고, `Unit`을 반환합니다. 여기서 `Unit`은 반환값이 없음을 의미합니다.
2. 이 함수는 기본값이 'Info'로 설정된 `prefix`라는 두 번째 매개변수를 가집니다. 반환 타입은 명시되지 않았지만, 이는 `Unit`을 반환함을 의미합니다.
3. 전달받은 `prefix`와 `message`를 조합해 콘솔(표준 출력, 이후 생략)에 출력합니다.
4. `printMessage` 함수에 'Hello'라는 인자를 전달해 호출합니다.
5. `printMessageWithPrefix` 함수에 'Hello'와 'Log'라는 두 인자를 전달해 호출합니다.
6. `printMessageWithPrefix` 함수의 두 번째 매개변수를 생략하면, 기본값인 'Info'가 사용됩니다.
7. 함수 호출 시 매개변수의 이름을 명시적으로 지정할 수 있으며, 이 경우 매개변수의 순서도 변경할 수 있습니다.

> ※ "[$prefix] $message" 형식은 코틀린에서 제공하는 [문자열 템플릿](https://kotlinlang.org/docs/strings.html#string-templates) 기능을 사용한 것입니다.
> 중괄호 안의 prefix와 message는 함수의 매개변수 값을 의미하며, 이 값들이 문자열 템플릿 안에 자동으로 삽입됩니다.
> 예를 들어, prefix가 "Info"이고 message가 "Hello"라면, 출력은 "[Info] Hello"가 됩니다.

## [단일 표현식 함수, Single-expression functions](https://kotlinlang.org/docs/functions.html#single-expression-functions)

코틀린에서는 함수의 본문이 하나의 식(expression)으로만 이루어져 있다면, 중괄호와 `return` 키워드를 생략할 수 있습니다. 이를 **'단일 표현식 함수'** 라고 합니다.

&nbsp;

```kotlin
fun multiply(x: Int, y: Int) = x * y            // 1

fun main() {
    println(multiply(2, 4))                     // 2
}
```

### 코드 설명:

1. 이 함수는 단일 표현식 함수입니다. `return` 키워드와 중괄호를 생략했지만, 타입 추론 덕분에 `Int` 타입을 반환한다는 것을 컴파일러가 알아차립니다.
2. `multiply` 함수의 반환값을 콘솔에 출력합니다.

> ※ 타입 추론(type inference)은 프로그래밍 언어의 컴파일러나 인터프리터가 코드를 분석하여 변수나 함수, 표현식의 타입을 자동으로 결정하는 과정을 의미합니다.
> 코틀린에서는 타입 추론을 통해 변수나 함수의 반환 타입을 명시하지 않아도 적절한 타입을 찾아줍니다.
> 예를 들어, val x = 10 이라고 선언만 해도 x의 타입은 Int로 추론됩니다.

# 실습

1. `Basic.kt` 파일을 열고, 두 수의 합을 구하는 함수를 완성해보세요.
2. `DefaultAndNamedArguments.kt` 파일을 열고, 문자열을 출력하는 함수를 완성해보세요.
3. `SingleExpression.kt` 파일을 열고, 두 수의 곱을 구하는 함수를 완성해보세요.

모든 함수를 완성했다면, 작업(Task) 패널에서 [확인|Check] 버튼으로 결과를 확인 할 수 있습니다. 결과는 테스트 코드를 통해 확인합니다. 올바르게 작성하지 않으면, 테스트가 실패합니다.
