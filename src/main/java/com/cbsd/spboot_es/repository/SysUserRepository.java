package com.cbsd.spboot_es.repository;


import com.cbsd.spboot_es.entity.mysql.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser,String> {
}
