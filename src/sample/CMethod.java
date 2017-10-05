package sample;

import java.util.ArrayList;

abstract public class CMethod {
    private Point currentPoint;
    private int p;
    private ArrayList<Point> testPoints;
    private IFunction someFunc;
    private ArrayList<TableData> data;

    public CMethod(Point _currentPoint, int _p, ArrayList<Point> _testPoints,
                   IFunction _someFunc, ArrayList<TableData> _data)
    {
        currentPoint = _currentPoint;
        p = _p;
        someFunc = _someFunc;
        data = _data;
    }

    public void  Run()
    {

    }
    public Point NextStep(Point currP, double h)
    {
        double nX = GetNextX(currP.getX(), h);
        double nV = GetNextY(currP.getV(),currP.getX());
        return new Point(nX,nV);
    }

    private double GetNextX(double x,double h)
    {
        return x + h;
    }

    private double GetNextY(double y, double x)
    {
        return someFunc.func(y,x);
    }


}
