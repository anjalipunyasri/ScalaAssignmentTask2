object ListQuestion4 extends App{

  def display(arr:List[Int]): List[Int] = {
    val list = scala.collection.mutable.ListBuffer[Int]()
    arr.foreach{
      x =>
        x match {
          case _ if (x <0) => list+= (x *(-1) )
          case _ => list += x
        }
    }
    list.toList
  }

  // Given list is List(2, -4, 3, -1, 23, -4, -54)
  val a = List(2, -4, 3, -1, 23, -4, -54)
  val result = display(a)

  // It prints the Absolute value.
  println(result)

}
