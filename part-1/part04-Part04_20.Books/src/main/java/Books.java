/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ace
 */
public class Books {

    private String name;
    private int pages;
    private int year;

    public Books(String name, int pages, int year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String name() {
        return this.name;
    }

    public int year() {
        return this.year;
    }

    public int pages() {
        return this.pages;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
}
