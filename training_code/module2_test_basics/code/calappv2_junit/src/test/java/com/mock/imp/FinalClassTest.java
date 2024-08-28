package com.mock.imp;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FinalClassTest {


    @Test
    public void testMockFinalViaMockStatic()  {
        MockedStatic<FinalClass> mockStatic = Mockito.mockStatic(FinalClass.class);
        assertNotNull(mockStatic);
    }

}
