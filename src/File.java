public abstract class File extends Object{

    double size;

    public File(String name, String path) {
        super(name, path);
    }

    public double getSize() {
        return size;
    }
}
