import java.util.*;

public class Folder extends Object {

    private List<Object> folder;

    public Folder(String name, String path){
        super(name, path);
        folder = new ArrayList<>();
    }

    public void addContent(Object object){
        folder.add(object);
    }

    @Override
    public final void getType(){
        System.out.println("\nThis is a folder");
    }
}
