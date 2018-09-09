package fgo.saber.ex.auth.dao;

import fgo.saber.ex.auth.model.entity.RolePermission;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Long rolePermissionId);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Long rolePermissionId);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}