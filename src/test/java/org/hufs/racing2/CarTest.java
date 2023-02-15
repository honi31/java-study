package org.hufs.racing2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    @DisplayName("carName Check")
    public void carName_Check() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    Car car = new Car("SonHoni");
                }).withMessageContaining("자동차의 이름은 5자를 넘지 않아야 합니다.");
    }

}