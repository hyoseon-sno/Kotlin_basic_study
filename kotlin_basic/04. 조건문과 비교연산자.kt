// 조건문과 비교연상자

/* 비교 연산자
* < <= > >= != == =(할당연산자) is !is(자료형 체크)
* */

/* 다중 조건문 when
* -> switch문을 편리하게 바꾼 기능
* : if가 참과 거짓만을 비교할 수 있는 반면, when은 하나의 변수를 여러개의 값과 비교할 수 있음
* 여러 조건에 만족해도 먼저 부합되는 조건에서 바로 채감
* */

fun main() {
    var a=7

    if(a>=5){
        println("if~~")
    }
    else {
        print("else~~")
    }

    doWhen(1)
    doWhen("dimo")
}

fun doWhen (a:Any){ //Any : 어떠한 자료형과도 호환가능한 코틀린 최상위 자료형
    when(a){
        1 -> println("정수 1값임")
        "DiMo" -> println("디모디모")
        is Long -> println("long 타입")
        !is String -> println("String 타입이 아님")
        else -> println("아무것도 아닌디")
    }
}

fun doWhen2 (a:Any){ // 동작 반환이 아니라 표현식으로서의 역할을 하게 하려면 아래왁 같이 작성
    when(a){
        1 -> "정수 1값임"
        "DiMo" -> "디모디모"
        is Long -> "long 타입"
        !is String -> "String 타입이 아님"
        else -> "아무것도 아닌디"
    }
}