package kodlama.iodemo.dataAccess.concreteDao.jdbc;

import kodlama.iodemo.dataAccess.abstractDao.CourseDao;
import kodlama.iodemo.entities.Course;

public class JDBSCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName()+ " added to course database with JDBS");
    }

}
