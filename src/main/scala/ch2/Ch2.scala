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

  // exercise 2-3
  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    a => b => f(a,b)
  }

  // exercise 2-5
  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    a => f(g(a))
  }
}
