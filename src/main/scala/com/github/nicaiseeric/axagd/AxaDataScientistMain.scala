package com.github.nicaiseeric.axagd

import scala.annotation.tailrec

object AxaDataScientistMain {
  def main(args: Array[String]) {
    
    (0 to 10).foreach(i => println(s"i=$i => ${combiFun(i)}"))

    val i = 50
    println(s"i=$i, count: Int ")
    time[Long](countCombi(50))
  }

  def combiFun(n: Int): Long = if(n <= 0) 0L else countCombi(n)

  /**
   *
   * @param n the value we seek for the number of decompositions such that n = 2 * a + b
   * @return the numbers of combinaisons  by relying on tailRec
   */
  def countCombi(n: Int): Long = {
    @tailrec
    def countCombIter(m: Int, count: Long): Long = {
      if (m == 0)
        count + 1
      else if (m < 0)
        count
      else
        countCombIter(m - 1, count + countCombi(m - 2))
    }

    countCombIter(n, 0)
  }

  /**
   *
   * @param block the function/block to evaluate time
   * @tparam R the tye of the last instruction with the block
   * @return the execution time of block of instructions
   */
  def time[R](block: => R): R = {
    val t0 = System.currentTimeMillis()
    val result = block    // call-by-name
    val t1 = System.currentTimeMillis()
    println("Result: " + result)
    println("Elapsed time: " + (t1 - t0)/1e3 + " s")
    result
  }

}

