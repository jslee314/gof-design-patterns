package proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("로딩: " + fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("보여주기: " + fileName);
    }
}
