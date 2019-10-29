package com.ebayk.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Integer userId) {
        super("User with id '" + userId + "' does not exist");
    }

}
