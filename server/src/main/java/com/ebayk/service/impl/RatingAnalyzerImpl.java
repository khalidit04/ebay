package com.ebayk.service.impl;

import com.ebayk.data.user.User;
import com.ebayk.exception.UserNotFoundException;
import com.ebayk.service.RatingAnalyzer;
import com.ebayk.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingAnalyzerImpl implements RatingAnalyzer {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getRatedUsersForRatingCreator(int userId) {

        List<User> ratedUsers = null;
        User ratingsCreator = userRepository.getUser(userId);

        if (ratingsCreator != null) {
            ratedUsers = userRepository.getUsers().entrySet().stream()
                    .filter(userEntry -> userEntry.getValue().getRatings().containsKey(ratingsCreator.getId()))
                    .map(user -> getUser(user.getValue().getId()))
                    .collect(Collectors.toList());
        } else {
            throw new UserNotFoundException(userId);
        }
        if (ratedUsers == null) {
            ratedUsers = Collections.emptyList();
        }
        return ratedUsers;
    }

    private User getUser(int userId) {
        User user = userRepository.getUser(userId);

        if (user == null) {
            throw new UserNotFoundException(userId);
        }
        return user;
    }

}