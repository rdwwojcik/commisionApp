package commision.core.dto;

import org.springframework.web.multipart.MultipartFile;
import commision.core.fileobjectreaders.SalesChannel;

/**
 * Created by Radek on 16.11.2017.
 */
public class UploadFileDto {

    private MultipartFile file;
    private SalesChannel channel;
    private char delimiter;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public SalesChannel getChannel() {
        return channel;
    }

    public void setChannel(SalesChannel channel) {
        this.channel = channel;
    }

    public char getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String toString() {
        return "UploadFileDto{" +
                "file=" + file +
                ", channel=" + channel +
                ", delimiter=" + delimiter +
                '}';
    }
}
