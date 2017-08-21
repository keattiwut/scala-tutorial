/**
  * Created by kkosittaruk on 19/08/2017.
  */
object RiceCalculator {

    //Input: (2,2)
    //Result 1: List(1,2,4,8)
    //Result 2: 15

    // 1 1
    // 2 2
    // 3 4
    // 4 8
    // 5 16
    // 6 32

  def riceTotal(x: Int, y: Int) = {
    val dimension = x * y
    val dimensionList = (1 to dimension)
      .toList
      .map(n => math.pow(2, n))

    dimensionList.foreach(println)

    val sum = dimensionList.foldLeft(0.0)(_ + _)
    println("sum:" + sum)
  }

}
