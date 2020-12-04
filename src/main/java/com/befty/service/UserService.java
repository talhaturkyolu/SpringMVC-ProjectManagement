package com.befty.service;

import com.befty.dto.UserDTO;

import java.util.List;

public interface UserService extends CrudService<UserDTO,String>{

    List<UserDTO> findManagers();
    List<UserDTO> findEmployees();

}
