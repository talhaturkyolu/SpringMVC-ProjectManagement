package com.befty.implementation;

import com.befty.dto.UserDTO;
import com.befty.entity.User;
import com.befty.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService {


    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(UserDTO object) {
        super.delete(object);
    }

    @Override
    public UserDTO findByID(String id) {
        return super.findById(id);
    }

    @Override
    public void deleteBYId(String id) {
        super.deleteById(id);
    }

    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUserName(),object);
    }
}
