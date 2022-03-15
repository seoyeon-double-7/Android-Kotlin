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

    var name = "John"
    println(name.length)

    var name2 : String? = "sally"
//    println(name2.length)
    
//    스마트 캐스트 -> String?에서 스트링 타입으로 변환해준다
    if(name2 != null){
        println(name2.length)
    }
}