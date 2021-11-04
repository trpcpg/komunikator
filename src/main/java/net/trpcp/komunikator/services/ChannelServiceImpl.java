package net.trpcp.komunikator.services;

import net.trpcp.komunikator.model.Channel;
import net.trpcp.komunikator.repositories.ChannelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class ChannelServiceImpl implements ChannelService {

    ChannelRepository channelRepository;

    public ChannelServiceImpl(ChannelRepository channelRepository) {
        this.channelRepository = channelRepository;
    }

    @Override
    public Channel findById(String s) {
        return channelRepository.findById(s).orElse(null);
    }

    @Override
    public List<Channel> findAll() {
        Iterable<Channel> channels = channelRepository.findAll();
        List<Channel> lch = new ArrayList<>();
        channels.forEach(lch::add);
        return lch;
    }

    @Override
    public List<Channel> saveAll(Set channels) {
        Iterable<Channel> savedChanels= channelRepository.saveAll(channels);
        List<Channel> lch = new ArrayList<>();
        savedChanels.forEach(lch::add);
        return lch;
    }
}
