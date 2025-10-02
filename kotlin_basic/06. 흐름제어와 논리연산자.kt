// 흐름제어와 논리연산자

/*
* return : 함수를 종료하고 값을 반환
* break : 반복문이 실행되는 중간에 즉시 반복문을 '종료'하고 다음 구문으로 넘어가는 역할
* continue : 다음 반복 조건으로 넘어가는 역할
* */

/* 논리 연산자
* && = and 연산자 :
* || = or 연산자 :
* ! = not 연산자 :
* */

fun main() {
    for (i in 1..10) {
        if (i==3) break
        println(i)
    }

    for (i in 1..10) {
        if (i==3) continue
        println(i)
    }

    // 다중반복문에서 i=1, j=2일때 종료되어야 할 경우 (고전 방법)
    for (i in 1..10) {
        for (j in 1..10){
            if (i ==1 & j==2) break
        }
        // 여기서도 break해서 수동으로 종료해야함
    }

    // 다중반복문에서 i=1, j=2일때 종료되어야 할 경우 (kotlin에서 사용하는 방법)
    loop@for (i in 1..10) {
        for (j in 1..10){
            if (i ==1 & j==2) break@loop
            println("i:$i, j:$j") // 변수명 앞에 $ 표시하면됨
        }
    }




}