package com.cydeo.mapper;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {
    private final ModelMapper modelMapper;

    public RoleMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    // writing 2 methods: 1) converting to Entity  2) converting to DTO
    //convertToEntity
    public Role convertToEntity(RoleDTO dto) {
        return modelMapper.map(dto, Role.class);
    }

    //convertToDto
    public RoleDTO convertToDto(Role entity) {
        return modelMapper.map(entity, RoleDTO.class);
    }
}
