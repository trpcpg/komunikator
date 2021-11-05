package net.trpcp.komunikator.services;

import net.trpcp.komunikator.model.Channel;
import net.trpcp.komunikator.model.Message;

import java.util.List;
import java.util.Set;

public interface MessageService {
    List<Message> findAllByChannel(Channel channel);
    Message findById(String id);
    List<Message> findAllByTextLike(String text);
    List<Message> saveAll(Set<Message> messages);
    Message save(Message m);
}
