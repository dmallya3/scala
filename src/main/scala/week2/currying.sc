object currying {
  def mapReduce ( f: Int => Int, combine: (Int, Int) => Int, zero: Int, a: Int, b: Int ): Int =
    if ( a > b )  zero
    else combine( f(a), mapReduce(f, combine, zero, a + 1, b) )

  def product ( f: Int => Int )( a: Int, b: Int ): Int = mapReduce(f, (x, y) => x * y, 1, a, b)


  def factorial ( a: Int ): Int = product(x => x)(1, a)

  product(z => z * z)(3, 4)
  factorial(5)
}