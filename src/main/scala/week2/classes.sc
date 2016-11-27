object rationals {
  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)

  def singleton(elem: Int): Set = {
    x => x == elem
  }

  contains(x => true, 5)
  val s1 = singleton(1)
  contains(s1, 10)
}