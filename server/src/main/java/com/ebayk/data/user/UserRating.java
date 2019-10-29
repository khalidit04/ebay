package com.ebayk.data.user;

import java.util.Objects;

public class UserRating {

    private final Integer rating;
    private final Integer ratingCreatorUserId;

    public UserRating(Integer rating, Integer ratingCreatorUserId) {
        // Constructor should not have any logic (validation).
        // hence rewrite the USerRating class with Builder pattern
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating of " + rating + ", rating must be between 1 and 5");
        }

        this.rating = rating;
        this.ratingCreatorUserId = ratingCreatorUserId;
    }

    // unused method hence it should be rmeoved
    public Integer getRating() {
        return rating;
    }

    public Integer getRatingCreatorUserId() {
        return ratingCreatorUserId;
    }
}