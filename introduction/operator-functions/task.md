# 연산자 함수, Operator Functions

[연산자 오버로딩](https://kotlinlang.org/docs/operator-overloading.html)을 통해 특정 함수를 연산자로 정의할 수 있습니다. 이렇게 정의된 연산자를 사용하여 함수를 호출할 수 있습니다. 이 기능은 특히 DSL(Domain-Specific Language)을 작성하거나, 라이브러리를 더 자연스럽게 사용할 때 유용하게 활용됩니다.

&nbsp;

```kotlin
operator fun Int.times(str: String) = str.repeat(this)       // 1
println(2 * "Bye ")                                          // 2

operator fun String.get(range: IntRange) = substring(range)  // 3
val str = "Always forgive your enemies; nothing annoys them so much."
println(str[0..14])                                          // 4
```

### 코드 설명:

1. `Int` 타입에 `times`라는 확장 함수를 정의하고 `operator` 제어자를 붙여 연산자 오버로딩을 허용합니다.
2. `times()` 함수에 대응하는 연산자 기호는 [*](https://kotlinlang.org/docs/operator-overloading.html#arithmetic-operators)입니다. 따라서 `2 * "Bye "`의 형태로 해당 함수를 호출할 수 있습니다.
3. `String` 타입에 `get`라는 확장 연산자 함수를 정의하여 문자열의 특정 범위에 접근할 수 있도록 했습니다.
4. `get()` 연산자 함수를 활용해 인덱스 범위 [[0..14]](https://kotlinlang.org/docs/operator-overloading.html#indexed-access-operator)로 문자열에서 부분 문자열을 가져옵니다.

> **참고:** 연산자 오버로딩을 사용할 때는 해당 연산자가 어떤 동작을 하는지 명확하게 알려주는 이름을 사용하는 것이 좋습니다. 이렇게 하면 코드의 가독성과 유지보수성이 향상됩니다.

### 실습:

`Operator.kt` 파일을 열고, 2개의 미션을 수행하세요. 코드를 작성했다면, 작업(Task) 패널에서 [확인|Check] 버튼으로 결과를 확인하세요.

1. `times` 연산자를 오버로딩하여 정수와 문자열을 곱할 수 있는 함수를 작성하세요. 작성한 함수를 이용해 2 * "Bye "가 "Bye Bye "를 출력하도록 하세요.   
2. `get` 연산자를 오버로딩하여 문자열에서 지정 범위의 부분 문자열을 추출할 수 있는 함수를 작성하세요. 작성한 함수를 이용해 str[0..14]가 "Always forgive "를 출력하도록 하세요.
