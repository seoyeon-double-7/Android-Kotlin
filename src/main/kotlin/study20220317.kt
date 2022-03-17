fun main(args: Array<String>) {
//    배열, 크기를 정하지 않아도 arrayOf() 함수를 사용해서 값을 저장한다
//    배열에 다른 타입 값을 넣어도 자동 형변환(타입추론)을 해준다
    var nums = arrayOf(100, "Hello", 3.14)

//    in 연산자 : 값의 포함여부를 파악하기 위함(true, false를 반환)
    println(100 in nums)    //100이 포함되어 있으므로 true
    println(300 in nums)    //300이 포함되어 있지 않으므로 false

//    listOf 함수를 쓰면 ArrayList를 만든다
//    ArrayList는 길이를 유동적으로 조절할 수 있다
    var strs = listOf("Hello", "Kotlin")
    println("Java" in strs)

//    이터러블이 가능하면 in 연산자를 쓸 수 있다.
    var s = "Hello"
    println("e" in s)

//    H, e, l, l, o 한글자씩 출력됨
    for(c in s){
        println(c)
    }
//    for (i in 1 .. 10) {}  <= 자동생성
//    range 객체생성
//    var range = 5 .. 10

//    반복을 위해 사용되는 in 연산자
//    for(i in 5 .. 10){
//        println(i)
//    }

//    var score = 100
//    값이 없는 변수는 타입을 선언해야한다
//    var grade: String
//    if(score == 100){
//        grade = "A"
//    }else if(score <= 90){
//        grade = "B"
//    }else {
//        grade = "F"
//    }
//    println(grade)

    var score = 90
    var grade = if(score == 100){
        println("잘했습니다.")
        "A"
    }else if(score >= 90) {
        println("적당함.")
        "B"
    }else{
        "F"
    }
    println(grade)
}