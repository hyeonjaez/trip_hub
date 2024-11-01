package com.ssafy.TripHub.user.mapper;

import com.ssafy.TripHub.user.dto.request.UserRegisterRequest;
import com.ssafy.TripHub.user.dto.response.UserResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int idCheck(String userId);

    void createUser(UserRegisterRequest userRegisterRequest);

    UserResponse loginUser(String userId, String password);

}
