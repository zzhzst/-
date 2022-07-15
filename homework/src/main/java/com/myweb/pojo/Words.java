package com.myweb.pojo;

import java.util.Objects;

public class Words {

    //留言id
    private Integer wid;
    //真实姓名
    private String realname;
    //内容
    private String content;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Words words = (Words) o;
        return Objects.equals(wid, words.wid) && Objects.equals(realname, words.realname) && Objects.equals(content, words.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wid, realname, content);
    }

    @Override
    public String toString() {
        return "Words{" +
                "wid=" + wid +
                ", realname='" + realname + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
