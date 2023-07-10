package Tutorial_5

import scala.io.StdIn.readInt

object Q4  {

  def isEven(n: Int): Boolean = n match{
    case 0 => true;
    case _ => isOdd(n-1);
  }

  def isOdd(n: Int): Boolean = !(isEven(n));

  def display(x: Boolean) = if(x) println("Even Number"); else println("Odd Number");

  def main(args: Array[String]): Unit = {
    printf("Enter the integer: ")
    var input: Int = readInt();
    //    print(isEven(5));
    display(isEven(input));
  }
}