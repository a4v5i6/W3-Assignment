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
public class copyPasteFile implements MemoryCardCommand{
    SDCard sdcard;
    public copyPasteFile(SDCard sdcard){
        this.sdcard=sdcard;
    }

    @Override
    public void execute() {
        sdcard.copyFromCard();
        sdcard.pasteInFile();
    }
}
