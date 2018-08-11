/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.software;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aswanth
 */
public class Calculation {
    ArrayList<Student> stu;
    Student temp;
    int aPlus,a,bPlus,b,c,d,e,threshold,totalClasses;
    Calculation(int totalClasses,ArrayList<Student> stu,int aPlus,int a,int bPlus,int b,int c,int d,int e,int theshold)
    {   this.totalClasses=totalClasses;
        this.stu=stu;
        this.aPlus=aPlus;
        this.a=a;
        this.bPlus=bPlus;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e = e;
        this.threshold=threshold;
    }
    
    public void CalcGrade()
    {
        
        int total = stu.size();
        for(int i=0;i<stu.size();i++)
        {
            
            if(((stu.get(i).getAtt()+stu.get(i).getLeave())/totalClasses)*100 < 75) //if attendance is less than 75%
            {
                stu.get(i).setGrade("F");
              total--;
                
            }
            
        }
        for(int i=0;i<stu.size();i++)
        {
            if(stu.get(i).getGrade().equals("") && stu.get(i).getTotal() < threshold )
            {
                stu.get(i).setGrade("F");
                total--;
                
            }
        }
        
        int p1 = (aPlus/total)*100;
        int p2 = (a/total)*100;
        int p3 = (bPlus/total)*100;
        int p4 = (b/total)*100;
        int p5 = (c/total)*100;
        int p6 = (d/total)*100;
        int p7 = (e/total)*100;
        int max = stu.get(0).getTotal();
        
        for(int i=0;i<p1;i++)
        {
            if(stu.get(i).getGrade().equals("") && stu.get(i).getTotal()>=max)
            {
               
                max = stu.get(i).getTotal();
                stu.get(i).setGrade("A+");
            }
        }
        for(int i=0;i<p2;i++)
        {
            if(stu.get(i).getGrade().equals("") && stu.get(i).getTotal()>=max)
            {
               
                max = stu.get(i).getTotal();
                stu.get(i).setGrade("A");
            }
        }
        for(int i=0;i<p3;i++)
        {
            if(stu.get(i).getGrade().equals("") && stu.get(i).getTotal()>=max)
            {
               
                max = stu.get(i).getTotal();
                stu.get(i).setGrade("B+");
            }
        }
        for(int i=0;i<p4;i++)
        {
            if(stu.get(i).getGrade().equals("") && stu.get(i).getTotal()>=max)
            {
               
                max = stu.get(i).getTotal();
                stu.get(i).setGrade("B");
            }
        }
        for(int i=0;i<p5;i++)
        {
            if(stu.get(i).getGrade().equals("") && stu.get(i).getTotal()>=max)
            {
               
                max = stu.get(i).getTotal();
                stu.get(i).setGrade("C");
            }
        }
        for(int i=0;i<p6;i++)
        {
            if(stu.get(i).getGrade().equals("") && stu.get(i).getTotal()>=max)
            {
               
                max = stu.get(i).getTotal();
                stu.get(i).setGrade("D");
            }
        }
        for(int i=0;i<p7;i++)
        {
            if(stu.get(i).getGrade().equals("") && stu.get(i).getTotal()>=max)
            {
               
                max = stu.get(i).getTotal();
                stu.get(i).setGrade("E");
            }
        }
        
        
}

    
}
