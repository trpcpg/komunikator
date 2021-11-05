package net.trpcp.komunikator.controllers;

import net.trpcp.komunikator.model.Channel;
import net.trpcp.komunikator.model.Message;
import net.trpcp.komunikator.services.ChannelService;
import net.trpcp.komunikator.services.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    private final ChannelService channelService;
    private final MessageService messageService;

    public IndexController(ChannelService channelService, MessageService messageService) {
        this.channelService = channelService;
        this.messageService = messageService;
    }

    @GetMapping({"","/","index","index.html"})
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("index");
        List<Channel> lch = channelService.findAll();
        mav.addObject("channels", lch);
        mav.addObject("channel", new Channel("0","aqq"));
        mav.addObject("user","");
        return mav;
    }

    @PostMapping({"","/","/index","index.html"})
    public ModelAndView formIdProccesing(@RequestParam(value = "user") String user, @ModelAttribute("channel") Channel channel){
        ModelAndView mav = new ModelAndView("channel");
        Message message = Message.builder().user(user).channel(channel).build();
        List<Message> messages = messageService.findAllByChannel(channel);
        mav.addObject("message", message);
        mav.addObject("messages",messages);
        return mav;
    }

    @GetMapping("channel/{chid}/user")
    public ModelAndView getCommWindow(@RequestParam("chid") String chid, @RequestParam("user") String user){
        ModelAndView mav = new ModelAndView("channel");
        Message message = new Message();
        message.setUser(user);
        Channel ch = channelService.findById(chid);
        List<Message> messages = messageService.findAllByChannel(ch);
        mav.addObject("message", message);
        mav.addObject("messages",messages);
        return mav;
    }
}
