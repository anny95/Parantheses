import Utils._
/**
  * Created by Anny on 1/13/2018.
  */
object CheckText {
  def apply(str: String): String = {
    val checkCharacters = "[a-z]|:| "
    val checkSmily = ":\\)"
    val checkSad = ":\\("
    val checkOpenClose = "\\(\\)"

    val orderedChecks = List(checkCharacters, checkSmily, checkSad, checkOpenClose)
      .permutations

    if (orderedChecks.exists { checks =>
      str
        .replaceAll(checks(0), "")
        .replaceAll(checks(1), "")
        .replaceAll(checks(2), "")
        .replaceAll(checks(3), "")
        .length == 0
    })
      YES
    else
      NO
  }
}
