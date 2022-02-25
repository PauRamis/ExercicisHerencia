public class Ex2 {
    //2- Implementa una classe anomenada «Circle», que serà la super-classe de «Cylinder».
    //• Implementa tots els mètodes especificats al diagrama.

    //• La subclasse «Cylinder» hereda el mètode «getArea()». Fes una sobrecàrrega d'aquest
    //mètode perquè calculi l'àrea de la superfície del cilindre (2*PI*Rad*Altura + 2*AreaBase).

    //• Implementa el mètode «toString» a la classe «Cylinder» perquè mostri que és una subclasse
    //de «Circle»
    public class Circle {


        private double radius = 1.0;
        private String color = "red";

        Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return this.radius;
        }

        public double getArea() {
            return Math.PI + Math.pow(this.radius, 2);
        }

        public String toString(){
            return color;
        }
    }
    public class Cylinder{
        public Cylinder(){

        }

        public Cylinder(double radius){
            super(radius);
        }

        public Cylinder(double radius, double height){
            super(radius);
            this.height = height;
        }

        @Override
        public double getArea() {
        double areaCercle = super.getArea;
        double areaRectangle = this.height * 2 * Math.PI * getRadius;
        return 2*areaCercle + areaRectangle;
        }

        @Override
        public String toString() {
            return "Cylinder.superclas ";
        }
    }
}
