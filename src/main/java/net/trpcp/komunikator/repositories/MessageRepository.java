package net.trpcp.komunikator.repositories;

import net.trpcp.komunikator.model.Channel;
import net.trpcp.komunikator.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message, String> {
    @Query("{text:'?0'}")
    Message findMessageByText(String text);
    List<Message> findAllByChannel(Channel channel);
    List<Message> findAllByTextLike(String text);

    long count();
}
