// 반복문과 증감연산자

/* 반복문 종류
* 조건형 반복문 : 조건이 참인 경우 반복 유지 (while, do while)
* 범위형 반복문 : 반복 범위를 정해 반복을 수행 (for)
* */

/* 증감연산자
* 전위연산자 : 연산자가 포함된 구문에서 이미 증감된 수를 반영하여 연산 진행
* 후위연산자 : 증가나 감소된 수를 해당 구문에서 사용하지 않고 다음 구문부터 사용
*
* */


fun main() {
    // 거짓일 경우 바로 다음 구문으로 이동
    while(a<5){
        println(a++)
    }

    // 거짓일 경우 바로 다음 구문으로 이동
    while(a<5){
        println(++a)
    }

    // (do while) 조건과 관계없이 반드시 한번은 실행
    var b = 0
    do
    {
        println(a++)
    } while (a<5)


    for(i in 0..9) {
        print(i) // print : 줄을 떼지 않고 '붙여서' 출력 , println : 줄을 떼고 출력
    }

    for(i in 0..9 step3){
        print(i)
    }


    for(i in 9 downTo 0){
        print(i)
    }

    for(i in 9 downTo 0 step3){
        print(i)
    }

    for (i in 'a'..'e') {
        print(i)
    }
}

