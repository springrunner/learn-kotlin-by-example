# Hello World

프로그래밍 언어 학습의 시작인 "Hello, World!" 부터 출력해봅시다.

&nbsp;

```kotlin
package org.kotlinlang.play         // 1

fun main() {                        // 2
    println("Hello, World!")        // 3
}
```

### 코드 설명:

1. 일반적으로 코틀린 코드는 패키지 안에 작성합니다. 여기서는 `org.kotlinlang.play` 라는 패키지를 사용했습니다. 패키지 지정이 필수는 아니며, 패키지를 선언하지 않으면 디폴트 패키지로 지정됩니다.
2. main 함수는 코틀린 프로그램의 진입점(Entry point)입니다. 이 함수가 실행될 때 프로그램이 시작됩니다.
3. println은 표준 출력에 문자열을 출력합니다. 코틀린에서는 코드 라인 끝에 세미콜론(;)을 붙이지 않아도 됩니다.

### 실습 1:

1. HelloWorld.kt 파일을 열고, 예제 코드를 참고해서 `TODO()` 영역에 코드를 작성해보세요.
2. 코드를 작성했다면, 작업(Task) 패널에서 [확인|Check] 버튼으로 결과를 확인하세요. 

---

만약, 프로그램 시작 시 사용자로부터 전달받은 실행 인자(argument)를 처리하려면, `main` 함수에 `Array<String>` 타입의 매개변수(parameter)를 선언해야합니다.

&nbsp;

```kotlin
fun main(args: Array<String>) {
    println(args.joinToString(","))
}
```

위의 예시는 사용자로부터 전달받은 실행 인자를 하나의 문자열로 연결해서 출력합니다. 예를 들어, 프로그램을 Hello와 World!라는 두 개의 인자와 함께 실행한다면 화면에는 `Hello, World!`가 출력됩니다.

### 실습 2:

1. HelloWorld.kt 파일을 열고, 예제 코드와 동일하게 작성해보세요.
2. 코드를 작성했다면, 작업(Task) 패널에서 [확인|Check] 버튼으로 결과를 확인하세요.

※ 알림: 프로그램이 실행 시 ["Hello", "World!"] 라는 두 개의 인자를 전달하고 있습니다.

&nbsp;

---

## 참고자료

- [Program entry point](https://kotlinlang.org/docs/basic-syntax.html#program-entry-point)
- [Print to the standard output](https://kotlinlang.org/docs/basic-syntax.html#print-to-the-standard-output)
- [진입점(Entry point)](https://ko.wikipedia.org/wiki/엔트리_포인트)
