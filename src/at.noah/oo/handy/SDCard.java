package at.noah.oo.handy;
import java.util.ArrayList;
import java.util.List;
public class SDCard {
    private int capacity;
    private List<photofile> photoFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.photoFiles = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<photofile> getPhotoFiles() {
        return photoFiles;
    }

    public void saveFile(photofile file) {
        photoFiles.add(file);
    }

    public int getFreeSpace() {
        int overallSpaceUsed = 0;
        int freeSpace = 0;
        for (photofile photoFile:photoFiles) {
            overallSpaceUsed += photoFile.getSize();
        }

        freeSpace = this.capacity - overallSpaceUsed;

        return  freeSpace;
    }
}
