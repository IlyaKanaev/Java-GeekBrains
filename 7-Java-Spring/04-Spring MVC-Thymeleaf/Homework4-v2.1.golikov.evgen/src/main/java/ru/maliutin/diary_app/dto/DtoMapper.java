package ru.maliutin.diary_app.dto;

import org.springframework.stereotype.Component;
import ru.maliutin.diary_app.models.Task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Маппер преобразования объектов dto в сущности и наоборот.
 */
@Component
public class DtoMapper {
    /**
     * Преобразование в dto.
     *
     * @param task объект задачи.
     * @return объект dto.
     */
    public TaskDto toDto(Task task) {
        TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setTitle(task.getTitle());
        taskDto.setDescription(task.getDescription());
        taskDto.setLeadTime(getFormatLeadTime(task.getLeadTime()));
        taskDto.setStatus(task.getStatus());
        return taskDto;
    }

    /**
     * Преобразование в объект сущности.
     *
     * @param taskDto объект dto.
     * @return объект сущности.
     */
    public Task toEntity(TaskDto taskDto) {
        Task task = new Task();
        task.setId(taskDto.getId());
        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        task.setLeadTime(parseToLocalDateTime(taskDto.getLeadTime()));
        task.setStatus(taskDto.getStatus());
        return task;
    }

    /**
     * Служебный метод форматирования даты для dto.
     *
     * @param dateTime дата и время выполнения задачи.
     * @return отформатированная дата и время.
     */
    private String getFormatLeadTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
        return dateTime.format(formatter);
    }

    /**
     * Служебный метод форматирования даты для сущности.
     *
     * @param dateTime дата и время выполнения задачи.
     * @return отформатированная дата и время.
     */
    private LocalDateTime parseToLocalDateTime(String dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
        return LocalDateTime.parse(dateTime, formatter);
    }

}
