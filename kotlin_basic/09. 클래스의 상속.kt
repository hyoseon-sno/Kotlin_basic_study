// 클래스의 상속

/* 상속
* 코들린은 상속 금지가 기본값 -> 함수가 open상태가 아니면 상속 불가
* open : 클래스 상속이 가능하도록 클래스 선언시 붙여줄 수 있는 키워드
*
* 서브 클래스 : 수퍼 클래스에 존재하는 속성과 '같은 이름'의 속성을 가질 수 없음
*   - 서브 클래스를 생성할 때는 반드시 수퍼클래스의 생성자까지 호출되어야 함
*   - 서브 클래스 안에서 var, val 등을 붙이면 속성으로 선언되므로 일반 파라미터로 받아 수퍼클래스 생성자에 직접 넘겨줌
*
 */

fun main() {
    var a = Animal("별이",5,'개')
    var b = Dog("별이",5)

    a.introduce()
    b.introduce()

    b.bark()


}

open class Animal (var name:String, var age:Int, var type:String)
{
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog (name:String, age:Int) : Anmial (name, age, "개")
{
    fun bark() {
        println("멍멍")
    }

}

class Dog (name:String, age:Int) : Anmial (name, age, "고양이")
{
    fun meow() {
        println("애옹")
    }

}
