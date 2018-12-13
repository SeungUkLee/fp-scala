package ch2

object Ch2 {

  // exercise 2-1
  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, pre: Int, cur: Int): Int = {
      if (n == 0) cur
      else loop(n-1, pre+cur, pre)
    }
    loop(n, 1, 0)
  }

  // exercise 2-2
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (!ordered(as(n), as(n+1))) false
      else loop(n+1)
    }
    loop(0)
  }

}
