import leo.training._

import org.scalatest._

class RecursionSpec extends FlatSpec with Matchers{
  "factImp with 1" should "be 1" in {
    val res = recursion.factImp(1)
    res should be (1)
  }

  "factImp with 3" should "be 6" in {
    recursion.factImp(3) should be (6)
  }

  "factRec with 1" should "be 1" in {
    val res = recursion.factRec(1)
    res should be (1)
  }

  "factRec with 3" should "be 6" in {
    recursion.factRec(3) should be (6)
  }

  "fibImp with 1" should "be 1" in {
    recursion.fibImp(1) should be (1)
  }

  "fibImp with 2" should "be 1" in {
    recursion.fibImp(2) should be (1)
  }

  "fibImp with 3" should "be 2" in {
    recursion.fibImp(3) should be (2)
  }

  "fibImp with 4" should "be 3" in {
    recursion.fibImp(4) should be (3)
  }

  "fibImp with 5" should "be 5" in {
    recursion.fibImp(5) should be (5)
  }

  "fibImp with 6" should "be 8" in {
    recursion.fibImp(6) should be (8)
  }


  "fibRec with 1" should "be 1" in {
    recursion.fibRec(1) should be (1)
  }

  "fibRec with 2" should "be 1" in {
    recursion.fibRec(2) should be (1)
  }

  "fibRec with 3" should "be 2" in {
    recursion.fibRec(3) should be (2)
  }

  "fibRec with 4" should "be 3" in {
    recursion.fibRec(4) should be (3)
  }

  "fibRec with 5" should "be 5" in {
    recursion.fibRec(5) should be (5)
  }

  "fibRec with 6" should "be 8" in {
    recursion.fibRec(6) should be (8)
  }
}
