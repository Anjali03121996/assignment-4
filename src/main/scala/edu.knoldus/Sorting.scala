package edu.knoldus

class Sorting {

  //def insertionSort(list: List[Int]): List[Int] = ???

  def selectionSort(list: List[Int]): List[Int] = {

    val arr = list.toArray
    for ( i <- 0 until arr.length-1) {
      var min = i
      for ( j <- i + 1 until arr.length) {
        if (arr(j) < arr(min)) min = j
      }
      if (i != min) {
        val temp = arr(i)
        arr(i) = arr(min)
        arr(min) = temp

      }
    }
    arr.toList
  }

  /*  if (list.isEmpty) List()
    else {
      val list2 = minimum(list)
      if (list2.tail.isEmpty)
        list2
      else
        list2.head :: selectionSort(list2.tail)
    }

  def minimum(list: List[Int]): List[Int] =
    (List(list.head) /: list.tail) {
      (list2, x) =>
        if (x < list2.head) (x :: list2)
        else (list2.head :: x :: list2.tail)
    }
*/
  // def bubbleSort(list: List[Int]): List[Int] = ???
}