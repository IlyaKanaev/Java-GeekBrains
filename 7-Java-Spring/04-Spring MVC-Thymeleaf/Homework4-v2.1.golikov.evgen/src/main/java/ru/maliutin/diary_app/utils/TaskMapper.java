package ru.maliutin.diary_app.utils;

import org.springframework.jdbc.core.RowMapper;
import ru.maliutin.diary_app.models.Status;
import ru.maliutin.diary_app.models.Task;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Маппер преобразования данных из БД в объект Java.
 */
public class TaskMapper implements RowMapper<Task> {

    @Override
    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        Task task = new Task();
        task.setId(rs.getLong("id"));
        task.setTitle(rs.getString("title"));
        task.setDescription(rs.getString("description"));
        task.setLeadTime(
                rs.getTimestamp("lead_time").toLocalDateTime());
        task.setStatus(
                Enum.valueOf(Status.class, rs.getString("status")));
        return task;
    }
}