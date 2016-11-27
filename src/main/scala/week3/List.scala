package week3

/**
  * Created by devadasmallya on 11/26/16.
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}
