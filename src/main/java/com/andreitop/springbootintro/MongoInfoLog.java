package com.andreitop.springbootintro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.annotation.PostConstruct;

@Configuration
public class MongoInfoLog {

    private final Logger logger = LoggerFactory.getLogger(MongoInfoLog.class);

    @PostConstruct
    public void doLog() {
        logger.info("\n\n\n" + MongoRepository.class.getPackage().getImplementationVersion() + "\n\n\n");
    }
}
