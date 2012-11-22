package org.neo4j.twitter_graph.repositories;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.samples._03_neo4j.domain.Tag;

/**
 * @author mh
 * @since 24.07.12
 */
public interface TagRepository extends GraphRepository<Tag> {
}
