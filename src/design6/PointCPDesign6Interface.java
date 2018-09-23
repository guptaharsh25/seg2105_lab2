package design6;

public interface PointCPDesign6Interface {
    double getR();
    double getTheta();
    double getX();
    double getY();

    double getDistance(PointCPDesign6Interface pointB);
    PointCPDesign6Interface rotatePoint(double rotation);


    String polarToString();
    String cartesianToString();
}
