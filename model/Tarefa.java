package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Tarefa {
    private final UUID id = UUID.randomUUID();
    private final String title;
    private final String description;
    private StatusType status;
    private final LocalDateTime localDateTime;

    public Tarefa(String title, String description, StatusType status, LocalDateTime localDateTime) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", localDateTime=" + localDateTime +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }
}


