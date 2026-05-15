package Application;

public class Points {
    private App app;
    private int earnedPoints;

    public Points(App app, int earnedPoints) {
        this.app = app;
        this.earnedPoints = earnedPoints;
    }

    public Points(App app) {
        this.app = app;
    }

    public Points() {
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public int getPoints() {
        return earnedPoints;
    }

    public void setPoints(int points) {
        this.earnedPoints = points;
    }

}
