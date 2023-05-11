package at.noah.oo.handy;

public class main {
    public static void main(String[] args) {
        Sim magenta = new Sim(1, "16642834943");

        SDCard sonySdCard = new SDCard(1000);

        Camera sonyCamera = new Camera(100);

        handy iphone = new handy(magenta,sonyCamera,sonySdCard);

        sonyCamera.takePicture();

        iphone.doCall("16642325534");

        iphone.takePicture();
        iphone.takePicture();
        iphone.takePicture();
        iphone.printAllFiles();

        System.out.println(iphone.getFreeSpace());
        Sim magenta1 = new Sim(2, "166322834943");



        handy iphone = new handy(magenta1,sonyCamera,sonySdCard);

        sonyCamera.takePicture();

        iphone.doCall("16642325534");

        iphone.takePicture();
        iphone.takePicture();
        iphone.takePicture();
        iphone.printAllFiles();

        System.out.println(iphone.getFreeSpace());
    }
}
