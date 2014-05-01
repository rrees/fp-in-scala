
object Fib {

  def fib(n: Int) : Int = {
    @annotation.tailrec
    def fib0(n : Int, p1: Int, p2: Int) : Int = {
      if(n < 1) p1
      else fib0(n-1, p2, p1 + p2)
    }
    fib0(n, 0, 1)
  }

  def main(args: Array[String]) {
    Array(0, 1, 2, 3, 4, 5).foreach {i: Int => println(fib(i))}
  }
}