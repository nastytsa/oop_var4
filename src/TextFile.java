import java.nio.charset.StandardCharsets;

public class TextFile extends File{

    private String data;

    public TextFile(String name, String path, String data) {
        super(name, path);
        this.data = data;
        this.size = data.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public final void getType() {
        System.out.println("\nThis is a text file");
    }
}
