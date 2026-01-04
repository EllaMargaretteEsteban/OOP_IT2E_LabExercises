package model;

import java.sql.Timestamp;

/**
 * ActivityLog data class representing admin activity.
 */
public class ActivityLog {
    public int id;
    public String adminUsername;
    public String action; // "ADD_MEDICINE", "EDIT_MEDICINE", "DELETE_MEDICINE", "EDIT_USER", "DELETE_USER", "CHANGE_ROLE", "RESET_PASSWORD", "APPROVE_REQUEST", "REJECT_REQUEST"
    public String target; // What was affected (e.g., "username: john_doe", "medicine: Biogesic")
    public Timestamp timestamp;
    
    public ActivityLog(int id, String adminUsername, String action, String target, Timestamp timestamp) {
        this.id = id;
        this.adminUsername = adminUsername;
        this.action = action;
        this.target = target;
        this.timestamp = timestamp;
    }
    
    public ActivityLog(String adminUsername, String action, String target) {
        this(0, adminUsername, action, target, new Timestamp(System.currentTimeMillis()));
    }
}













