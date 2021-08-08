package GLaDOS

import scala.io.Source
import scala.util.Random


object Main {
  def main(args: Array[String]): Unit = {
    val linesIter: Seq[String] = Source.fromResource("GLaDOS_quotes.txt").getLines.toSeq
    val lineNums: Int = linesIter.length
    val randLine: String = linesIter(Random.between(0, lineNums))
    println(randLine)
  }
}
