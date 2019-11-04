// 1)	ჯენერიკები არის Java ენის სპეციალური ინსტრუმენტები განზოგადებული პროგრამირების განსახორციელებლად, სპეციალური
// მიდგომით მონაცემთა და ალგორითმების აღწერისას, რაც საშუალებას გვაძლევს ვიმუშაოთ სხვადასხვა ტიპის მონაცემებთან მათი აღწერის შეცვლის გარეშე.

import java.util.*;
public class proeqt {
    public static void main(String []args){
        List misalmeba = new ArrayList();
        misalmeba.add("Hello");
        misalmeba.add("Zdarova");
        misalmeba.add("BONJOUR");
        // list.get(0) =  list.add("Hello") ,,,, list.get(1) = list.add("Zdarova"); DA ASE SHEMDEG
        String x = misalmeba.get(0) + ", world!";
        // String x = misalmeba.get(1) + ", world!";
        System.out.print(x);
    }
}
// JENERIK TIPIS SHEQMNA ((((ALT+INSERT))))
class Cell <T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

/// JENERIKIS MEMKVIDREOBITOBA

class Parent {}
/// UBRALO KLASISGAN JENERIK TIPIS SHEQMNA
class GenParent<T> extends Parent{}
/// JENERIKISGAN UBRALO TIPIS SHEQMNA
class Child extends GenParent {}


////IMPLEMENTACIA
GenericClassFromGenericInterface.javaJava
        package com.turreta.genericinterface;

public class GenericClassFromGenericInterface<U> implements Moveable<U> {

    private String location;
    private U item;

    @Override
    public void move(U t, String locationCode) {
        item = t;
        location = locationCode;
    }

    @Override
    public U getItemBeingMoved() {
        return item;
    }

    @Override
    public String getLocationBeingMovedTo() {
        return location;
    }
}


        package com.turreta.genericinterface;

public class GenericClassFromGenericInterface<U> implements Moveable<U> {

    private String location;
    private U item;

    @Override
    public void move(U t, String locationCode) {
        item = t;
        location = locationCode;
    }

    @Override
    public U getItemBeingMoved() {
        return item;
    }

    @Override
    public String getLocationBeingMovedTo() {
        return location;
    }
}







