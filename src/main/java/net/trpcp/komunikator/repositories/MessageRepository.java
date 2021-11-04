package net.trpcp.komunikator.repositories;

import net.trpcp.komunikator.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MessageRepository extends MongoRepository<Message, String> {
    @Query("{text:'?0'}")
    Message findMessageByText(String text);

    long count();
}
