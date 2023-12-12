package model;

/**
 * Class for basic information about a person
 */
public class Person {

    /**
     * Person's identifier
     */
    private long id;

    /**
     * Full name of the person
     */
    private String name;

    // Getters and setters
    
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}