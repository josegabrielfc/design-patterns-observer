/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Observer.editor;

import designpatterns.Observer.publisher.EventManager;
import java.io.File;

/**
 *
 * @author jgfch
 */
public class Editor {

    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }
    
    public void saveFile() throws Exception {
        if(this.file != null){
        events.notify("save", file);
        }else{
            throw new Exception("Please open a file first");
        }
    }
}
