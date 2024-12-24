```scala
object Main extends App {
  val list = List(1, 3, 5)
  
  //Solution 1: Using pattern matching
  val evenNumbers = list.filter(_ % 2 == 0)
  evenNumbers match {
    case head :: tail => println(head)
    case Nil => println("No even numbers found")
  }
  
  //Solution 2: Using headOption
  val evenHead = list.filter(_ % 2 == 0).headOption
  println(evenHead.getOrElse("No even numbers found"))
}
```