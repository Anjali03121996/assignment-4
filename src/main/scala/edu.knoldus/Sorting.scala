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
*/   def bubbleSort(list: List[Int]): List[Int] = {
    val arr=list.toArray
    for (i <- 1 to arr.length - 1) {
      for (j <- (i - 1) to 0 by -1) {
        if (arr(j) > arr(j + 1)) {
          var temp = arr(j + 1)
          arr(j + 1) = arr(j)
          arr(j) = temp
        }
      }
    }
    arr.toList
  }
  // def bubbleSort(list: List[Int]): List[Int] = ???

  def insertionSort(list: List[Int]): List[Int] = {

    val a = list.toArray
    for (i <- 1 until a.length) {
      // A[ i ] is added in the sorted sequence A[0, .. i-1]
      // save A[i] to make a hole at index iHole
      val item = a(i)
      var iHole = i
      // keep moving the hole to next smaller index until A[iHole - 1] is <= item
      while (iHole > 0 && a(iHole - 1) > item) {
        // move hole to next smaller index
        a(iHole) = a(iHole - 1)
        iHole = iHole - 1
      }
      // put item in the hole
      a(iHole) = item
    }
    a.toList

  }

}