package com.javaee.se_final_backend.service;

import com.javaee.se_final_backend.model.entity.User;
import com.javaee.se_final_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<Map<String, Object>> members(Integer userId) {

        User self = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("用户不存在"));

        List<User> users = userRepository.findByFamilyId(self.getFamilyId());

        return users.stream()
                .map(u -> {
                    Map<String, Object> m = new HashMap<>();
                    m.put("id", u.getId());
                    m.put("name", u.getName());
                    return m;
                })
                .collect(Collectors.toList());
    }
}
