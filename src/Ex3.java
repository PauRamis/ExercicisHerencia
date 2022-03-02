import java.awt.*;

public class Ex3 {
    public class shape{
        private boolean filled = true;
        private String color = "red";

        public shape(){}

        public shape(boolean filled, String color){
            this.filled = filled;
            this.color = color;
        }

        public boolean isFilled(){
            return filled;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString(){
            return "Shape with color of " +
                    this.color +
                    "and" +
                   (this.filled ? filled);
        }
    }

    public class rectangle extends shape{
        private double with = 1;
        private double lenght = 1;

        public rectangle(){}

        public rectangle(double with, double lenght){
            this.with = with;
            this.lenght = lenght;
        }

        public rectangle(double with, double lenght, String color, boolean isFilled){
            this.with = with;
            this.lenght = lenght;
            setColor(color);
        }

        public double getWith() {
            return with;
        }

        public void setWith(double with) {
            this.with = with;
        }

        public double getLenght() {
            return lenght;
        }

        public void setLenght(double lenght) {
            this.lenght = lenght;
        }
        @Override
        public toString(){
            return "rectangle with width" + this.with +
                    "and lenght" + this.lenght +
                    "with a sublas of " + super.toString();
        }
    }
    public class Square extends Rectangle {

        public Square(double side) {
            super(side, side);

        }

        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }

        public double getSide() {
            return this.getWidth();
        }

        public void setSide(double side){
            this.setWidth(side);
        }

        @Override
        public void setWidth(double width) {
            super.setWidth(width);
            super.setLength(width);
        }

        @Override
        public void setLength(double length){
            this.setWidth(length);
        }
    }
}
