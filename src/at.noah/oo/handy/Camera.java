package at.noah.oo.handy;

public class Camera {
    private int resolution;
    private int fileNumber;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public photofile takePicture() {
        photofile file = new photofile("img", 3, "Bild Nummer " + fileNumber);
        fileNumber++;
        return file;
    }
}
