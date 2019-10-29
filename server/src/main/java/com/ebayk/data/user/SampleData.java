package com.ebayk.data.user;

import java.util.*;
import java.util.stream.Collectors;

public final class SampleData {

    public static final Map<Integer, User> USERS = Arrays.asList(

            User.newUser().id(1).name("Alice").ratings(getRating(Arrays.asList(
                    new UserRating(4, 2),
                    new UserRating(5, 3),
                    new UserRating(2, 4000)
            ))).build(),

            User.newUser().id(2).name("Bob").ratings(Collections.emptyMap()).ratings(
                    getRating(
                            Arrays.asList(
                                    new UserRating(3, 4000)
                            ))
            ).build(),

            User.newUser().id(3).name("Charles").ratings(Collections.emptyMap()).ratings(
                    getRating(
                            Arrays.asList(
                                    new UserRating(3, 5)
                            )
                    )
            ).build(),

            User.newUser().id(4000).name("Cleo").ratings(Collections.emptyMap()).build()
    ).stream().collect(Collectors.toMap(user -> user.getId(), user -> user));

    private static Map<Integer,UserRating> getRating(List<UserRating> ratingsAsList) {
        Map<Integer,UserRating> ratingsAsMap = new HashMap<>();
        ratingsAsList.stream().forEach(userRating -> ratingsAsMap.put(userRating.getRatingCreatorUserId(),userRating));
        return ratingsAsMap;
    }
}
