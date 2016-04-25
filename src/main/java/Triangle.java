import java.util.*;
import java.util.Map;
import java.util.HashMap;


public class Triangle {

  public static String triangleTest(int side1, int side2, int side3) {
    String triangleReturn = "Not a triangle";
    if(side1 + side2 < side3 || side2 + side3 < side1 || side3 +side1 < side2){
      return triangleReturn;
    }else if (side1 != side2 && side1 != side3 && side2 != side3) {
      triangleReturn = "Scalene Triangle";
    } else if (side1 == side2 && side1 == side3) {
    triangleReturn = "Equilateral Triangle";
    } else {
      triangleReturn = "Isosceles Triangle";
    }
    return triangleReturn;
  }
}
