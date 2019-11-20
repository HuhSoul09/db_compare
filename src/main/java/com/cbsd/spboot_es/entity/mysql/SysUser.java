package com.cbsd.spboot_es.entity.mysql;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="sys_user")
@Entity
public class SysUser {

    @Id
    private String id;
    @Column(name="user_name")
    private String userName;
    private String tel;
    private String addr;
}
