package org.aaim.preoptional;

import org.aaim.Bulan;

public class Main {
  public static void main(String[] args) {

    //if we want to get the object value
    Bulan moon = findByName("Januari");
    if (moon == null) {
      moon = new Bulan("Unkown", -1);
    }
    System.out.println(moon.getNama());


    //if we want to do something only if the value is present
    Bulan bulan = findByName("Januari");
    if (bulan != null) {
      System.out.println(bulan.getNama());
    }

    //if we want to handle both condition of value, present / not present
    Bulan myBulan = findByName("Januari");
    if (myBulan != null) {
      System.out.println(myBulan.getNama());
    } else {
      System.out.println("Bulan Not Found");
    }

  }

  public static Bulan findByName(String name) {
    if (name.equalsIgnoreCase("Januari")) {
      return new Bulan("Januari", 31);
    }
    return null;
  }
}
