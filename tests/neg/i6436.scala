import scala.quoted._

def f(sc: quoted.Expr[StringContext]): Unit = {
  sc match {
    case '{ StringContext(${ExprSeq(parts)}: _*) } => // error
      val ps: Seq[Expr[String]] = parts // error
  }
}