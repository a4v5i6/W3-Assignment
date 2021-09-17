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
public class Port {
    MemoryCardCommand command;
    public void setCommand(MemoryCardCommand command){
        this.command=command;
    }
    
    public void InsertInPort(){
        command.execute();
    }
}
