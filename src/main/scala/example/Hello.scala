package example

object Hello extends App {
  def comb2(n: Int): Int = (n * (n - 1)) / 2
  def combAll(n: Int): Int = (1 to n).map(comb2).sum

  val phrase = List(43, 50, 59, 57, 59, 50, 59, 50, 43, 50, 59, 57, 59, 50, 59, 50, 43, 52, 60, 59, 60, 52, 60, 52, 43, 52, 60, 59, 60, 52, 60, 52, 43, 54, 60, 59, 60, 54, 60, 54, 43, 54, 60, 59, 60, 54, 60, 54, 43, 55, 59, 57, 59, 55, 59, 55, 43, 55, 59, 57, 59, 55, 59, 54, 43, 52, 59, 57, 59, 55, 54, 55, 52, 55, 54, 55, 47, 50, 49, 47, 49, 55, 57, 55, 57, 55, 57, 55, 49, 55, 57, 55, 57, 55, 57, 55, 54, 57, 62, 61, 62, 57, 55, 57, 54, 57, 55, 57, 50, 54, 52, 50, 40, 47, 55, 54, 55, 47, 55, 47, 40, 47, 55, 54, 55, 47, 55, 47, 40, 49, 50, 52, 50, 49, 47, 45, 55, 54, 52, 62, 61, 59, 57, 55, 54, 52, 50, 62, 57, 62, 54, 57, 50, 52, 54, 57, 55, 54, 52, 50, 56, 50, 53, 52, 53, 50, 56, 50, 59, 50, 53, 52, 53, 50, 56, 50, 48, 52, 57, 59, 60, 57, 52, 50, 48, 52, 57, 59, 60, 57, 54, 52, 51, 54, 51, 54, 57, 54, 57, 54, 51, 54, 51, 54, 57, 54, 57, 54, 55, 54, 52, 55, 54, 55, 57, 54, 55, 54, 52, 50, 48, 47, 45, 43)

  val firstEightPhrase: List[Int] = phrase.take(8)
  println(firstEightPhrase)

  val eightPhrases: List[List[Int]] = phrase.sliding(8).toList

  val distances: List[(List[Int], Int)] = eightPhrases.map(s => (s, DWT.distance(firstEightPhrase, s)))
  distances.foreach { case (phrase, distance) =>
    println(phrase.mkString(" ") + " distance: " + distance)
  }
  distances.map(_._2).foreach(println)


}
