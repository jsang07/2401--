package test1;

class ColoredCircle extends Circle{
    String color;

    public ColoredCircle(int radius, String color) {
        super(radius);
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void show() {
        System.out.println("반지름이" + radius + " 인 " + color + "원이다.");
    }
}
