package com.company;

public class Ball {
    int radius;
    float pressure;
    String sport;

    public Ball(int radius, float pressure, String sport) {
        this.radius = radius;
        this.pressure = pressure;
        this.sport = sport;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", pressure=" + pressure +
                ", sport='" + sport + '\'' +
                '}';
    }
}
