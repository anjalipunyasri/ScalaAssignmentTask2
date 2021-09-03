import org.scalatest.funsuite.AnyFunSuite

class ListQuestion4Test extends AnyFunSuite{

  // Test cases are passed:
  test("List Question 4"){
    assert(ListQuestion4.display(List(2, -4, 3, -1, 23, -4, -54)) === List(2,4,3,1,23,4,54))
  }

}

