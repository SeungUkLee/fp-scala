package ch2

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class Ch2Suite extends FunSuite {

  import Ch2._

  test("[exercise 2-1]") {
    assert(fib(0) === 0)
    assert(fib(1) === 1)
    assert(fib(2) === 1)
    assert(fib(3) === 2)
    assert(fib(4) === 3)
    assert(fib(5) === 5)
    assert(fib(6) === 8)
  }

  test("[exercise 2-2]") {
    assert(isSorted(Array(1,2,3), (a: Int, b: Int) => a <= b))
    assert(isSorted(Array(3,2,1), (a: Int, b: Int) => a >= b))
  }

  test("[exercise 2-3]") {
    assert(curry((a:Int, b:Int) => a == b)(1)(1))
  }

  test("[exercise 2-5]") {
    assert(compose((a:Int) => "new value " + a, (a:Int) => 2 * a)(2) === "new value 4")
  }
}
