object ArrayQuestion1 extends App{

  def check(number: Array[Int]): Array[Int] = {

    val size = number.length
    var right_hand_num = number(size - 1)
    number(size - 1) = -1
    var temp = 0
    for (i <- size - 2 to 0 by -1) {
      temp = number(i)
      number(i) = right_hand_num
      if (right_hand_num < temp)
        right_hand_num = temp
    }
    number
  }

  // It prints original array
  val num = Array(9, 5, 8, 4, -10, 21, 6, 17, 11)
  println("Original array is :")
  for (x <- num) {
    print(s"${x}, ")
  }


  // It prints Updated array
  val result = check(num);
  println("\nUpdated array is :")
  for (x <- result) {
    print(s"${x}, ")
  }

}
