package org.hufs.racing2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {
    @Test
    @DisplayName("tryCount_Check")
    public void tryCount_Check() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    InputView inputView = new InputView();
                    inputView.inputCarCheck(0);
                }).withMessageContaining("시도할 횟수는 1이상 이어야 합니다.");
    }
}