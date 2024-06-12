/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.genericclass;

/**
 *
 * @author kamau
 */
public class GenericClass<T> {

    T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> integers = new GenericClass<Integer>();
        GenericClass<String> string = new GenericClass<String>();
        
        integers.add(new Integer(10));
        string.add(new String("Hello"));
        
        System.out.printf("Integer value: %d\n",integers.get());
         System.out.printf("Sting value: %s",string.get());

    }
}
