package example

object DWT {

  private def d(p1: Int, p2: Int): Int = Math.abs(p1 - p2)
  private def min3(a: Int, b: Int, c: Int): Int = Math.min(Math.min(a, b), c)

  def distance(s: Seq[Int], t: Seq[Int]): Int = {
    val arr: Array[Array[Int]] = Array.ofDim[Int](s.length + 1, t.length + 1)
    for {
      i <- 0 to s.length
      j <- 0 to t.length
    } arr(i)(j) = Int.MaxValue
    arr(0)(0) = 0

    for {
      i <- 1 to s.length
      j <- 1 to t.length
    } {
      val cost = d(s(i-1), t(j-1))
      arr(i)(j) = cost + min3(arr(i-1)(j), arr(i)(j-1), arr(i-1)(j-1))
    }
    arr(s.length)(t.length)
  }


}
