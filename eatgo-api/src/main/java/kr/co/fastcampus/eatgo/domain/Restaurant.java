package kr.co.fastcampus.eatgo.domain;

import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
public class Restaurant {

    private Long id;

    private String name;

    private String address;

    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

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
