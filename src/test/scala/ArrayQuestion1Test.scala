import org.scalatest.funsuite.AnyFunSuite

class ArrayQuestion1Test extends AnyFunSuite{

  // Test cases are passed:
  test("ArrayQuestion1"){
    assert(ArrayQuestion1.check(Array(9, 5, 8, 4, -10, 21, 6, 17, 11)) === Array(21, 21, 21, 21, 21, 17, 17, 11, -1))
  }

}
