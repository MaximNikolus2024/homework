package lesson25.homework;

        public class RegularPolygon extends Shape {
                private double sideAmount;
                private double sideLength;

                public RegularPolygon(double numberOfSides, double sideLength) {
                        this.sideAmount = numberOfSides;
                        this.sideLength = sideLength;
                }

                public double getSideAmount() {
                        return sideAmount;
                }

                public void setSideAmount(double sideAmount) {
                        this.sideAmount = sideAmount;
                }

                public double getSideLength() {
                        return sideLength;
                }

                public void setSideLength(double sideLength) {
                        this.sideLength = sideLength;
                }

                @Override
                public double getPerimeter() {
                        return sideAmount *sideLength;
                }
        }
