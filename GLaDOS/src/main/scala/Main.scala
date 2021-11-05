package GLaDOS

import GLaDOS.Quote

object Main {
  def main(args: Array[String]): Unit = {
    val quote = Quote.getRandomQuotes
    println(quote)
  }
}
