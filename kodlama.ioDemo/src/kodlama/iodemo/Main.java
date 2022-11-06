package kodlama.iodemo;

import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import kodlama.iodemo.business.concrete.CategoryManager;
import kodlama.iodemo.business.concrete.CourseManager;
import kodlama.iodemo.business.concrete.TeacherManager;
import kodlama.iodemo.dataAccess.concreteDao.hibernate.HibernateCategoryDao;
import kodlama.iodemo.dataAccess.concreteDao.hibernate.HibernateTeacherDao;
import kodlama.iodemo.dataAccess.concreteDao.jdbc.JDBSCourseDao;
import kodlama.iodemo.dataAccess.concreteDao.jdbc.JDBSTeacherDao;
import kodlama.iodemo.entities.Category;
import kodlama.iodemo.entities.Course;
import kodlama.iodemo.entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception{
        List<Logger> loggers = new ArrayList<Logger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        
        Teacher teacher1 = new Teacher();
        teacher1.setTeacherId(001);
        teacher1.setFirstName("Beyza");
        teacher1.setLastName("Parlak");
        teacher1.setNumberCourses(5);
        teacher1.setTeacherDescription("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        Teacher teacher2 = new Teacher();
        teacher2.setTeacherId(002);
        teacher2.setFirstName("Ahmet");
        teacher2.setLastName("Yılmaz");
        teacher2.setNumberCourses(2);
        teacher2.setTeacherDescription("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        
        TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers);
        teacherManager.add(teacher1);

        TeacherManager teacherManager1 = new TeacherManager(new JDBSTeacherDao(), loggers);
        teacherManager1.add(teacher1);

        List<Course> courses = new ArrayList<>();

        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Java Course");
        course.setCoursePrice(10000); 
        course.setCourseDescription("Java Course : syntax of java programming language will be explained");
        course.setCourseCompleted(true);

        Course course1 = new Course();
        course1.setCourseName("Java Course");

        CourseManager courseManager = new CourseManager(new JDBSCourseDao(), courses, loggers);
        courseManager.add(course);
        // CourseManager.add(course1); // gives an error

        List<Category> categories = new ArrayList<>();

        Category category = new Category();
        category.setCategoryId(2);
        category.setCategoryName("Software ");

        Category category1 = new Category();
        category1.setCategoryName("Software ");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), categories);
        categoryManager.add(category);
    }
    
}
