package Chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Code3C_3Test {


    @Test
    void main() {
        Code3C_3.GenericClass<String> s = new Code3C_3.GenericClass<String>("ABC");
        Code3C_3.GenericClass<Integer> n = new Code3C_3.GenericClass<Integer>(1);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
        System.out.println("씨벌");
    }
}