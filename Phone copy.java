package Problem3;

public class Phone implements DeviceBuilder {

        private double price;
        private String graphicsCard;
        private String name;
        private String processor;
        private int storage;
        private int screenSize;
        private int batteryCapacity;
        private int camera;

        public Phone (String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public DeviceBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        @Override
        public DeviceBuilder setStorageSize(int storage) {
            this.storage = storage;
            return this;
        }

        @Override
        public DeviceBuilder setScreenSize(int screen) {
            this.screenSize = screen;
            return this;
        }

        @Override
        public DeviceBuilder setBattery(int battery) {
            this.batteryCapacity = battery;
            return this;
        }

        @Override
        public DeviceBuilder setCamera(int camera) {
            this.camera = camera;
            return this;
        }

    @Override
    public DeviceBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public DeviceBuilder build() {
        return this;
    }

    @Override
        public DeviceBuilder setRAM(int ram) {
            return null;
        }

        @Override
        public DeviceBuilder setOS(String operatingSystem) {
            return null;
        }

        @Override
       public void displayDetails() {
                System.out.println("Product:" + name +
                        "\nSpecifications: Processor: " + processor + "" +
                        "\nStorage Size: " + storage + "" +
                        "\nScreen Size: " + screenSize + "" +
                        "\nBattery Life: " + batteryCapacity + "" +
                        "\nCamera: " + camera +
                        "\nPrice: $" + price + "");
        }
}


