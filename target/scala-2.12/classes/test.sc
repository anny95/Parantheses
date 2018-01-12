import scala.util.matching.Regex

val checkColon = "[a-z]|:| "
val checkEmoticons = ":\\(|:\\)"
val checkOpenClose = "\\(\\)"
val x = List(checkEmoticons, checkOpenClose).mkString("|")
"asjas:):):(()".replaceAll(x,"")