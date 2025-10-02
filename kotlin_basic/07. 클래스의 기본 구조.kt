// 클래스의 기본 구조

/* 클래스
* 클래스 = 값과 그 값을 사용하는 기능들을 묶어 놓은 것
* 클래스 = 속성(고유의 특징값) + 함수(기능의 구현)
* */

fun main() {
    var a = Person("A", 1990)
    var b = Person("B", 1998)
    var c = Person("C", 2000)

    a.introduce()
    b.introduce()
    c.introduce()


}

class Person (var name:String, Val birthYear:Int) {
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}

// => 코틀린은 객체지향 언어를 기반으로 함수형 언어의 장점을 흡수한 실용적인 언어이다.
// 따라서 객체지향 기본이 되는 클래스를 이해하는 것이 매우 중요함