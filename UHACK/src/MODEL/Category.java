/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Miguel
 */
public class Category {
    private String name;
    private String mall;
    private int queuelength;
    
    public Category(String name, String mall, int queuelength){
        this.name = name;
        this.mall = mall;
        this.queuelength = queuelength;
    }
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMall() {
        return mall;
    }

    public void setMall(String mall) {
        this.mall = mall;
    }

    public int getQueuelength() {
        return queuelength;
    }

    public void setQueuelength(int queuelength) {
        this.queuelength = queuelength;
    }
    
}
