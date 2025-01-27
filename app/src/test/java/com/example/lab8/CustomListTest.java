package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(1, list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(list.getCount(), listSize+1);
        list.deleteCity(city);
        assertEquals(list.getCount(), listSize);
    }

    @Test
    public void countCitiesTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(list.countCities(), listSize+1);
    }

}
