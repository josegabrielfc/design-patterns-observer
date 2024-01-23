/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Observer.listeners;

import java.io.File;

/**
 *
 * @author jgfch
 */
public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(File log) {
        this.log = log;
    }
    
    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }

}
