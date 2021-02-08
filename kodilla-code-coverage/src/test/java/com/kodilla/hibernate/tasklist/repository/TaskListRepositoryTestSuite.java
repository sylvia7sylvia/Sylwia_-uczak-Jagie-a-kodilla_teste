package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: hibernate homework";

    @Test
    public void testTaskListRepositoryFindByListName() {
        //given
        TaskList taskList = new TaskList("First List", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //when
        List<TaskList> readTaskList = taskListRepository.findByListName(listName);

        //then
        Assert.assertEquals(1, readTaskList.size());

        //cleanup
        int id = readTaskList.get(0).getId();
        taskListRepository.deleteById(id);
    }

}