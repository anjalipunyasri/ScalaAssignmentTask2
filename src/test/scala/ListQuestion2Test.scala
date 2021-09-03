import org.scalatest.funsuite.AnyFunSuite

class ListQuestion2Test extends AnyFunSuite{

  // Test cases are passed:
  test("List Question 2"){
   assert(ListQuestion2.display(List(2,5,3,4,6,7,8,9)) === List(5,4,7,9))
  }

}
