```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)
  val evenNumbers = list.filter(x => x % 2 == 0)
  println(evenNumbers.head) // Potential error: NoSuchElementException
}
```