/**
  * Created by kkosittaruk on 21/08/2017.
  */
import WordCount.wordCount._
import WordCount.Texts._

object ScalaApplication {

  def main(args: Array[String]): Unit = {

    printMap(wordCount(short1))
    printMap(wordCount(short2))
    printMap(wordCount(short3))
    printMap(wordCount(short4))

    printMap(wordCount(long1))
    printMap(wordCount(long2))
  }

  def printMap(result: Map[String, Int]) = {
    result.foreach(a => println("word:" + a._1 + ",count:" + a._2))
  }
}
