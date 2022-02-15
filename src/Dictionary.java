/*
Trent Blair
2/15/22
The purpose of this is to create the dictionary
 */

import java.util.ArrayList;
import java.util.Collection;

public class Dictionary <T, E>{

    private ArrayList<T> values;
    private ArrayList<E> keys;

    public Dictionary(){
        values = new ArrayList<>();//using array lists
        keys = new ArrayList<>();
    }

    //add an key-value pair to the dictionary
    void put(E key, T value){
        keys.add(key);
        values.add(value);
        }


    //get the value associated with a given key
    T get(E key){

        int indexOfKey = keys.indexOf(key);
        return values.get(indexOfKey);
    }

    //remove a key-value pair and return its value
    T remove(E key){
        int indexOfKey = keys.indexOf(key);
        keys.remove(indexOfKey);
        return values.remove(indexOfKey);
    }

    //returns true if the given key has an associated value
    boolean contains(E key){
        int indexOfKey = keys.indexOf(key);
        return indexOfKey >= 0;
    }

    //returns true if the dictionary is empty
    boolean isEmpty(){
        return !(values.size() > 0);
    }

    //returns the number of key-value pairs in the dictionary
    int size(){
        return values.size();
    }

    //returns a Collection¹ of keys
    Collection<E> keys(){
        Collection collection = keys;

        return collection;
    }

    //returns a Collection of values
    Collection<T>  values(){
        Collection collection = values;


        return collection;
    }


}