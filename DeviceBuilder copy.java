package Problem3;

public interface DeviceBuilder {
    DeviceBuilder setProcessor(String processor);
    DeviceBuilder setStorageSize(int storage);
    DeviceBuilder setScreenSize(int screen);
    DeviceBuilder setBattery(int battery);
    DeviceBuilder setRAM(int ram);
    DeviceBuilder setOS(String operatingSystem);
    DeviceBuilder setCamera(int camera);

    DeviceBuilder setGraphicsCard(String graphicsCard);

    DeviceBuilder build();
    void displayDetails();
}



