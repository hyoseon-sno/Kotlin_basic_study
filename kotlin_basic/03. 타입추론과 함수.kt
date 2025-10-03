// 타입추론과 함수

/* 타입추론
* 타입추론 : 변수나 함수들을 선언할 때나 연산이 이루어질때 자료형을 코드에 명시하지 않아도 코들린이 자동으로 자료형을 추론해주는 기능
* 변수가 선언될때 할당한 값의 자룝형으로 알아서 판단하여 타입을 추론함
* */

/* 함수
* - fun 으로 시작
* - 단일 표현식 함수 : 함수를 선언하듯이 만들기
* */



fun main() {

    var a = 1234 // int
    var b = 1234L // Long
    var c = 12.45 // Double
    var d = 12.45f // float
    var e = 0xABCD //16진수 -> int로 추론됨
    var f = 0b010101010 //2진수 -> int로 추론됨
    var g = true // boolean
    var h = 'c' // char

    println(add(1,2,3))



}

// 함수 만들기
fun add(a: Int, b:Int, c:Int) : Int {
    return a + b + c
}

// 단일 표현식 함수
fun add2(a:Int, b:Int, c:Int) = a+b+c //단일 표현식 함수에서는 반환형 추론가능하므로 생략 가능
