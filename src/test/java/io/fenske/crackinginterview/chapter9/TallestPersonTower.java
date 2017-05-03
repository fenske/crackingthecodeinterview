package io.fenske.crackinginterview.chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TallestPersonTower {

  private List<Person> personList;
  private List<Person> lastFoundTower;
  private List<Person> tallestTower;

  public TallestPersonTower(List<Person> personList) {
    this.personList = personList;
    findTallestTower();
  }

  private void findTallestTower() {
    Collections.sort(personList);
    int currentUnfit = 0;
    while(currentUnfit < personList.size()) {
      List<Person> nextTower = new ArrayList<>();
      int nextUnfit = fillNextTower(currentUnfit, nextTower);
      tallestTower = compareAndGetTaller(tallestTower, nextTower);
      if (nextUnfit == currentUnfit) {
        break;
      } else {
        currentUnfit = nextUnfit;
      }
    }
  }

  private List<Person> compareAndGetTaller(List<Person> tower1, List<Person> tower2) {
    return tower1.size() > tower2.size() ? tower1 : tower2;
  }

  private int fillNextTower(int startFrom, List<Person> tower) {
    int firstUnfitItem = startFrom;
    if (startFrom < tower.size()) {
      for (int i = 0; i < tower.size(); i++) {
        Person person = tower.get(i);
        if (i == 0 || tower.get(i-1).compareTo(person) < 0) {
          tower.add(person);
        } else {
          firstUnfitItem = i;
        }

      }
    }
    return firstUnfitItem;
  }
}

class Person implements Comparable<Person> {
  int height;
  int weight;

  @Override
  public int compareTo(Person o) {
    if (height > o.height && weight > o.weight) {
      return 1;
    } else if (height < o.height && weight < o.weight) {
      return -1;
    } else {
      if (height > o.height) {
        return 1;
      } else if (height < o.height) {
        return -1;
      } else if (weight > o.weight){
        return 1;
      } else if (weight < o.weight) {
        return -1;
      } else {
        return 0;
      }
    }
  }
}
