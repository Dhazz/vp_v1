package com.vp.vp.services;

import com.vp.vp.dtos.UserDTO;
import com.vp.vp.entities.User;
import com.vp.vp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserDTO> getUsers(){
        //return mockUsersList();
        List<User> userDBList = userRepository.findAll();

        List<UserDTO> userDTOList = userDBList.stream()
                                        .map(u -> new UserDTO (u.getId(),
                                                                u.getNickname(),
                                                                u.getFirstName(),
                                                                u.getLastName(),
                                                                u.getNationality(),
                                                                u.getRegistrationDate())
                                            )
                                        .collect(Collectors.toList());

        return userDTOList;
    }



    List<UserDTO> mockUsersList(){
        List<UserDTO> usersList = new ArrayList<>();

        usersList.add(new UserDTO("0", "dhz", "damien", "caterina", "FR", new Date("01/07/2024")));
        usersList.add(new UserDTO("1", "yaka", "pierre-louis", "marie", "FR", new Date("01/07/2024")));
        usersList.add(new UserDTO("2", "barboul", "antoine", "dolivet", "FR", new Date("01/07/2024")));
        usersList.add(new UserDTO("3", "escobarix", "julien", "tannou", "FR", new Date("01/07/2024")));

        return usersList;
    }
}
