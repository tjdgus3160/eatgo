package kr.co.fastcampus.eatgo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String address;

    @Transient
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(){
    }

    public Restaurant(String name, String address) {
        this.name=name;
        this.address=address;
    }

    public Restaurant(Long id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public String getInformation() {
        return name + " in "+address;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
}
