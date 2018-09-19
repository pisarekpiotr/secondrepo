package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
    @SpringBootTest

    public class CalculatorTestSuite {
        @Test
        public void testForumUserTestSuite() {
            //Given
            ApplicationContext context =
                    new AnnotationConfigApplicationContext("com.kodilla.spring");
            Calculator calculator = context.getBean(Calculator.class);
            //When
            calculator.add(1.56789,2);
            calculator.sub(10,2.1);
            calculator.mul(5,5);
            calculator.div(100,3);
        }
    }
