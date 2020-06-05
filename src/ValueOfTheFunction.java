public class ValueOfTheFunction {
  public static float f(float x){
    if(x<=-2) {
      return (float) (1-Math.pow(x+2,2));
    }
    else if (-2<x&&x<=2) {
      return -(x/2);
    }
    else
      return (float) (Math.pow(x-2,2)) + 1;
  }
}
