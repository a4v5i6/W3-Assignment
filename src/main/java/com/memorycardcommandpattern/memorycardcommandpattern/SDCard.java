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
public class SDCard {
    public void copyFromFile(){
        System.out.println("Copying data from file.");
    }
    
    public void pasteInCard(){
        System.out.println("Pasting data into SD card.\n");        
    }
    
    public void copyFromCard(){
        System.out.println("Copying data from SD card.");
    }
    
    public void pasteInFile(){
        System.out.println("Pasting data into file.\n");
    }
}
