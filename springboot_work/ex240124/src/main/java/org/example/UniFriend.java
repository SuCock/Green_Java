package org.example;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class UniFriend extends Friend{
    @Override
    public String toString() {
        return "UniFriend{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    private String major;

    public UniFriend(String name, String major, String phone) {
        super(name, phone);
        this.major = major;
    }
}
