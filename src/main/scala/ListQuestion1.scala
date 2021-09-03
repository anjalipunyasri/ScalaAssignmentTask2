object ListQuestion1 extends App{

  def display[A](arr:List[A],n:Int):List[A] = {
    arr flatMap{ element => List.fill(n)(element) }
  }

  //It first prints the given list.
  val number = List(1,2,3,4)
  println("Given list is : " + number)
  val result = display(number,3)
  // It prints the output in a single line by using for each method.
  val output = result.foreach(println(_))

}
