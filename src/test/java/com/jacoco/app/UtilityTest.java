package com.jacoco.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.jacoco.app.utility.Utility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UtilityTest {

    @InjectMocks
    private Utility utility;

    @Test
    public void testCase1() {
        int sum = utility.doNothing(1,2);
       assertEquals(3,sum);
    }
}
