package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// clone 메서드를 정의 할려면
// Cloneable 인터페이스를 상속받아야 한다.
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Point implements Cloneable{
    private int xpos;
    private int ypos;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

