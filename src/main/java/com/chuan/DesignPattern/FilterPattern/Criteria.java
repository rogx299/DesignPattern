package com.chuan.DesignPattern.FilterPattern;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}