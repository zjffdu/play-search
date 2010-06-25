package play.modules.search.store.mime;

import java.util.HashMap;
import java.util.Map;

import play.db.jpa.FileAttachment;

public class ExtensionGuesser implements MimeGuesser {
    public static Map<String, String> extensions = new HashMap<String, String> ();
    static {
        extensions.put("pdf", "application/pdf");
        //FIXME: complete
    }
    public String guess (FileAttachment file) {
        String extension = file.filename.substring(file.filename.lastIndexOf('.'));
        return extensions.get(extension);
    }
    
}
