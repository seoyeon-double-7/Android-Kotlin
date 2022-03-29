//데이터 클래스
//데이터 > 메소드

data class Person10(var name: String, var age: Int)
data class Point(var x: Int, var y: Int)

//    내부 클래스 (or 내부 인터페이스)
class Outer() {
    //    내부클래스 Inner
    class Inner() {
    }
    //    내부인터페이스
    interface InnerInterface {
    }
}
class Impl : Outer.InnerInterface {}

// 클래스 함수, 상수
class CompanionDemoClass {
    fun myMethod() {}

    companion object{
        val CLASS_CONSTANT_VALUE = 100
        var classVariable = 0
        fun classMethod() {
            classVariable++
        }
    }
}

fun main(args: Array<String>) {
    var p = Person10("김미림", 18)
    var p2 = Person10("김미림", 18)
    var po = Point(0, 5)

    println(p.toString())
    println(p)
    println(po)

//    equals 메서드
//    == <= 이 연산자가 객체 비교에 쓰이면
//    코틀린에서는 == 연산자가 equals의 역할을 함
//    그리고 === 연산자가 자바의 == 연산자(참조 비교 연산자)임
    println(p == p2)    //true (내용이 같으므로)
    println(p === p2)   //false (참조가 다르므로)


    var inner = Outer.Inner()

    println( CompanionDemoClass.CLASS_CONSTANT_VALUE)
    println( CompanionDemoClass.classVariable)
    CompanionDemoClass.classMethod()
}