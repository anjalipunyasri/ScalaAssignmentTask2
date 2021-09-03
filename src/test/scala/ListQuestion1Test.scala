import org.scalatest.funsuite.AnyFunSuite

class ListQuestion1Test extends AnyFunSuite{

  // Test cases are passed:
  test("ListQuestion1"){
    assert(ListQuestion1.display(List(1,2,3,4),3) === List(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4))
  }


}
