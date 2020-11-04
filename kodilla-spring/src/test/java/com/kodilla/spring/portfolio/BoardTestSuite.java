package com.kodilla.spring.portfolio;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    private static int testCounter;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        //When
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasksList().add("Task 1 is in ToDoList");
        board.getInProgressList().getTasksList().add("Task 2 is in InProgressList");
        board.getDoneList().getTasksList().add("Task 3 is in DoneList");
        //Then
        board.display();
    }

    @Test
    public void testExists() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        //When
        boolean listsExist = context.containsBean("toDo") && context.containsBean("inProgress") && context.containsBean("done");
        //Then
        System.out.println("All list was created: " + listsExist);
    }
}
