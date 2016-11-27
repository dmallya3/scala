import week3.{Cons, Nil, List}

def selectNth[T](n: Int, l: List[T]): T =
  if (l.isEmpty)  throw new IndexOutOfBoundsException
  else if (n == 0) l.head
  else selectNth(n - 1, l.tail)

val l = new Cons[Int](1, new Cons[Int](2, new Nil))

selectNth[Int](2, l)
