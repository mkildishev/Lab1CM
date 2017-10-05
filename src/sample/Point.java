package sample;

public class Point {
    private double X;
    private double V;

    public Point(double _X, double _V)
    {
        X = _X;
        V = _V;
    }

    public void setX(double _X) {
        X = _X;
    }

    public void setV(double _V) {
        V = _V;
    }

    public double getX() {
        return X;
    }

    public double getV() {
        return V;
    }
}
