object ListQuestion3 extends App{

  // Count the number of elements in an array without using count, size or length operator

  def check[A](a: List[A]): Int = a.foldLeft(0) { (c, _) => c + 1}

  // Given list is List(2, 5, 1, 4, 3, 7, 8, 6, 0, 9)
  val number = List(2, 5, 1, 4, 3, 7, 8, 6, 0, 9)
  val result = check(number)

  // It prints the number of elements in an array.
  println(result)


}
