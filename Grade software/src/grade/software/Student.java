/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.software;

/**
 *
 * @author aswanth
 */
public class Student {
     String rollNo;
    int att;
    int leave;
    int ass1;
    int ass2;
    int ass3;
    int ass4;
    int ass5;
    int mid1;
    int mid2;
    int midBest;
    int end1;
    int end2;
    String grade;
    int total;
    Student(String rollNo,int att,int leave,int ass1,int ass2,int ass3,int ass4,int ass5,int mid1,int mid2,int end1,int end2)
    {
        
        this.rollNo = rollNo;
       
        this.ass1=ass1;
        this.ass2=ass2;
        this.att = att;
        this.leave = leave;
        this.ass3=ass3;
        this.ass4 = ass4;
        this.ass5 = ass5;
        this.mid1 = mid1;
        this.mid2 = mid2;
        this.end1 = end1;
        this.end2 = end2;
        this.grade="";
        if(mid1>=mid2)
        {
            this.midBest = mid1;
        }
        else{
            this.midBest= mid2;
        }
  
    }
    public int getTotal()
    {
        this.total = ass1 + ass2 +ass3 +ass4 + ((att+leave)/30)*10+ass5+midBest+end1+end2;
        return total;
    }
    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public int getAss1() {
        return ass1;
    }

    public void setAss1(int ass1) {
        this.ass1 = ass1;
    }

    public int getAss2() {
        return ass2;
    }

    public void setAss2(int ass2) {
        this.ass2 = ass2;
    }

    public int getAss3() {
        return ass3;
    }

    public void setAss3(int ass3) {
        this.ass3 = ass3;
    }

    public int getAss4() {
        return ass4;
    }

    public void setAss4(int ass4) {
        this.ass4 = ass4;
    }

    public int getAss5() {
        return ass5;
    }

    public void setAss5(int ass5) {
        this.ass5 = ass5;
    }

    public int getMid1() {
        return mid1;
    }

    public void setMid1(int mid1) {
        this.mid1 = mid1;
    }

    public int getMid2() {
        return mid2;
    }

    public void setMid2(int mid2) {
        this.mid2 = mid2;
    }

    public int getMidBest() {
        return midBest;
    }

    public void setMidBest(int midBest) {
        this.midBest = midBest;
    }

    public int getEnd1() {
        return end1;
    }

    public void setEnd1(int end1) {
        this.end1 = end1;
    }

    public int getEnd2() {
        return end2;
    }

    public void setEnd2(int end2) {
        this.end2 = end2;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    

}
