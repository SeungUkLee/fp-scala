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
}
