package org.aaim.optional;

import org.aaim.Bulan;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {

    //if we want to get the object value
    Bulan bulan = findByName("januari2").orElse(new Bulan("Unkown", -1));
    System.out.println(bulan.getNama());

    //if we want to do something only if the value is present
    findByName("Januari").ifPresent(item -> System.out.println(item.getNama()));

    //if we want to handle both condition of value, present / not present
    findByName("Januari111").ifPresentOrElse((item) -> System.out.println(bulan.getNama()),
      () -> System.out.println("Bulan Not Found"));

  }

  /*
    let say this is from our repository that collect data from database
   */
  public static Optional<Bulan> findByName(String name) {
    if (name.equalsIgnoreCase("Januari")) {
      return Optional.of(new Bulan("Januari", 31));
    }
    return Optional.empty();
  }

}
