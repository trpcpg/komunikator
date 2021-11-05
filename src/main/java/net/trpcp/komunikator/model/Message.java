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
    private String date;

    @DBRef
    private Channel channel;

    public Message(){}

    @Builder
    public Message(String id, String text, String user, Channel channel, String date) {
        super();
        this.id = id;
        this.text = text;
        this.user = user;
        this.date = date;
        this.channel = channel;
    }
}
