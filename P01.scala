object P01{
  //Pattern Matching
  //Pulls one item out of the list (head) and the rest of the list (tail)
  def last[A](list : List[A]) : A = list match {
    //if pulling (head) out makes the list empty, return head
    case head :: Nil => head
    //if it doesn't, do recursion
    case head :: tail => last(tail)
    //if it is empty at the start
    case head            => throw new NoSuchElementException
  }
}
