//Print all midpoints between point a and b
//while distance of each points is less than "1"

import java.util.*;

public class Midpoint {
    public class Point{
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public void run(double x1, double y1, double x2, double y2){
        printPoints(midpoints(new Point(x1, y1), new Point(x2, y2)));
    }

    public void printPoints(ArrayList<Point> midpoints){
        for(Point a : midpoints){
            System.out.println("(" + a.x + ", " + a.y + ")");
        }
    }

    public ArrayList<Point> midpoints(Point start, Point goal){
        Stack<Point> goalStack = new Stack<>();
        ArrayList<Point> sortedPoints = new ArrayList<>();

        Point current = start;
        goalStack.push(goal);

        while(!goalStack.isEmpty()){
            if(dist(current, goalStack.peek()) >= 1){
                goalStack.push(getMidpoint(current, goalStack.peek()));
            } else{
                sortedPoints.add(current);
                current = goalStack.pop();
            }
        }
        sortedPoints.add(current);
        return sortedPoints;
    }

    private Point getMidpoint(Point a, Point b){
        return new Point((a.x + b.x) / 2, (a.y + b.y) / 2);
    }

    private double dist(Point a, Point b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
