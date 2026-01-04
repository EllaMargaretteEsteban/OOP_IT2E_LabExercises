package database;

import model.ActivityLog;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityLogHandler {

    private final Connection connection;

    public ActivityLogHandler(Connection connection) {
        this.connection = connection;
    }

    // ✅ Ensures table exists
    public void ensureActivityLogTable() throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS activity_logs (
                id INT AUTO_INCREMENT PRIMARY KEY,
                admin_username VARCHAR(100),
                action VARCHAR(255),
                target VARCHAR(255),
                details TEXT,
                timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            )
        """;

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        }
    }

    // ✅ Used by DatabaseManager
    public boolean logActivity(ActivityLog log) {
        String sql = """
            INSERT INTO activity_logs
            (admin_username, action, target, details, timestamp)
            VALUES (?, ?, ?, ?, ?)
        """;

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, log.getAdminUsername());
            ps.setString(2, log.getAction());
            ps.setString(3, log.getTarget());
            ps.setString(4, log.getDetails());
            ps.setTimestamp(5, log.getTimestamp());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Returns all logs
    public List<ActivityLog> getAllActivityLogs() {
        List<ActivityLog> logs = new ArrayList<>();
        String sql = "SELECT * FROM activity_logs ORDER BY timestamp DESC";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                logs.add(mapRow(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return logs;
    }

    // ✅ Filter by admin username
    public List<ActivityLog> getActivityLogsByAdmin(String adminUsername) {
        List<ActivityLog> logs = new ArrayList<>();
        String sql = "SELECT * FROM activity_logs WHERE admin_username = ? ORDER BY timestamp DESC";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, adminUsername);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                logs.add(mapRow(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return logs;
    }

    // 🔧 Helper method
    private ActivityLog mapRow(ResultSet rs) throws SQLException {
        return new ActivityLog(
                rs.getInt("id"),
                rs.getString("admin_username"),
                rs.getString("action"),
                rs.getString("target"),
                rs.getString("details"),
                rs.getTimestamp("timestamp")
        );
    }
}
