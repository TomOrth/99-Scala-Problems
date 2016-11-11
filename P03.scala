object P03{
  def nth[A](n : Int, list : List[A]) : A = (n, list) match{
    //pattern matching at a given index
    case (0, h :: _) => h
    case (n, _ :: tail) => nth(n-1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }
}
