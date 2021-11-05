package net.trpcp.komunikator.services;

import net.trpcp.komunikator.model.Channel;
import net.trpcp.komunikator.model.Message;
import net.trpcp.komunikator.repositories.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class MessageServiceImpl implements MessageService{

    public final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> findAllByChannel(Channel channel) {
        return messageRepository.findAllByChannel(channel);
    }

    @Override
    public Message findById(String id) {
        return messageRepository.findById(id).orElse(null);
    }

    @Override
    public List<Message> findAllByTextLike(String text) {
        return messageRepository.findAllByTextLike(text);
    }

    @Override
    public List<Message> saveAll(Set<Message> messages) {
        return messageRepository.saveAll(messages);
    }

    @Override
    public Message save(Message m) {
        return messageRepository.save(m);
    }
}
