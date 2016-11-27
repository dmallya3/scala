object exercise {
  def _sum(f: Int => Int, a: Int, b: Int): Int =
    if ( a > b )  0
    else f(a) + _sum(f, a+1, b)

  def sumCubes(a: Int, b: Int) = _sum(x => x * x * x, a, b)
  def sumInts(a: Int, b: Int) = _sum(x => x, a, b)

  sumCubes(2, 5)
  sumInts(2, 10)

}