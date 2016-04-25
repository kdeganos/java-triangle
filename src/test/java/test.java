import org.junit.*;
import static org.junit.Assert.*;

public class test {

  @Test
  public void triangleTest_inputOfThreeEqualSides_isAEquilateralTriangle() {
  Triangle triangle = new Triangle();
  String expected = "Equilateral Triangle" ;
  assertEquals(expected, triangle.triangleTest(2,2,2));
  }

  @Test
  public void triangleTest_inputOfTwoEqualSides_isAIsoscelesTriangle() {
  Triangle triangle = new Triangle();
  String expected = "Isosceles Triangle" ;
  assertEquals(expected, triangle.triangleTest(2,2,3));
  }

  @Test
  public void triangleTest_inputOfNoEqualSides_isAScaleneTriangle() {
  Triangle triangle = new Triangle();
  String expected = "Scalene Triangle" ;
  assertEquals(expected, triangle.triangleTest(1,2,3));
  }

  @Test
  public void triangleTest_inputOfInvalidSidesForTriangle_isNotATriangle() {
  Triangle triangle = new Triangle();
  String expected = "Not a triangle" ;
  assertEquals(expected, triangle.triangleTest(3,3,7));
  }
}
