class Foo {
  import scala.quoted._

  def f(sc: quoted.Expr[StringContext])(using QuoteContext): Unit = {

    val '{ StringContext(${parts}: _*) } = sc
    val ps0: Expr[Seq[String]] = parts

    val '{ StringContext(${ExprSeq(parts2)}: _*) } = sc
    val ps: Seq[Expr[String]] = parts2
  }
}