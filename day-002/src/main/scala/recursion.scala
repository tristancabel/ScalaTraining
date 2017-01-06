package leo.training
//Day 2
//Recursion and High orderr Functions


object recursion {

  def main (args: Array[String]) = {
    println("This is a test")
  }

  //Exercise 1
  //Write a function for Factorial in an imperative way
  //Write the test for it too under the src/test/scala directory
  def factImp(n: Int): Int = {
    var count=n
    var res=1
    while(count > 0) {
      res = res*count
      count = count -1
    }

    res
  }

  //Exercise 2.a
  //Write a function for Factorial in a recursive way, try to make it tail recursive
  //Write the test for it too under the src/test/scala directory
  def factRec(n: Int): Int = {
    @annotation.tailrec
    def go(acc: Int, n: Int) : Int ={
      if(n <= 0 ) acc
      else go(acc*n, n-1)
    }

    go(1,n)
  }


  //Exercise 3
  //Write a Fibonacci function in an imperative way
  //The function must find the Nth Fibonacci Element
  //Write the test for it too under the src/test/scala directory
  def fibImp(n: Int): Int = {
    var res=0
    var minOne=0
    var minTwo=0

    var count=1
    while( count <= n) {
      res = if(count <= 2) 1 else minOne + minTwo

      //update minOne and minTwo
      minTwo = minOne
      minOne = res

      count = count + 1
    }
    res
  }


  //Exercise 4
  //Write a Fibonacci function in a recursive way, try to make it tail recursive
  //Write the test for it too under the src/test/scala directory
  def fibRec(n: Int): Int = {
    @annotation.tailrec
    def fib(i: Int, n: Int, resMinOne: Int=1, resMinTwo: Int=0): Int = {
      if(n <= 2) 1
      else {
        if(i >= n) resMinOne + resMinTwo
        else fib(i+1,n, resMinOne + resMinTwo, resMinOne)
      }
    }

    fib(2,n)
  }
}
