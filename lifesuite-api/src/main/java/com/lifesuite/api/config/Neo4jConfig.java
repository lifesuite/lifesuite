package com.lifesuite.api.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@Configuration
@EnableNeo4jRepositories("com.lifesuite.api.neo4j")
@EntityScan("com.lifesuite.domain")
public class Neo4jConfig {

}
