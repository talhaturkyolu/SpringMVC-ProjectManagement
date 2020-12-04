package com.befty.service;

import com.befty.dto.TaskDTO;
import com.befty.dto.UserDTO;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO,Long> {

    List<TaskDTO> findTaskByManager(UserDTO manager);
}
