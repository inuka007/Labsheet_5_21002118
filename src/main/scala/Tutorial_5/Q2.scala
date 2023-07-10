package Tutorial_5

import scala.io.StdIn.readInt

object Q2 {

  def GCD(a: Int,b: Int): Int = b match{
    case 0 => a;
    case x if(x > a) => GCD(b,a);
    case _ => GCD(b, a % b)
  }

  def prime(p: Int,n: Int = 2): Boolean = n match{
    case x if(x == p) => true;
    case x if(GCD(p,x) > 1) => false;
    case x => prime(p, x+1)
  }

  def primeSeq(n: Int): Unit = {
    if(n > 1){
      if (prime(n))
        println(n);
      primeSeq(n - 1);
    }
  }

  def main(args: Array[String]): Unit = {
    printf("Enter the number: ")
    var input: Int = readInt();
//    primeSeq(10);
    primeSeq(input);
  }
}
