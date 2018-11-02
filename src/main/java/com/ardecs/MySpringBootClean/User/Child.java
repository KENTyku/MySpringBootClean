/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ardecs.MySpringBootClean.User;

/**
 *
 * @author jury
 */
public class Child {
    private String name;
    private int old;
    private String sex;
   public Child(String sex){
        this.sex=sex;
    }
    public void printFrase(){
        System.out.println("I am child");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the old
     */
    public int getOld() {
        return old;
    }

    /**
     * @param old the old to set
     */
    public void setOld(int old) {
        this.old = old;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    
}
