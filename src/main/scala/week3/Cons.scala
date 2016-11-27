package week3

/**
  * Concrete implementation of List[T]
  * Created by devadasmallya on 11/26/16.
  */
class Cons[T](val head: T, val tail: List[T]) extends List[T] {   // NOTE: head and tail param names are implementations of functions in base trait
  override def isEmpty: Boolean = false
}

