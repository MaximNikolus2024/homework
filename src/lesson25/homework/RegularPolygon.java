package lesson25.homework;

        public class RegularPolygon extends Shape {
                private double numberOfSides;
                private double sideLength;

                public RegularPolygon(double numberOfSides, double sideLength) {
                        this.numberOfSides = numberOfSides;
                        this.sideLength = sideLength;
                }

                public double getNumberOfSides() {
                        return numberOfSides;
                }

                public void setNumberOfSides(double numberOfSides) {
                        this.numberOfSides = numberOfSides;
                }

                public double getSideLength() {
                        return sideLength;
                }

                public void setSideLength(double sideLength) {
                        this.sideLength = sideLength;
                }

                @Override
                public double getPerimeter() {
                        return 0;
                }
        }
