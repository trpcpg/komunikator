package net.trpcp.komunikator.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document("messages")
public class Message {

    @Id
    private String id;
    private String text;
    private String user;

    @DBRef
    private String channel;

    @Builder
    public Message(String id, String text, String user, String channel) {
        super();
        this.id = id;
        this.text = text;
        this.user = user;
        this.channel = channel;
    }
}
