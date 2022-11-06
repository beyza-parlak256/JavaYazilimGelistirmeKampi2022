package kodlama.iodemo.business.concrete;

import core.logging.Logger;
import java.util.List;
import kodlama.iodemo.business.TeacherService;
import kodlama.iodemo.dataAccess.abstractDao.TeacherDao;
import kodlama.iodemo.entities.Teacher;

public class TeacherManager implements TeacherService{
     private final TeacherDao teacherDao;
    private final List<Logger> loggers;

    public TeacherManager(TeacherDao teacherDao, List<Logger> loggers) {
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Teacher teacher) {
        teacherDao.add(teacher);

        for (Logger logger : loggers) {
            logger.log(teacher.getFirstName() + " " + teacher.getLastName());
        }
    }
}
