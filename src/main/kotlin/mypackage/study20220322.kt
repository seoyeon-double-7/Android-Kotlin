//내부 안에 func 함수를 f 별칭을 바꿈
import mypackage.func as f
import mypackage.Myclass

//모두 import 시키는 것
//import mypackage.*

fun main(args: Array<String>){
    f()
    val mc = Myclass()
    
//  type -> int, 타입추론 가능
//  타입 => 하나의 정수를 전달받아 정수를 반환하는 함수 타입

    var square:
            (Int) -> Int
            =
        {
            number: Int ->
            println(number)
            number * number
        }
    var sum:
            (Int, Int) -> Int
            =
        {
            x:Int, y: Int ->
            x + y
        }
//    파라미터를 쓸 필요가 없다.(void타입)
//    Unit은 리턴 값이 없는 것
/*    var sayHello:
            () -> Unit
            =
        {
            println("Hello")
        }
        sayHello()
//    함수에 대입이 가능하다
        sayHello = {println("Bye")}
        sayHello()

 */

//    변수 -> it이라고 부를 수 있음
    val sayHelloTo: (String) -> Unit ={
        println("Hello ${it}")
    }
    sayHelloTo("John")
}