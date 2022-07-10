package com.springboot.blog.exception;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResourceNotFoundExceptionTest {
    private ResourceNotFoundException exception;

    @BeforeEach
    void setup() {
        exception = new ResourceNotFoundException("resource", "field", 10);
    }

    @Test
    void constructorTest() {
        assertThat(exception).isNotNull();
    }

    @Test
    void getResourceNameTest() {
        assertThat(exception.getResourceName()).isEqualTo("resource");
    }

    @Test
    void getFieldNameTest() {
        assertThat(exception.getFieldName()).isEqualTo("field");
    }
    @Test
    void getFieldValueTest() {
        assertThat(exception.getFieldValue()).isEqualTo(10);
    }
}
