// <변수와 자료형>

//주석 방법1)
/*
* 주석 방법2)
* ㅋㅋㅋ
* */

/* 특징
* 특징1) 세미콜론 안붙히지 않아도됨 -> 언어차원에서 판단
* 특징2) 클래스 이름은 파스칼 표기법 (모든 단어를 대문자로 시작) : ClassName
* 특징3) 함수나 변수 이름은 카멜 표기법 (첫 단어만 소문자로 시작) : functionName
* */

/* 변수 선언
* 1) var : 일반적인 통용되는 변수, 언제든지 읽기 쓰기 가능
* 2) val : 선언시에만 초기화 가능, 중간에 변경 불가
* */

/* 변수 위치에 따른 분류
* 1) Property (속성) : 클래스에 선언된 변수
* 2) Local Variable (로컬 변수) : 이 외의 scope 내에 선언된 변수
* */

/* 기본 자료형 primitive type
* 숫자형 - 정수형 : Byte(8bits), Short(16bits), Int(32bits), Long(64bits)
* 숫자형 - 실수형 : Float(32bits), Double 64(bits)
*
* 정수형의 리터럴 : 10진수,16진수,2진수 *코틀린은 8진수는 표기 지원하지 않음
*
* 문자형 : Char = 1개의 문자 (코틀린은 내부적으로 문자열을 UTF-16 BE(유니코드 인코딩 방식) 방식으로 진행.. -> 따라서 글자 하나하나가 2bytes의 메모리 공간을 사용)
*
* 논리형 : false / true
*
* 문자열 : ""/ """ (여러줄)
* */

fun main() {

    // 기본적인 변수
    var a : Int = 123
    println(a)

    // nullable 변수 : null인 상태로 연산할 시 null pointer exception이 발생할 수 있으므로 꼭 필요할 때만 사용
    var b : Int? = null
    println(b)

    // 10진수
    var intValue :Int = 1234
    //
    var LongValue : Long = 1234L //L을 붙여 더 큰 메모리를 사용하는 정수임을 표시
    // 16진수
    var intValueByHex : Int = 0x1af //0x 붙히기
    // 2진수
    var intValueByBin : Int = 0b1010 //0b 붙히기

    // 실수의 경우 기본은 Double형
    var doubleValue :Double = 12.34
    var doubleValueWithEx : Double = 123.5e10 //e10 붙히기 (exponential의 약어)
    var floatValue : Float = 123.5f //f 붙히기 -> 16비트의 float형으로 취급

}
