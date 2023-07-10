package Tutorial_5

import scala.io.StdIn.readInt

object Q6 {

  def fibonacci(n: Int): Int = n match{
    case 0 => 0;
    case x if(x == 1) => 1;
    case _ => fibonacci(n - 1) + fibonacci(n - 2);
  }

  def fibonaccidisplay(n: Int): Unit = {
    if(n > 0)
      fibonaccidisplay(n - 1);
    println(fibonacci(n));
  }
  def main(args: Array[String]): Unit = {
        printf("Enter the number: ")
        var input: Int = readInt();
    fibonaccidisplay(input);

  }
}
