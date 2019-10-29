package com.ebayk.service;

import com.ebayk.data.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RatingAnalyzer {
    public List<User> getRatedUsersForRatingCreator(int userId);
}
