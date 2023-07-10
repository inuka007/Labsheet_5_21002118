package Tutorial_5

import scala.io.StdIn.readInt

object Q5  {

  def isEven(n: Int): Boolean = n match{
    case 0 => true;
    case _ => isOdd(n-1);
  }

  def isOdd(n: Int): Boolean = !(isEven(n));

  def sumEven(n: Int): Int = {
    if(n <= 0)  0;
    else if(isEven(n))  n + sumEven(n-2);
    else  sumEven(n - 1);
  }

  def ifEvenPrint(x: Int) = if(isEven(x)) println(sumEven(x) - x); else println(sumEven(x));

  def main(args: Array[String]): Unit = {
        printf("Enter the Number: ")
        var input: Int = readInt();
//        println(sumEven(10));

        ifEvenPrint(input);

  }
}

