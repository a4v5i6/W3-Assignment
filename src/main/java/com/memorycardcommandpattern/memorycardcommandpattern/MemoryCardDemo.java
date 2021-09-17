/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.memorycardcommandpattern.memorycardcommandpattern;

/**
 *
 * @author Mohit Computers
 */
public class MemoryCardDemo {
    public static void main(String[] args) {
        Port port = new Port();
        SDCard sdcard = new SDCard();
        USB usb= new USB();
        
        port.setCommand(new copyPasteSD(sdcard));
        port.InsertInPort();
        
        port.setCommand(new copyPasteFile(sdcard));
        port.InsertInPort();
        
        port.setCommand(new copyPasteUSB(usb));
        port.InsertInPort();
        
        port.setCommand(new copyPasteFiles(usb));
        port.InsertInPort();
        
        
    }
}
