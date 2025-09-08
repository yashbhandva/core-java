import java.io.File;

public class test {

    public static void main(String[] args) {
        // Check if a path is provided as a command-line argument
        if (args.length == 0) {
            System.out.println("Please provide a path as a command-line argument.");
            return;
        }

        // Get the path from the command-line argument
        String path = args[0];

        // Create a File object
        File file = new File(path);

        // Check if the path exists and is ready
        if (file.exists()) {
            System.out.println("The path exists: " + path);
            if (file.canRead() && file.canWrite()) {
                System.out.println("The path is ready (has read/write permissions).");
                if (file.isDirectory()) {
                    System.out.println("It is a directory.");
                } else {
                    System.out.println("It is a file.");
                }
            } else {
                System.out.println("The path exists but is not ready (no read/write permissions).");
            }
        } else {
            System.out.println("The path does not exist: " + path);
        }
    }
}
