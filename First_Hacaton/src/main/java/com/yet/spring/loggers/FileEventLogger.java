package com.yet.spring.loggers;

import com.yet.spring.Event;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class FileEventLogger extends AbstractLogger{

    String filename;
    File file;

    public FileEventLogger(String fn){
        this.filename = fn;

    }

    public void init() throws IOException{
        file = new File(filename);
        if (file.exists() && !file.canWrite()) {
            throw new IllegalArgumentException("Can't write to file " + filename);
        } else if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public void LogEvent(Event event){
        String str = event.getAllValues();
        try {
            FileUtils.writeStringToFile(file, str + "\n", true);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
