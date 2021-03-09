package com.company;

class Point{
    double x;
    double y;
    Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

    double getX() {
        return x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    void setY(double y) {
        this.y = y;
    }
    void goRight(){
        this.x++;
    }
    void goDown(){
        this.y++;
    }
}