public class APLine
{
  private int myA, myB, myC;
  public APLine(int a, int b, int c){
    myA = a;
    myB = b;
    myC = c;
  }
  public double getSlope(){
    return (double)-myA/myB;
  }
  public boolean isOnLine(int x, int y){
    if((myA*x) + (myB*y) + myC == 0){
      return true;
    }
    return false;
  }
}
