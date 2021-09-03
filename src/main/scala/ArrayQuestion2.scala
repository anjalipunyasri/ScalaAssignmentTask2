object ArrayQuestion2 extends App{

  // Here I am taking a function and implementing the logic
  def check(number: Array[Int]) = {

    var maximum_product = Integer.MIN_VALUE;
    var max1 = -1
    var max2 = -1;

    for ( i<- 0 to number.length - 1)
    {
      for (j<- i + 1 to  number.length - 1)
      {
        if (maximum_product < number(i) * number(j))
        {
          maximum_product = number(i) * number(j);
          max1 = i;
          max2 = j;
        }
      }
    }
    // Here it is multiplying the two maximum numbers
    val result = number(max1) * number(max2)
    result

  }

  // print the resultant output
  val number = Array(2, 3, 5, 7, -7, 5, 8, -5 );
  val output = check(number)
  println(output)


}
