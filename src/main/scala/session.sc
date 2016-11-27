object session {

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def abs(d: Double) = if (d < 0) -d else d

    def isGoodEnough(guess: Double, x: Double): Boolean =
      abs(guess * guess - x) < 0.001

    def improve(guess: Double, x: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0, x)
  }

  def __sum(xs: List[Int]): Int = {
    def loop(acc: Int, lst: List[Int]): Int =
      if ( lst.isEmpty ) acc
      else loop(acc + lst.head, lst.tail)

    loop(0, xs)
  }

  // sqrt(2)
  // sqrt(4)

  def listIter(xs: List[Int]) = {
    def loop(lst: List[Int]): Int =
      if ( xs.isEmpty ) -1
      else {
        loop(lst.tail)
      }

    loop(xs)
  }

  def max(xs: List[Int]): Int = {
    def getMax(m: Int, head: Int): Int =
      if ( m > head ) m
      else head

    def loop(m: Int, lst: List[Int]): Int =
      if ( lst.isEmpty )  m
      else loop(getMax(m, lst.head), lst.tail)

    loop(xs.head, xs.tail)
  }

  val l = List(1, 72, 3)
  l.head
  l.head
  val x = l.tail
  x.tail

  __sum(l)

  max(l)
}


