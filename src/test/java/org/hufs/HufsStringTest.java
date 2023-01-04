package org.hufs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class HufsStringTest {

    @Test
    @DisplayName("Hello 응답 확인")
    void getHello() {
        HufsString hufsString = new HufsString("Hello");
        assertThat(hufsString.getHello()).isEqualTo("Hi");
    }

    @Test
    @DisplayName("Hi 응답 확인")
    void getHi() {
        HufsString hufsString = new HufsString("hi");
        assertThat(hufsString.getHello()).isEqualTo("안녕");
    }

    @Test
    @DisplayName("안녕 응답 확인")
    void get_안녕() {
        HufsString hufsString = new HufsString("안녕");
        assertThat(hufsString.getHello()).isEqualTo("hello");
    }
}
