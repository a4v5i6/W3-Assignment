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
public class USB {
    public void copyFromFile(){
        System.out.println("Copying data from file.");
    }
    
    public void pasteInUSB(){
        System.out.println("Pasting data from file into USB.\n");        
    }
    
    public void copyFromUSB(){
        System.out.println("Copying data from USB.");
    }
    
    public void pasteInFile(){
        System.out.println("Pasting data from USB into file.");
    }
}
