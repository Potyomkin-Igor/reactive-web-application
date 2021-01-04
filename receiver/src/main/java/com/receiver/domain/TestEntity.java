package com.receiver.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Used only to instantiate test mongo repository.
 */
@Document
public class TestEntity {

    @Id
    private String id;
}
