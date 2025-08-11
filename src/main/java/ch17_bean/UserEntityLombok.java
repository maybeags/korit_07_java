package ch17_bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
public class UserEntityLombok {
    //여기에 달면 field level
    private int username;
    @Setter
    private int password;
    private String email;
    private String name;
}
