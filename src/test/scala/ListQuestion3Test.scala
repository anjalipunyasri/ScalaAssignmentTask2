import org.scalatest.funsuite.AnyFunSuite

class ListQuestion3Test extends AnyFunSuite{

  // Test cases are passed:
  test("List   Question 3"){
    assert(ListQuestion3.check(List(2, 5, 1, 4, 3, 7, 8, 6, 0, 9)) === 10 )
    assert(ListQuestion3.check(List(2, 5, 1, 4, 3, 7)) === 6 )
  }

}
