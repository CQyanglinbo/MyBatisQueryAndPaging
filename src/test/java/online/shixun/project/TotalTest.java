package online.shixun.project;

import online.shixun.project.test.TestManyToManyOrOneToMany;
import online.shixun.project.test.TestManyToOneOrOneToOne;
import online.shixun.project.test.TestUnion;

public class TotalTest {
	public static void main(String[] args) {
//		TestManyToOneOrOneToOne test=new TestManyToOneOrOneToOne();
//		test.findStudentAndGrade();
//		System.out.println("------------------------------------------");
//		TestManyToManyOrOneToMany test1=new TestManyToManyOrOneToMany();
//		test1.findGradeAndStudent();
		TestUnion test2=new TestUnion();
		test2.findGradeAndStudent();
	}
}
