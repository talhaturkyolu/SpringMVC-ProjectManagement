package com.befty.service;

import com.befty.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO, String>{

    void complete(ProjectDTO project);

}
