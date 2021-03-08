import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImageFile extends File{

    private String imageSource;

    public ImageFile(String name, String path, String url) throws IOException {
        super(name, path);
        imageSource = url;
        size = Files.size(Paths.get(imageSource));
    }

    @Override
    public void getType() {
        System.out.println("\nThis is an image file");
    }

}
