package com.surecloud.helloworld;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests
{
    @Test
    void contextLoads()
    {
        assertThat( true ).isTrue();
    }
}
