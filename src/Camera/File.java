package camera;

public class File {

    private int size;
    private String extension;
    private String name;

    public File(int size, String extension, String name) {
        this.size = size;
        this.extension = extension;
        this.name = name;
    }

    
    // Getter
    public int getSize() {
        return size;
    }

    public String getExtension() {
        return extension;
    }

    public String getName() {
        return name;
    }

    // Setter
    public void setSize(int newSize) {
        this.size = newSize;
      }

    public void setExtension(String newExtension) {
        this.extension = newExtension;
      }

    public void setName(String newName) {
        this.name = newName;
      }
}
