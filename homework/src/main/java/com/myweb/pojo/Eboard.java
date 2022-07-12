package com.myweb.pojo;

import java.util.Objects;

public class Eboard {
    //主键
    private Integer eid;
    //标题
    private String title;
    //内容
    private String content;
    //新闻
    private String news;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eboard eboard = (Eboard) o;
        return Objects.equals(eid, eboard.eid) && Objects.equals(title, eboard.title) && Objects.equals(content, eboard.content) && Objects.equals(news, eboard.news);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, title, content, news);
    }

    @Override
    public String toString() {
        return "Eboard{" +
                "eid=" + eid +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", news='" + news + '\'' +
                '}';
    }
}
