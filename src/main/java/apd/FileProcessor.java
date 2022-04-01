package apd;

import java.util.UUID;

public class FileProcessor {

    private static FileProcessor instance = null;

    private final String fileName;
    private String uuid;

    private FileProcessor(String fileName) {
        this.fileName = fileName;
        this.uuid = UUID.randomUUID().toString();
    }

    public static FileProcessor getInstance(String fileName) {
        if (instance == null) {
            instance = new FileProcessor(fileName);
        }
        return instance;
    }

    public int readFile() {
        // blah..blah
        return 0;
    }

    public int writeFile(String data) {
        // blah...blah
        return 0;
    }

    public String getUuid() {
        return this.uuid;
    }
}
