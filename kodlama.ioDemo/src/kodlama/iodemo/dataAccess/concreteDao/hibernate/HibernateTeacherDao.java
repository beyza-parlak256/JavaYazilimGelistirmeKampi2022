package kodlama.iodemo.dataAccess.concreteDao.hibernate;

import kodlama.iodemo.dataAccess.abstractDao.TeacherDao;
import kodlama.iodemo.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher.getTeacherId() + " added to teacher database with Hibernate");
    }
    
}
