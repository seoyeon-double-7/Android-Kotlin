fun main(args: Array<String>) {
    println("Hello World!")

//  var로 변수 선언하는데, 타입은 안써도 타입 추론을 해줌
    var a: Int = 100
    var s = "Hello"

//  상수(val)
    val PI = 3.14
    
//  문자열 템플릿
    var score = 100
    var t = "My score is ${score}"
    println(t)

//    any는 오브젝트
//    형을 꼭 써주는 것이 좋다.
//    코틀린은 자바 기반 언어
    var a1 : Any = 100
    a1 = "Hello"

//    nullable 타입
//    String s = null;
//    nullable 타입을 붙이려면 형에 ?를 붙여야 한다.
    var b1 : String? = "Hello"
    b1 = null
    var b2 : Int? = 100
    b2 = null

//    var name = "John"
//    println(name.length)

    var name2 : String? = null
//    println(name2.length)
    
//    스마트 캐스트 -> String?에서 스트링 타입으로 변환해준다
//    if(name2 != null){
//        println(name2.length)
//    }
    
//    안전한 접근 연산자(safe call operator)
//    null이면 null을 리턴한다.
    
//    null을 찾음
//    println(name2?.length)

//    !!. => null 값이 아님을 보장하는 연산자
//    강제로 non-nullable 타입으로 형변환
//    그 과정에서 문제가 생기면 NullPointerExeception이 발생
//    println(name2!!.length),

//    엘비스 연산자
//    왼쪽 값이 null이면 오른쪽 값을 대입
//    왼쪽 값이 null이 아니면 왼쪽 값을 대입(default)
    var c1 = null ?: 1
    var c2 = 2 ?: 1

    var arg : String? = "김미림"
    var n = arg?: "무명씨"

}