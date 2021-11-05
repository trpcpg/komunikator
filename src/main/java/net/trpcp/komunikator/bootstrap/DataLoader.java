package net.trpcp.komunikator.bootstrap;

import net.trpcp.komunikator.model.Channel;
//import net.trpcp.komunikator.repositories.ChannelRepository;
import net.trpcp.komunikator.model.Message;
import net.trpcp.komunikator.services.ChannelService;
import net.trpcp.komunikator.services.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final ChannelService channelService;
    private final MessageService messageService;
    boolean init = false;

    public DataLoader(ChannelService channelService, MessageService messageService) {
        this.messageService = messageService;
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
//        Set<Channel> channels = new HashSet<>();
//        Channel c1 = Channel.builder().name("Kanał_1").build();
//        Channel c2 = Channel.builder().name("Kanał_2").build();
//        Channel c3 = Channel.builder().name("Kanał_3").build();
//        channels.add(c1);
//        channels.add(c2);
//        channels.add(c3);

        //List<Channel> savedChannels = channelService.saveAll(channels);

//        Set<Message> messages = new HashSet<>();
//        messages.add(Message.builder().id("1").date("2021.11.04 08:23:54").user("tom").text("aqq").channel(savedChannels.get(0)).build());
//        messages.add(Message.builder().id("2").date("2021.11.04 09:45:02").user("tom").text("bqq").channel(savedChannels.get(1)).build());
//        messages.add(Message.builder().id("3").date("2021.11.04 10:34:09").user("tom").text("cqq").channel(savedChannels.get(2)).build());
//        messages.add(Message.builder().id("4").date("2021.11.05 03:20:15").user("jack").text("cqq").channel(savedChannels.get(0)).build());
//        messages.add(Message.builder().id("5").date("2021.11.05 14:30:05").user("jack").text("bqq").channel(savedChannels.get(2)).build());
//        messages.add(Message.builder().id("6").date("2021.11.06 12:23:34").user("jack").text("aqq").channel(savedChannels.get(1)).build());
//        messages.add(Message.builder().id("7").date("2021.11.06 23:12:23").user("jil").text("aqq").channel(savedChannels.get(1)).build());
//        messages.add(Message.builder().id("8").date("2021.11.06 14:25:33").user("jil").text("bqq").channel(savedChannels.get(2)).build());

        //messageService.saveAll(messages);

    }
}
