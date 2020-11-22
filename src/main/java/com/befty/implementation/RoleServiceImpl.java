package com.befty.implementation;

import com.befty.dto.RoleDTO;
import com.befty.dto.UserDTO;
import com.befty.service.CrudService;
import com.befty.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(RoleDTO object) {
        super.delete(object);
    }

    @Override
    public RoleDTO findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteBYId(Long id) {
        super.deleteById(id);
    }

    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(),object);
    }

}
