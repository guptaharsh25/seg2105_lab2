// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

package design6;


import java.util.Arrays;

public class PointCPTestDesign6Cartesian {
  public static void main(String[] args){
    PointCPDesign6Cartesian point = null;
    PointCPDesign6Cartesian point2 = null;

    long[] constructorResult = testConstructor(point);
    long[] getPolarResult = testGetPolarCoordinates(point);
    long[] getCartesianResult = testGetCartesianCoordinates(point);
    long[] distanceResult = testDistance(point, point2);
    long[] rotationResult = testRotation(point);
    long[] polarToStringResult = testPolarToString(point);
    long[] cartesianToStringResult = testCartesianToString(point);

    System.out.println("--------------------------------------------------");
    System.out.println("---------------DESIGN 6 (Cartesian)---------------");
    System.out.println("--------------------------------------------------");
    System.out.println("Constructor: " + Arrays.toString(constructorResult));
    System.out.println("getPolar: " + Arrays.toString(getPolarResult));
    System.out.println("getCartesian: " + Arrays.toString(getCartesianResult));
    System.out.println("distance: " + Arrays.toString(distanceResult));
    System.out.println("rotate: " + Arrays.toString(rotationResult));
    System.out.println("polarString: " + Arrays.toString(polarToStringResult));
    System.out.println("cartesianString: " + Arrays.toString(cartesianToStringResult));

  }

  private static long[] testConstructor(PointCPDesign6Cartesian point){
    long start = 0;
    long end = 0;
    long[] tests = new long[25];

    for(int i = 0; i < 25; i++){
      start = System.currentTimeMillis();
      for(int j = 0; j < 300000; j++){
        point = new PointCPDesign6Cartesian(Math.random()*100, Math.random()*100);
      }
      end = System.currentTimeMillis();
      tests[i] = end - start;
    }

    Arrays.sort(tests);
    long[] ans = new long[3];
    ans[0] = tests[0];
    ans[1] = tests[12];
    ans[2] = tests[24];

    return ans;
  }

  private static long[] testGetPolarCoordinates(PointCPDesign6Cartesian point){
    point = new PointCPDesign6Cartesian(Math.random()*100, Math.random()*100);

    long start = 0;
    long end = 0;
    long[] tests = new long[25];

    for(int i = 0; i < 25; i++){
      start = System.currentTimeMillis();
      for(int j = 0; j < 300000; j++){
        point.getR();
        point.getTheta();
      }
      end = System.currentTimeMillis();
      tests[i] = end - start;
    }

    Arrays.sort(tests);
    long[] ans = new long[3];
    ans[0] = tests[0];
    ans[1] = tests[12];
    ans[2] = tests[24];

    return ans;
  }

  private static long[] testGetCartesianCoordinates(PointCPDesign6Cartesian point){
    point = new PointCPDesign6Cartesian(Math.random()*100, Math.random()*100);

    long start = 0;
    long end = 0;
    long[] tests = new long[25];

    for(int i = 0; i < 25; i++){
      start = System.currentTimeMillis();
      for(int j = 0; j < 300000; j++){
        point.getX();
        point.getY();
      }
      end = System.currentTimeMillis();
      tests[i] = end - start;
    }

    Arrays.sort(tests);
    long[] ans = new long[3];
    ans[0] = tests[0];
    ans[1] = tests[12];
    ans[2] = tests[24];

    return ans;
  }

  private static long[] testDistance(PointCPDesign6Cartesian point1, PointCPDesign6Cartesian point2){
    point1 = new PointCPDesign6Cartesian(Math.random()*100, Math.random()*100);
    point2 = new PointCPDesign6Cartesian(Math.random()*100, Math.random()*100);

    long start = 0;
    long end = 0;
    long[] tests = new long[25];

    for(int i = 0; i < 25; i++){
      start = System.currentTimeMillis();
      for(int j = 0; j < 300000; j++){
        point1.getDistance(point2);
      }
      end = System.currentTimeMillis();
      tests[i] = end - start;
    }

    Arrays.sort(tests);
    long[] ans = new long[3];
    ans[0] = tests[0];
    ans[1] = tests[12];
    ans[2] = tests[24];

    return ans;
  }

  private static long[] testRotation(PointCPDesign6Cartesian point){
    point = new PointCPDesign6Cartesian(Math.random()*100, Math.random()*100);

    long start = 0;
    long end = 0;
    long[] tests = new long[25];

    for(int i = 0; i < 25; i++){
      start = System.currentTimeMillis();
      for(int j = 0; j < 300000; j++){
        point.rotatePoint(Math.random()*360);
      }
      end = System.currentTimeMillis();
      tests[i] = end - start;
    }

    Arrays.sort(tests);
    long[] ans = new long[3];
    ans[0] = tests[0];
    ans[1] = tests[12];
    ans[2] = tests[24];

    return ans;
  }

  private static long[] testPolarToString(PointCPDesign6Cartesian point){
    point = new PointCPDesign6Cartesian(Math.random()*100, Math.random()*100);

    long start = 0;
    long end = 0;
    long[] tests = new long[25];

    for(int i = 0; i < 25; i++){
      start = System.currentTimeMillis();
      for(int j = 0; j < 300000; j++){
        point.polarToString();
      }
      end = System.currentTimeMillis();
      tests[i] = end - start;
    }

    Arrays.sort(tests);
    long[] ans = new long[3];
    ans[0] = tests[0];
    ans[1] = tests[12];
    ans[2] = tests[24];

    return ans;
  }

  private static long[] testCartesianToString(PointCPDesign6Cartesian point){
    point = new PointCPDesign6Cartesian(Math.random()*100, Math.random()*100);

    long start = 0;
    long end = 0;
    long[] tests = new long[25];

    for(int i = 0; i < 25; i++){
      start = System.currentTimeMillis();
      for(int j = 0; j < 300000; j++){
        point.cartesianToString();
      }
      end = System.currentTimeMillis();
      tests[i] = end - start;
    }

    Arrays.sort(tests);
    long[] ans = new long[3];
    ans[0] = tests[0];
    ans[1] = tests[12];
    ans[2] = tests[24];

    return ans;
  }
}
