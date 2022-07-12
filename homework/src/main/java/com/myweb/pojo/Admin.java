package com.myweb.pojo;

import java.util.Objects;

public class Admin {
    //管理员id
    private Integer id;
    //管理员账号
    private String adminName;
    //管理员密码
    private String adminPwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(id, admin.id) && Objects.equals(adminName, admin.adminName) && Objects.equals(adminPwd, admin.adminPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adminName, adminPwd);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", adminPwd='" + adminPwd + '\'' +
                '}';
    }
}
