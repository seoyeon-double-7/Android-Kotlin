import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton


/*
class 클래스이름(주 생성자 내용){
    //메서드 정의
}
 */

//생성자 overloading : 생성자를 여러개 정의 하는 것
//val은 바꿀 수 없는 멤버 변수가 된다
//var은 바꿀 수 있는 멤버 변수가 된다
//소괄호 안에는 속성 값들이 들어가게 된다.
//소괄호는 생성자 역할을 한다
class Person(
    val name: String,
    var age: Int,
//    오른쪽에 대입문 -> 값 안주면 쓸 '디폴트' 값
    var isAlive: Boolean = true
) {
    //    fun sayName() {
//        println(name)
//    }
    fun sayName(times: Int = 1) {
        for (i in 0..times) {
            println(name)
        }
    }
}

class Hello(var a: String) {
    //    이렇게 내부에도 속성 선언 가능
    /*
        단 이 경우,
        1. 값을 대입하거나
        2. nullable 타입으로 만들고 null을 대입하거나
        3. lateinit을 붙이고 반드시 사용전 초기화 (안드로이드에서 많이 씀)
     */
    lateinit var b: String
}

class MyClass {
    //lateinit => 초기화를 늦게 한다는 뜻 (생성자 호출 후)
//    lateinit => s 값이 접근하기 전에 반드시 "초기화"가 되어있다고
//    프로그래머가 약속을 해준 것이므로 nullable 타입이 아닐 수 있음
//    lateinit => 중괄호 안에 변수 선언할때 값을 안넣어주고 싶을 때 사용
    lateinit var s: String

    fun initString(str: String) {
        s = str
    }
    fun printString() = println(s)
}

//상속
//OPEN을 써야 상속이 됨
open class Person2(var name: String, var age: Int) {
//      반환값이 없으므로 unit이 생략됨
//        오버라이드를 가능하게 하려면 open을 붙여줘야함
    open fun eat(food: String): Unit {
        println("${name}이 ${food}를 먹습니다.")
    }

    fun sleep(hour: Int) {
        println("${name}이 ${hour} 시간동안 자고 있습니다.")
    }
}

class Employee(
//    부모의 속성이기 때문에 var/val을 쓰지 않는다.
    name: String, age: Int,
    var company: String, var salary: Int
)
//    extends 대신 :을 쓴다.
//    super 역할
    : Person2(name, age) {
//    부모 클래스에 있는 메소드를 재정의하려면 오버라이드를 써야한다.
    override fun eat(food: String){
        println("${name}이 ${food}를 허겁지겁 먹습니다.")
    }
    fun work(hour: Int): Int {
        println("${company}에 소속된 ${name}이(가) ${hour}시간동안 일을 합니다.")
        return hour
    }
}
// 인터페이스 : 설계도 역할
// 실제로 상속을 받는 클래스가 구현을 해야 됨
interface MyInterface {
    /*var a : String
    fun concreteMethod(): Int{
        return 10
    }*/
    fun abstractMethod(): Int
}
//인터페이스 예제
interface Shape{
//    면적 메소드
    fun calculateArea(): Double
//    둘레 메소드
    fun calculatePerimeter(): Double
}

class Rectangle(var width: Double, var height: Double): Shape {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2*(width + height)
    }

}
class Circle(var radius: Double): Shape {
    override fun calculateArea(): Double {
        return radius * radius * Math.PI
    }

    override fun calculatePerimeter(): Double {
        return 2 * radius * Math.PI
    }

}

// 인터페이스는 객체를 만들수 없으므로, 생성자를 호출할 수 없다! -> 인터페이스 이름만 쓰면 됨!
// 추상메소드는 반드시 내용을 만들어줘야된다!
class MyImpl : MyInterface {
    override fun abstractMethod(): Int {
        var a = 100
        return a
    }
}

fun main(args: Array<String>) {
    val p1 = Person("김철수", 20)

    p1.sayName()
    p1.sayName(2)
    println(p1.name)

    val mc = MyClass()
    mc.initString("Mirim")
    mc.printString()

    val emp = Employee("김미림", 20, "미림과학고", 2000)
    emp.eat("김밥")
    emp.sleep(8)
    emp.work(16)

    val r = Rectangle(10.0, 5.0)
    var c = Circle(5.0)
    println(r.calculateArea())
    println(r.calculatePerimeter())
    println(c.calculateArea())
    println(c.calculatePerimeter())

//    업캐스팅 : 부모타입으로 변환 해주는 것
//    다형성(polymophism) : 변환 (사각형 -> 원)
    var s: Shape = r
    println(s.calculateArea())
    println(s.calculatePerimeter())
    s =c
    println(s.calculateArea())
    println(s.calculatePerimeter())
    
//    object 키워드와 익명 클래스
//    클래스 정의와 추상 메서드 구현과 객체 생성을 한 큐에! (귀찮으니까)
    var o = object: MyInterface{
        override fun abstractMethod(): Int {
            return 100
        }
    }

//    swing import 꼭 하기
    var btn = JButton("Button")

//    ActionListener는 인터페이스
//    추상메소드가 1개 있고, 이를 함수형 인터페이스(SAM)라고 부름
    btn.addActionListener(object: ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            println("clicked!")
        }
    })
//    코드 줄이기
    btn.addActionListener {
        e-> println("clicked!")
    }
//    코드 완전 줄임
    btn.addActionListener {
        println("clicked! ${it}")
    }
}
