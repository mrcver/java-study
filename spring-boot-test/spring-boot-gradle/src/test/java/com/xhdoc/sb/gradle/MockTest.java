package com.xhdoc.sb.gradle;

import com.example.sb.gradle.test.service.IUserService;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class MockTest {
    //    @Mock
    private IUserService iUserService;

    @Before
    public void init() {
        //两种实现
        //一、 配合@Mock注解
//        MockitoAnnotations.initMocks(this);
        //无需注解
        iUserService = mock(IUserService.class);
    }

    @Test
    public void sumTest() {

        //when.thenReturn用法
        when(iUserService.sum(anyInt(), anyInt())).thenReturn(222);
        Integer sum = iUserService.sum(1, 1);
        System.out.println(sum);

        //doReturn.when.method用法
        doReturn(11).when(iUserService).sum(anyInt(), anyInt());
        sum = iUserService.sum(2, 2);
        System.out.println(sum);

        System.out.println("this is sum test");
    }
}
