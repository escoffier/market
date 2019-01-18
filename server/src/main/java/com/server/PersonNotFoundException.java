package com.server;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(String id) {
        super("Could not find person " + id);
    }
}
