val s1 = " John 123123~@: DOE,,";
val s2 = " Doe JANE "

val r = """([^a-zA-Z]*)([a-zA-Z]+)([^a-zA-Z]*)([a-zA-Z]+)([^a-zA-Z]*)""".r

def matching(s: String) = s match {
  case r(a,b,c,d,e) => println(b.map(_.toUpper),d.map(_.toUpper))   
  case _ => println("no match")
}

matching(s1)
matching(s2)
