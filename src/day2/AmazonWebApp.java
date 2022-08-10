package day2;

public class AmazonWebApp {

    public static void main(String[] args) {

       Laptop macbook = new Laptop();
       macbook.operatingSystem = "macbook";
       macbook.color = "sliver";
       macbook.size = 12.0f;
       macbook.price = 1200.0f;
       macbook.storage = 265;
       macbook.storageUnit = "GB";
       macbook.serialNumber = "123456zxc";


       Laptop windows = new Laptop();
       windows.operatingSystem = "windows";
       windows.color = "black";
       windows.size = 12.0f;
       windows.price = 800.0f;
       windows.storage = 150;
       windows.storageUnit = "GB";
       windows.serialNumber = "3459qwe"


    }
}
