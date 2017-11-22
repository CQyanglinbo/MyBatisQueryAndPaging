package online.shixun.project.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import online.shixun.project.mapper.GradeModelMapper;
import online.shixun.project.model.GradeModel;


public class TestManyToManyOrOneToMany extends BaseJDBC{
	SqlSession sqlSession;
	GradeModelMapper gradeModelMapper;
	public void findGradeAndStudent(){
		sqlSession=BaseJDBC.getSqlSessionFactory().openSession();
		gradeModelMapper=sqlSession.getMapper(GradeModelMapper.class);
		List<GradeModel> list=gradeModelMapper.findGradeAndStudent();
		for (GradeModel gradeModel : list) {
			System.out.println(gradeModel.toString());
		}
		sqlSession.commit();
		sqlSession.close();
	}
}
