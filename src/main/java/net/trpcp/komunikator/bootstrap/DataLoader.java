package net.trpcp.komunikator.bootstrap;

import net.trpcp.komunikator.model.Channel;
//import net.trpcp.komunikator.repositories.ChannelRepository;
import net.trpcp.komunikator.services.ChannelService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final ChannelService channelService;
    boolean init = false;

    public DataLoader(ChannelService channelService) {
        this.channelService = channelService;
    }

    @Override
    public void run(String... args) {
        if(!init){
            synchronized (this){
                loadData();
                init = true;
            }
        }
    }

    public void loadData(){
        Set<Channel> channels = new HashSet<>();
        channels.add(Channel.builder().name("Kanał_1").build());
        channels.add(Channel.builder().name("Kanał_2").build());
        channels.add(Channel.builder().name("Kanał_3").build());

        channelService.saveAll(channels);
    }
}
