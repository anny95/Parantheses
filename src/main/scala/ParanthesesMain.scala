import Utils._

/**
  * Created by Anny on 1/12/2018.
  */
object ParanthesesMain {

  def main(args: Array[String]): Unit = {

    textToCheck.foreach(text => println(s"$text  =>  ${CheckText(text)}"))

  }
}
