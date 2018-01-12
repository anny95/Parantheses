import org.scalatest.FunSuite
import ParanthesesMain._
import Utils._

/**
  * Created by Anny on 1/13/2018.
  */
class Parantheses extends FunSuite {

  test("Check str1") {
    assert(CheckText(str1) === NO)
  }

  test("Check str2") {
    assert(CheckText(str2) === YES)
  }

  test("Check str3") {
    assert(CheckText(str3) === YES)
  }

  test("Check str4") {
    assert(CheckText(str4) === YES)
  }

  test("Check str5") {
    assert(CheckText(str5) === NO)
  }

  test("Check str6") {
    assert(CheckText(str6) === NO)
  }

  test("Check str7") {
    assert(CheckText(str7) === YES)
  }

  test("Check str8") {
    assert(CheckText(str8) === YES)
  }

  test("Check str9") {
    assert(CheckText(str9) === NO)
  }
}