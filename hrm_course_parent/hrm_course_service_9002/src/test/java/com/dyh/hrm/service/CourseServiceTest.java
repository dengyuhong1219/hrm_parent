package com.dyh.hrm.service;

import com.dyh.hrm.Course9002Application;
import com.dyh.hrm.domain.Course;
import com.dyh.hrm.query.CourseQuery;
import com.dyh.hrm.util.PageList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Course9002Application.class)
public class CourseServiceTest {

    @Autowired
    private ICourseService courseService;
    @Test
    public void selectListPage() {
        PageList<Course> pageList = courseService.selectListPage(new CourseQuery());
        System.out.println(pageList.getTotal());
        System.out.println(pageList.getRows().size());
        for (Course course : pageList.getRows()) {
            System.out.println(course);
            System.out.println(course.getCourseType());
            System.out.println("=========================");
        }
    }
}
