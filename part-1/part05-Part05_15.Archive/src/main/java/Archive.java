/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ace
 */
public class Archive {

    private String id;
    private String name;

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Archive)) {
            return false;
        }
        Archive comparedArchive = (Archive) compared;
        if(this.id.equals(comparedArchive.id)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }

}
