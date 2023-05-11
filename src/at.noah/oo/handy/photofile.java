package at.noah.oo.handy;

public class photofile {
    private String dataType;
    private int sizeinmb;
    private String picturename;

    public photofile(String dataType, int size, String name) {
        this.dataType = dataType;
        this.sizeinmb = size;
        this.picturename = name;
    }

    public String getDataType() {
        return dataType;
    }

    public int getSize() {
        return sizeinmb;
    }

    public String getName() {
        return picturename;
    }

    public void setName(String name) {
        this.picturename = name;
    }

    public String getInfo() {
        return this.picturename + ":" + this.dataType + ":" + this.sizeinmb;
    }
}
