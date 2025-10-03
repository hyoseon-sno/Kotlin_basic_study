// <형변환과 배열>

/* 형변환
* 형변환 = 하나의 변수에 지정된 자료형을 호환되는 다른 자료형으로 변경하는 기능 *논리형은 변환 불가
* 형변환 함수 종류 : toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
 */
// 형변환 함수 존재

/* 배열 Array<T>
* 처음선언 했던 배열의 크기를 변경할 수 없다는 단점이 있지만, 한 번 선언하면 다른 자료구조보다 빠르게 입출력 가능
*
* */



fun main() {
    var a : Int = 54321
    // 명시적 형변환 (explicit type casting) -> 암시적 형변환은 지원하지 않음
    //var b : Long = a  // kotline에서는 할당한 만다고 형변환되지 않음 (= 암시적 형변환)
    var b : Long = a.toLong() // 반드시 Int형 변수의 toLong() 함수를 호출하여 Long 변수로 변환된 값을 long으로 할당된 변수에 넣어주어야함


    // 배열
    var intArr = arrayOf(1,2,3,4,5)

    var nullArr = arrayOfNulls<Int>(5) // 꺽쇠 안에는 배열에 할당할 자료형을 지정
    intArr[2]=8
    println(intArr)
    println(intArr[4])
    println(intArr[2])
    println(nullArr)



}
