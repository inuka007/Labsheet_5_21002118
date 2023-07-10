package Tutorial_5

import scala.io.StdIn.readInt

object Q3 {

  def sum(n: Int): Int = if(n != 0) (n + sum(n - 1)); else n;

  def main(args: Array[String]): Unit = {
    printf("Enter the number: ")
    var input: Int = readInt();
//    print(sum(5));
    print(sum(input));
  }
}
