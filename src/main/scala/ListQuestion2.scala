object ListQuestion2 extends App{

  // It prints a new list by removing the elements at odd positions
  def display[A](arr:List[A]):List[A] = (arr.indices.collect { case i if i % 2 == 1 => arr(i) }).toList
  // It prints the given list
  val myList = List(2,5,3,4,6,7,8,9)
  println(myList)
  val result = display(myList)
  // It prints the expected output in a new line
  val output = result.foreach(println(_))

}
