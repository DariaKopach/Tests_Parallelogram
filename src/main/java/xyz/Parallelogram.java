package xyz;

/**
 * Classname: Parallelogram
 *
 * @author Kopach Daria
 * <p>
 * 1. Create tests and logs for parallelogram
 * 2. Create Pallindrom check
 * @version 09.08.2020
 */

public class Parallelogram {

    private int smallSide;
    private int bigSide;
    private double Angle;

    // 1. Constructor:
    // a) generate an empty constructor

    public Parallelogram() {
    }

    // b) generate the full constructor


    public Parallelogram(int smallside, int bigside, double angle) {
        this.smallSide = smallside;
        this.bigSide = bigside;
        this.Angle = angle;
    }

    // 2. Generate getters and setters

    public int getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(int smallSide) {
        this.smallSide = smallSide;
    }

    public int getBigSide() {
        return bigSide;
    }

    public void setBigSide(int bigSide) {
        this.bigSide = bigSide;
    }

    public double getAngle() {
        return Angle;
    }

    public void setAngle(double angle) {
        Angle = angle;
    }

    // 3. Create 5 methods for parallelogram

    /**
     * a) Method for calculating the perimeter
     *
     * @return parallelogram's perimeter
     */

    public double getPerimeter() {

        return 2 * (this.getSmallSide() + this.getBigSide());
    }

    /**
     * b) Method for calculating the area
     *
     * @return parallelogram's area
     */

    public double getArea() {
        return this.getSmallSide() * this.getBigSide() * Math.sin(this.getAngle());
    }

    /**
     * c) Method for calculating short diagonal
     *
     * @return int of short diagonal
     */

    public double getShortDiagonal() {

        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() - 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    /**
     * d) Method for calculating long diagonal
     *
     * @return int long diagonal
     */

    public double getLongDiagonal() {
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() + 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    /**
     * e) Method for checking if a parallelogram is rhombus
     *
     * @return if parallelogram is rhombus then 1 if not - 0
     */

    public int isRhombus() {
        return (this.getBigSide() == this.smallSide) ? 1 : 0;
    }

    // 4. Override toString() method

    @Override
    public String toString() {
        return "Parallelogram { " +
                "smallSide = " + smallSide +
                ", bigSide = " + bigSide +
                ", Angle = " + Angle +
                ",\n Perimeter = " + this.getPerimeter() +
                ",\n Area = " + this.getArea() +
                ",\n Short Diagonal = " + this.getShortDiagonal() +
                ",\n Long Diagonal = " + this.getLongDiagonal() +
                ",\n It is a rhombus = " + this.isRhombus() +
                '}';

    }
}