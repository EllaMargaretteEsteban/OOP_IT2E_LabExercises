package model;

/**
 * Pill data class representing a medication/product.
 */
public class Pill {
    public String name;
    public String description;
    public String recommendation;

    public Pill(String name, String description, String recommendation) {
        this.name = name;
        this.description = description;
        this.recommendation = recommendation;
    }
}

