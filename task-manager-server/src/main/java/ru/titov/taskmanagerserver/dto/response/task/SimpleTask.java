package ru.titov.taskmanagerserver.dto.response.task;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.titov.taskmanagerserver.entity.Task;

@Getter
@Setter
@NoArgsConstructor
public class SimpleTask {

    public String name;

    public String description;

    public SimpleTask(Task task) {
        if (task != null) {
            name = task.getName();
            description = task.getDescription();
        }
    }

}
