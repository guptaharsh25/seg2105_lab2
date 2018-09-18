public class PointCPDesign6Polar implements PointCPDesign6Interface {
    private double r;
    private double theta;

    PointCPDesign6Polar(double r, double theta){
        this.r = r;
        this.theta = theta;
    }

    public double getR(){return this.r;}
    public double getTheta() {
        return theta;
    }

    public double getX()
    {
        return (Math.cos(Math.toRadians(getTheta())) * getR());
    }

    public double getY()
    {
        return (Math.sin(Math.toRadians(getTheta())) * getR());
    }

    /**
     * Returns information about the coordinates in polar form.
     *
     * @return A String containing information about the coordinates in polar form.
     */
    public String polarToString()
    {
        return "Stored as Polar [" + getR() + "," + getTheta() + "]" + "\n";
    }

    /**
     * Returns information about the coordinates in cartesian form.
     *
     * @return A String containing information about the coordinates in cartesian form.
     */
    public String cartesianToString(){ return "Stored as Cartesian [" + getX() + "," + getY() + "]" + "\n";}
}
