public class Shortcut extends Object{

    private Object targetObject;

    public Shortcut(String name, String path, Object object) {
        super(name, path);
        targetObject = object;
    }

    public void open(){}

    @Override
    public final void getType() {
        System.out.println("\nThis is a shortcut");
    }
}
