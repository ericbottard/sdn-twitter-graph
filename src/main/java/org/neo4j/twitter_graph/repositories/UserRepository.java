package org.neo4j.twitter_graph.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.RelationshipOperationsRepository;
import org.springframework.data.samples._03_neo4j.domain.User;

import java.util.List;

/**
 * @author mh
 * @since 24.07.12
 */
public interface UserRepository extends GraphRepository<User>, RelationshipOperationsRepository<User> {

    @Query("START me=node:User(userName={0})" +
            "MATCH me-[:POSTED]->tweet-[:MENTIONS]->user" +
            "WHERE user.country = ”SE” and not me-[:FOLLOWS]->user" +
            "RETURN user")
    List<User> suggestFriends(User user);
}
