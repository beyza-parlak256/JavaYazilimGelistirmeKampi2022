package kodlama.iodemo.dataAccess.concreteDao.hibernate;

import kodlama.iodemo.dataAccess.abstractDao.CourseDao;
import kodlama.iodemo.entities.Course;

public class HibernateCourseDao implements CourseDao{

    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " added to course database with Hibernate");
    }
    
}
