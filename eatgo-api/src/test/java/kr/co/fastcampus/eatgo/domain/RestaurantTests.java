package kr.co.fastcampus.eatgo.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTests {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant(1004L,"Bob zip","Seoul");
        assertEquals(restaurant.getId(),1004L);
        assertEquals(restaurant.getName(),"Bob zip");
        assertEquals(restaurant.getAddress(),"Seoul");
    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant(1004L,"Bob zip","Seoul");
        assertEquals(restaurant.getInformation(),"Bob zip in Seoul");
    }
}