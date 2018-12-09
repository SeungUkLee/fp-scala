package ch2

object ch2 {

  def fib(n: Int): Int = {
    def loop(n: Int): Int = {
      if (n == 0) 0
      else if (n == 1) 1
      else loop(n-1) + loop(n-2)
    }
    loop(n)
  }
}
