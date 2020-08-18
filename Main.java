import java.util.*;
import java.io.*;
public class AG
{
	public static void main(String[] u){
	int cost[]=new int[3];
	Scanner sc=new Scanner(System.in);
	int maxland[]=new int[3];
	cost[0]=sc.nextInt();
	cost[1]=sc.nextInt();
	cost[2]=sc.nextInt();
	maxland[0]=sc.nextInt();
	maxland[1]=sc.nextInt();
	maxland[2]=sc.nextInt();
	int req[]=new int[3];
	long sum=0;
	int land=0;
	for(int i=0;i<3;i++)
	{
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		maxland[i]-=a*b;
		sum+=a*b*cost[i];
		land+=a*b;
	}

	long total=sc.nextInt();
	total-=land;
	int ma=10000000;
	for(int i=0;i<3;i++)
	{
		for(int j=i+1;j<3;j++)
		{
			if(cost[i]>cost[j])
			{
				int swap;
				swap=cost[i];
				cost[i]=cost[j];
				cost[j]=swap;
				swap=maxland[i];
				maxland[i]=maxland[j];
				maxland[j]=swap;
				//swap(cost[i],cost[j]);
				//swap(maxland[i],maxland[j]);
			}
		}
	}

	for (int i = 0; i < 3; i++)
	{
		if(total>0)
		{	sum+=Long.min(total,maxland[i])*cost[i];
			total-=Long.min(total,maxland[i]);
			
		}
	}
	System.out.println(sum);
	}
	
}
