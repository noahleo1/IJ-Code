package at.noah.oo.handy;

import java.util.List;

public class handy {


    private Sim sim;
    private Camera camera;
    private SDCard sdCard;

    public handy(Sim sim, Camera camera, SDCard sdCard) {

        this.sim = sim;
        this.camera =camera;
        this.sdCard = sdCard;
    }

    public void doCall(String number) {

    }

    public void takePicture() {
        photofile file = this.camera.takePicture();
        this.sdCard.saveFile(file);
        System.out.println("Ein Foto wurde unter dem Namen " + file.getName() + " gespeichert!");
    }

    public void printAllFiles() {
        List<photofile> photoFilesList =this.sdCard.getPhotoFiles();
        for (photofile file:  photoFilesList) {
            System.out.println(file.getInfo());
        }
    }

    public int getFreeSpace() {
        return this.sdCard.getFreeSpace();
    }
}
