object P02{
  def penultimate[A](list : List[A]) : A = list match{
    //Concats pattern matching
    case head :: last :: Nil => head
    case head :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }
}
