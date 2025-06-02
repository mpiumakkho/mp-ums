package com.mp.core.service;

import java.util.List;
import java.util.Optional;

import com.mp.core.entity.User;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(String id);
    Optional<User> getUserById(String id);
    Optional<User> getUserByUsername(String username);
    List<User> getAllUsers();
    void assignRoleToUser(String userId, String roleId);
    void removeRoleFromUser(String userId, String roleId);
    User updateUserStatus(String userId, String status);
    
    // admin functions for user management
    User activateUser(String userId);
    User deactivateUser(String userId);
    List<User> getPendingUsers();
    List<User> getUsersByStatus(String status);
    Optional<User> getUserByEmail(String email);
} 