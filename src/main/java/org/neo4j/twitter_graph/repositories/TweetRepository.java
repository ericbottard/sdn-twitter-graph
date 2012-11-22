package org.neo4j.twitter_graph.repositories;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.samples._03_neo4j.domain.Tweet;

import java.util.Collection;

/**
 * @author mh
 * @since 24.07.12
 */
public interface TweetRepository extends GraphRepository<Tweet> {
    Tweet findByTweetId(Long id);
    Collection<Tweet> findByTagsTag(String tag);
}
