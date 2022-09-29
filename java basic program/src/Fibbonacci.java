
public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0,n2=1,n3,i,count=100;
for(i=2;i<count;i++)
{
	n3=n2+n1;
	System.out.println("fibbonacci series="+n3);
	n1=n2;
	n2=n3;
}
	}

}
