public class Line <T extends Point> {
    private T start;
    private T end;

    public Line(T start, T end) {
        this.start = start;
        this.end = end;
    }

    public T getStart() {
        return start;
    }

    public T getEnd() {
        return end;
    }

    public void setStart(T start) {
        this.start = start;
    }

    public void setEnd(T end) {
        this.end = end;
    }

    public double getLength() {
        int dx = end.getX() - start.getX();
        int dy = end.getY() -start.getY();
        int dz = 0;
        if (start instanceof Point3 && end instanceof Point3) {
            Point3 sz = (Point3) start;
            Point3 ez = (Point3) end;
            dz = ez.getZ() - sz.getZ();
        }
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
