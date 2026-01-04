package model;

import java.sql.Timestamp;

public class ActivityLog {

    private int id;
    private String adminUsername;
    private String action;
    private String target;
    private String details;
    private Timestamp timestamp;

    // ✅ GUI / Runtime logging constructor
    public ActivityLog(String adminUsername, String action, String target) {
        this.adminUsername = adminUsername;
        this.action = action;
        this.target = target;
        this.details = "";
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    // ✅ GUI with details
    public ActivityLog(String adminUsername, String action, String target, String details) {
        this.adminUsername = adminUsername;
        this.action = action;
        this.target = target;
        this.details = details;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    // ✅ DB constructor
    public ActivityLog(int id, String adminUsername, String action, String target,
                       String details, Timestamp timestamp) {
        this.id = id;
        this.adminUsername = adminUsername;
        this.action = action;
        this.target = target;
        this.details = details;
        this.timestamp = timestamp;
    }

    // ===== GETTERS =====
    public int getId() {
        return id;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public String getAction() {
        return action;
    }

    public String getTarget() {
        return target;
    }

    public String getDetails() {
        return details;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
