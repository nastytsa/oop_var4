public abstract class Object {

    private String name;
    private String path;

    public Object(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public abstract void getType();
}
