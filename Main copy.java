package Problem3;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        String filePath = "Problem3/Problem3_data.csv";

        System.out.println("CSV Contents:");
        adapter.readFile(filePath);

        // Build a device
        DeviceBuilder laptop = new Laptop("Laptop", 800);
                laptop.setProcessor("Intel i5")
                .setRAM(8)
                .setStorageSize(256)
                .setGraphicsCard("Integrated")
                .setOS("Windows 10");

        // Display device details
        System.out.println("\nCUSTOMIZED PRODUCT:");
        laptop.build().displayDetails();

        //default product from the CSV
        System.out.println("\nDEFAULT PRODUCT FROM CSV:");
        DeviceBuilder defaultDevice = new Phone("Smartphone Model X", 999.09);
        defaultDevice.setProcessor("Qualcomm Snapdragon");
        defaultDevice.setRAM(6);
        defaultDevice.setStorageSize(128);
        defaultDevice.setGraphicsCard("N/A");
        defaultDevice.setOS("Android");

        // Display default device details
        defaultDevice.build().displayDetails();
    }
}

