/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Observer;

import designpatterns.Observer.editor.Editor;
import designpatterns.Observer.listeners.EmailNotificationListener;
import designpatterns.Observer.listeners.LogOpenListener;
import java.io.File;

/**
 *
 * @author jgfch
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        
        String filePath = "./file.txt";
        File file = new File(filePath);
        
        editor.events.subscribe("open", new LogOpenListener(file));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
