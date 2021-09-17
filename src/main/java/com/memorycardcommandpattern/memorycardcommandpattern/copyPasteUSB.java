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
public class copyPasteUSB implements MemoryCardCommand{
    USB usb;
    public copyPasteUSB(USB usb){
        this.usb=usb;
    }

    @Override
    public void execute() {
        usb.copyFromFile();
        usb.pasteInUSB();
    }
    
}
