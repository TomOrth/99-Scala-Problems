object P05{
  def reverse[A](list : List[A]): List[A] = list match{
    case head :: Nil => List[A](head)
    //::: prepends a list to the front of another list
    case head :: tail => reverse(tail) ::: List[A](head)
    case _ => throw new NoSuchElementException
  }
}
