object week2 {
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }

  sum(x => x)(1, 4)
  sum(x => x*x)(2, 4)

  //   b = 3
  //   a = 1, 2, 3
  // acc = 0, 1, 3

}