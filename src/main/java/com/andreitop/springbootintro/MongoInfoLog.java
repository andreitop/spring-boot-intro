package com.andreitop.springbootintro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.annotation.PostConstruct;

@Configuration
@ConditionalOnClass(MongoRepository.class)
@ConditionalOnProperty(prefix = "prod.mongodb", name = "log", havingValue = "true")
public class MongoInfoLog {

    private final Logger logger = LoggerFactory.getLogger(MongoInfoLog.class);

    @PostConstruct
    public void doLog() {
        logger.info("\n\n\n" + MongoRepository.class.getPackage().getImplementationVersion() + "\n\n\n");
    }
}
