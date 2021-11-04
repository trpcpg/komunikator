package net.trpcp.komunikator.repositories;

import net.trpcp.komunikator.model.Channel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ChannelRepository extends CrudRepository<Channel, String> {

    Optional<Channel> findByNameLike(String name);
}
