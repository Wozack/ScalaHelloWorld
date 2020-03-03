object Main extends App {

    println(numWorker(2, 8, 34))


def numWorker(A: Int, B: Int, C: Int): Int = {
    var list = List(A, B, C)

    var newList = list.sorted

    var sum = (newList(1) + newList(2)) * newList(0)

    sum
   }
}


