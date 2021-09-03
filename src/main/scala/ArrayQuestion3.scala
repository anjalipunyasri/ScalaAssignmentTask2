object ArrayQuestion3 extends App{

  def elements_compare(number: Array[Int]): Int = {
    var difference = Integer.MIN_VALUE;
    for (i <- 0 to number.length - 1) {
      for (j <- i + 1 to number.length - 1) {
        difference = Integer.max(difference, number(j) - number(i));
      }
    }
    return difference;
  }

  // It prints the original array

  val givenNumber = Array(2, 3, 1, 7, 9, 5, 11, 3, 5);
  println("Original array:")
  for (x <- givenNumber) {
    print(s"${x}, ")
  }

  //It prints the difference between two elements

  System.out.print(s"\n The maximum difference between two elements in the array is : ${elements_compare(givenNumber)}"
  )

}
