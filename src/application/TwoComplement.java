import java.util.Scanner;
import java.lang.Math;

public class TwoComplement {
    public static void main(String[] args) {
        Operation num1=new Operation();
        Operation num2=new Operation();
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter fist number   => ");
        int n1=sc.nextInt();
        num1.setNumber(n1);
        System.out.print("Enter second number => ");
        int n2=sc.nextInt();
        num2.setNumber(n2);
        System.out.println("----------------");
        
        int[] fNum=num1.convert();
        int[] sNum=num2.convert();
        int[] result=Operation.plus(fNum,sNum);

        System.out.printf(" %d%d%d%d %d%d%d%d +%n",fNum[0],fNum[1],fNum[2],fNum[3],fNum[4],fNum[5],fNum[6],fNum[7]);
        System.out.printf(" %d%d%d%d %d%d%d%d%n",sNum[0],sNum[1],sNum[2],sNum[3],sNum[4],sNum[5],sNum[6],sNum[7]);
        System.out.printf(" %d%d%d%d %d%d%d%d =%n",result[0],result[1],result[2],result[3],result[4],result[5],result[6],result[7]);
        System.out.printf("%10d Ans%n",n2+n1);
        System.out.println("----------------");
    }
}

class Operation{
    int number;

    public void setNumber(int number){
        this.number=number;
    }

    public int[] convert(){
        int[] result=new int[8];
        int absNumber=Math.abs(number);
        int index=result.length-1;
        while(absNumber!=0){
            result[index]=absNumber%2;
            absNumber=absNumber/2;
            index--;
        }
        if(number<0){
            reverse(result);
            result=twoCom(result);
        }
        return result;
    }
    
    public void reverse(int[] result){
        for(int i=0; i<result.length; i++)
            result[i]=result[i]==0 ? 1 : 0;
    }

    public int[] twoCom(int[] result){
        int[] twoCom={0,0,0,0,0,0,0,1};
        twoCom=plus(result, twoCom);
        return twoCom;
    }

    public static int[] plus(int[]num1,int[]num2){
        int[] total=new int[8];
        int index=num1.length-1;
        while(index>=0){
            if(num1[index]==1&&num2[index]==1&&total[index]==1){
                total[index]=1;
                if(index>0) total[index-1]=1;
            }else if(num1[index]==1&&num2[index]==1&&total[index]==0){
                //total[index]=0;
                if(index>0) total[index-1]=1;
            }else if((num1[index]==1||num2[index]==1)&&total[index]==1){
                total[index]=0;
                if(index>0) total[index-1]=1;
            }else if((num1[index]==1||num2[index]==1)&&total[index]==0) total[index]=1;
            index--;
        }
        return total;
    }
}