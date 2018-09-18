public class PointCPDesign3 {
    private double x;
    private double y;

    PointCPDesign3(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getR(){return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));}
    public double getTheta() {
        return Math.toDegrees(Math.atan2(y, x));
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
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
