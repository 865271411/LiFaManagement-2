package cn.edu.guet.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Menus implements Serializable {

    private String id;
    private String pId;
    private String name;
    private String icon;
    private String url;
    private List<Menus> childMenus=new ArrayList<Menus>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Menus> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<Menus> childMenus) {
        this.childMenus = childMenus;
    }
}