
public class ProbB {

	public static void main(String[] args) {
		final int lt = 1000;
        boolean perfect = false;
        int i;
        for(i = 2; i < lt; i++) { 
            perfect = numPerfect(i);
            if(perfect==true) {
                System.out.println(i + " is a perfect number");
            }
        }
    }
    public static boolean numPerfect(int i) {
        boolean perfect = false;
        int sum = 1;
        int x;
        for(x = 2; x <= i/2; x++) {
            if(i % x == 0) {
                sum += x;
            }
        }
        if(sum == i) {
            perfect = true;
        }
        return perfect;
    }
}

/* 
1.Name of program:To display "CIS 35A ONLINE MEETINGS"
2.Programmer's name:Geerthana Kannan
3.Current Date:1/24/2017
4.Computer system and compiler you are using:Lenovo Windows 10 ,Eclipse compiler for Java
5.Brief description of the program :To display perfect numbers between 2 and 1000

Output:

6 is a perfect number
28 is a perfect number
496 is a perfect number
*/


