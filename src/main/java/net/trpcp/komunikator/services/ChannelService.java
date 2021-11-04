package net.trpcp.komunikator.services;

import net.trpcp.komunikator.model.Channel;

import java.util.List;
import java.util.Set;

public interface ChannelService {
    Channel findById(String s);
    List<Channel> findAll();
    List<Channel> saveAll(Set<Channel> channels);
}
