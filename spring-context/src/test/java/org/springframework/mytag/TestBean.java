package org.springframework.mytag;

/**
 * @Author wgc
 * @Description //TODO
 * @Date 4/26/2020
 **/
public class TestBean {
   private String id;
   private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
