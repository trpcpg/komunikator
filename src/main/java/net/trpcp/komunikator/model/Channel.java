package net.trpcp.komunikator.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document("channels")
public class Channel {

    @Id
    private String id;
    private String name;

    @Builder
    public Channel(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
