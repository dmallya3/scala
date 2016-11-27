package week3

/**
  * Created by devadasmallya on 11/26/16.
  */
class Nil[T] extends List[T] {
  override def isEmpty: Boolean = true

  override def head: Nothing = throw new NoSuchElementException("Nil.head")

  override def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}
