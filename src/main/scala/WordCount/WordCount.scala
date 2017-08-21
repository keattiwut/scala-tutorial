package WordCount

/**
  * Created by kkosittaruk on 19/08/2017.
  */

object wordCount {

  //Input: Hello World Hello Scala
  //Result: [Hello,2], [World,1], [Scala,1]

  def wordCount(word: String): Map[String, Int] = {
    word
      .split(" ")
      .groupBy(w => w)
      .mapValues(_.length);
  }



}
