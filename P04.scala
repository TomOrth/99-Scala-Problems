object P04{
  def length[A](list : List[A]) : Int = list match{
    case _ :: Nil => 1
    case head :: tail => 1 + length(tail)
    case _ => throw new NoSuchElementException
  }
}
