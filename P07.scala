object P07 {
    def flatten(ls: List[Any]): List[Any] = ls flatMap {
        case ms: List[_] => flatten(ms)
        case e => List(e)
    }
}

