package Problem3;

public class Laptop implements DeviceBuilder {

    private double price;
    private String name;
    private String processor;
    private String graphicsCard;
    private int storage;
    private int screenSize;
    private int batteryCapacity;
    private int ram;
    private String operatingSystem;
    private int getGraphicsCard;

    public Laptop (String name, double price) {
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
        return null;

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
        this.ram = ram;
        return this;
    }

    @Override
    public DeviceBuilder setOS(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product:" + name +
                "\nSpecifications: Processor: " + processor + "" +
                "\nStorage Size: " + storage + "" +
                "\nScreen Size: " + screenSize + "" +
                "\nBattery Life: " + batteryCapacity + "" +
                "\nGraphics Card: " + graphicsCard + "" +
                "\nRAM: " + ram + "" +
                "\nOS: " + operatingSystem + "" +
                "\nPrice: $" + price + "");
    }
}
