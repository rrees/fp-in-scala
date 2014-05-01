
object Sorted {

  def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def isSorted0(as: List[A], gt: (A,A) => Boolean): Boolean = {
      if(as.length == 1) true
      else {
        val a = as.head
        val b = as.tail.head

        if(!gt(a, b)) false
        else isSorted0(as.tail, gt)
      }
    }
    isSorted0(as.toList, gt)
  }

  def main(args: Array[String]) {
    println(isSorted(Array(1,2,3), (a: Int, b: Int) => b > a))
    println(isSorted(Array(1,3,2), (a: Int, b: Int) => b > a))
  }
}