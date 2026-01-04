package model;

/**
 * HealthTip data class representing a health tip.
 */
public class HealthTip {
    public int id;
    public String title;
    public String content;
    public String linkSource; // Mandatory link source
    
    public HealthTip(int id, String title, String content, String linkSource) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.linkSource = linkSource;
    }
    
    public HealthTip(String title, String content, String linkSource) {
        this(0, title, content, linkSource);
    }
}













