package ch3

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class Ch3Suite extends FunSuite {

  test("[exercise 3-2]") {
    assert(List.tail(List(1,2,3)) === Cons(2, Cons(3, Nil)))
    assert(List.tail(List(Nil)) === Nil)
  }

  test("[exercise 3-3]") {
    assert(List.setHead(List(2,3,4), 1) === Cons(1, Cons(3, Cons(4, Nil))))
  }

  test("[exercise 3-4]") {
    assert(List.drop(List(1,2,3), 1) === Cons(2, Cons(3, Nil)))
    assert(List.drop(List(1,2,3), 2) === Cons(3, Nil))
    assert(List.drop(List(1,2,3), 3) === Nil)
    assert(List.drop(List(1,2,3), 4) === Nil)
  }

  test("[exercise 3-5]") {
    assert(List.dropWhile(List(1,3,2,4,6), (x:Int) => (x < 3)) === Cons(3, Cons(2, Cons(4, Cons(6, Nil)))))
  }
}
