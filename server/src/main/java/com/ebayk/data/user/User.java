package com.ebayk.data.user;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {

    private final Integer id;
    private final String name;
    private final Map<Integer, UserRating> ratings;

    public User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.ratings = builder.ratings;
    }

    public static Builder newUser() {
        return new Builder();
    }

    public static class Builder {

        private Integer id;
        private String name;
        private Map<Integer, UserRating> ratings;

        private Builder() {
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder ratings(Map<Integer, UserRating> ratings) {
            this.ratings = new HashMap<>(ratings);
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    public Integer getId() {
        return id;
    }

    // remove this unused method
    public String getName() {
        return name;
    }

    public Map<Integer, UserRating> getRatings() {
        return Collections.unmodifiableMap(ratings);
    }
}