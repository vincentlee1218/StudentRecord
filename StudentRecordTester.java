
/**
 * Driver for the class StudentRecord
 *
 * @author JKim 
 * @version (0.1)
 */
public class StudentRecordTester
{
    public static void main(String[] args)
    {
    	final int NSTU = 3;
        int[] a={50,50,20,80,53};
        int[] b={20,50,50,53,80};
        int[] c={20,50,50,80};
        int[][] d = {a,b,c};
        
        StudentRecord[] students;
        students = new StudentRecord[NSTU];
        for (int i = 0; i < NSTU; i++) {
        	students[i] = new StudentRecord(d[i]);
        	System.out.println(students[i].finalAverage());
        }
    }
    
}