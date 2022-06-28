package com.surecloud.helloworld;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldApplication1Tests
{
    @Test
    void contextLoadsFast1()
    {
        assertThat( true ).isTrue();
    }

    @Test
    void contextLoadsFast2()
    {
        assertThat( true ).isTrue();
    }

    @Test
    void contextLoadsFast3()
    {
        assertThat( true ).isTrue();
    }

    @Test
    void contextLoadsFast4()
    {
        assertThat( true ).isTrue();
    }

    @Test
    void contextLoadsSlow1()
        throws InterruptedException
    {
        Thread.sleep( 10000 );
        assertThat( true ).isTrue();
    }
}
