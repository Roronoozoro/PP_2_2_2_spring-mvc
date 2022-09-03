package model;

public class Car {
        private int id;
        private String model;
        private String color;

        public int getId() { return id; }

        public void setId(int id) { this.id = id; }

        public String getModel() { return model; }

        public void setModel(int id) { this.model = model; }

        public String getColor() { return color; }

        public void setColor(int id) { this.color = color; }

        public Car(int id, String model, String color) {
            this.id = id;
            this.model = model;
            this.color = color;
        }

        public Car() {}

        @Override
        public String toString() {
            return "Car{" +
                    "id=" + id +
                    ", model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

