import org.scalatest.funsuite.AnyFunSuite

class ArrayQuestion3Test extends AnyFunSuite{

  // Test cases are passed:
  test("Array Question 3"){
    assert(ArrayQuestion3.elements_compare(Array(2, 3, 1, 7, 9, 5, 11, 3, 5)) === 10)
  }

}
