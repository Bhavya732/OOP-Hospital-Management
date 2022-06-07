package com.newcode;

import java.io.*;
import java.util.*;
import java.util.Calendar;
import java.io.IOException;
import java.io.FileWriter;
class Hospital{
    int id;
    String name,gender;
    Hospital(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ID in numerical form: ");
        id=sc.nextInt();
        System.out.print("Enter name: ");
        name=sc.nextLine();
        name=sc.nextLine();
        System.out.print("Enter gender: ");
        gender=sc.nextLine();

    }
}
class Doctor extends Hospital{
    String speciality;
    String workingtime;
    Doctor(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Working time: ");
        workingtime=sc.nextLine();
        System.out.println("Enter your specialisation from the following:");
        System.out.println("MBBS");
        System.out.println("Gynaecologist");
        System.out.println("Psychiatrist");
        System.out.println("Pediatrician");
        System.out.println("DHMS");
        System.out.println("BHMS");
        boolean flag=true;
        while(flag){
            speciality =sc.nextLine();

            if(speciality.equals("MBBS") || speciality.equals("Gynaecologist") ||speciality.equals("Psychiatrist") ||speciality.equals("Pediatrician") ||speciality.equals("DHMS") ||speciality.equals("BHMS")){
                flag=false;
            }else{
                System.out.println("Invalid choice.");
                System.out.println("Enter valid specialisation:\n");
            }
        }
    }
}
class Specialization extends Doctor{
    float salaryd;
    Specialization(){
        if(speciality.equals("MBBS"))
            salaryd=350000;
        else if(speciality.equals("Gynaecologist"))
            salaryd=230000;
        else if(speciality.equals("Psychiatrist"))
            salaryd=140000;
        else if(speciality.equals("Pediatrician"))
            salaryd=125000;
        else if(speciality.equals("DHMS"))
            salaryd=100000;
        else if(speciality.equals("BHMS"))
            salaryd=160000;

    }
    void display(){
       // System.out.println(id+"\t"+name+"\t\t"+gender+"\t"+speciality+"\t"+workingtime+"\t"+salaryd);
       // System.out.println("---------------------------------------------------------------------------------");
        System.out.print("| "+id);
        int t=17;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+name);
        t=name.length();
        t = 30-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+gender);
        t=gender.length();
        t =22-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+speciality);
         t=speciality.length();
        t =25-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+workingtime);
        t=workingtime.length();
        t = 17-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+salaryd);
//        t = 29;
//        while(t!=0){
//            System.out.print(" ");
//            t--;
//        }
//        System.out.println("| ");
        System.out.print("\n---------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }
}

class Staff extends Hospital{
    String designations;
    String workingtime;
    //int n;
    Staff(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Working time: ");
        workingtime=sc.nextLine();
        System.out.println("Enter your designation from the following:");
        System.out.println("Worker");
        System.out.println("Peon");
        System.out.println("Nurse");
        System.out.println("Accountant");

        boolean flag1=true;
        while(flag1){
            designations =sc.nextLine();

            if( designations.equals("Worker") ||  designations.equals("Peon") || designations .equals("Nurse") || designations .equals("Accountant")){
                flag1=false;
            }else{
                System.out.println("Invalid choice");
                System.out.println("Enter valid designation");
            }

        }
    }
}
class Designation extends Staff{
    float salarys;
    Designation(){
        if(designations.equals("Worker"))
            salarys=4000;
        else if(designations.equals("Peon"))
            salarys=12000;
        else if(designations.equals("Nurse"))
            salarys=40000;
        else if(designations.equals("Accountant"))
            salarys=65000;
    }
    void display(){
       // System.out.println(id+"\t"+name+"\t"+gender+"\t"+designations+"\t"+workingtime+"\t"+salarys);
        //System.out.println("---------------------------------------------------------------------------------");


        System.out.print("| "+id);
        int t=17;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+name);
        t=name.length();
        t = 30-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+gender);
        t=gender.length();
        t =22-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+designations);
        t=designations.length();
        t =22-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+workingtime);
        t=workingtime.length();
        t = 17-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+salarys);
//        t = 29;
//        while(t!=0){
//            System.out.print(" ");
//            t--;
//        }
//        System.out.println("| ");
        System.out.print("\n---------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }
}


class Patient
{
    String pid, pname, disease, sex, admit_status;

    int age;
    Patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID in numerical form: ");
        pid = input.nextLine();
        System.out.print("Enter name: ");
        pname = input.nextLine();
        System.out.println("1.diabetes");
        System.out.println("2.Thyroid");
        System.out.println("3.Infertility drugs");
        System.out.println("4.Irregular menstruation drugs");
        System.out.println("5.antidepressant");
        System.out.println("6.anti-anxiety");
        System.out.println("7.mood stabiliser");
        System.out.println("8.amoxicillin");
        System.out.println("9.pain and aches");
        System.out.println("10.fever");
        System.out.println("11.cough and cold");
        int a=1;
        while(a>0)
        {    System.out.println("Enter your chioce between 1 to 11:-");
            int c=input.nextInt();
            switch(c)
            {
                case 1:
                    disease="diabetes";
                    a=0;
                    break;
                case 2:
                    disease="Thyroid";
                    a=0;
                    break;
                case 3:
                    disease="Infertility drugs";
                    a=0;
                    break;
                case 4:
                    disease="Irregular menstruation drugs";
                    a=0;
                    break;
                case 5:
                    disease="antidepressant";
                    a=0;
                    break;
                case 6:
                    disease="anti-anxiety";
                    a=0;
                    break;
                case 7:
                    disease="mood stabiliser";
                    a=0;
                    break;
                case 8:
                    disease="amoxicillin";
                    a=0;
                    break;
                case 9:
                    disease="pain and aches";
                    a=0;
                    break;
                case 10:
                    disease="fever";
                    a=0;
                    break;
                case 11:
                    disease="cough and cold";
                    a=0;
                    break;
                default :
                    System.out.println("Incorrect choice !! Enter correct choice");

            }
        }
        System.out.print("Enter gender: ");
        String s=input.nextLine();
        sex = input.nextLine();
        System.out.print("Enter admit_status: ");
        admit_status = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextInt();
    }

    void patient_info()
    {
       // System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
        System.out.print("| "+pid);
        int t=17;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+pname);
        t=pname.length();
        t = 30-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+sex);
        t=sex.length();
        t =22-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+disease);
        t=disease.length();
        t =29-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+admit_status);
        t=admit_status.length();
        t = 15-t;
        while(t!=0){
            System.out.print(" ");
            t--;
        }
        System.out.print("| "+age);
//        t = 29;
//        while(t!=0){
//            System.out.print(" ");
//            t--;
//        }
//        System.out.println("| ");
        System.out.print("\n---------------------------------------------------------------------------------------------------------------------------------------------------\n");

    }


}
public class Main {

    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        Specialization d[]=new Specialization[50];
        Designation s[]=new Designation[50];
        Patient[] p = new Patient[50];
        File a=new File("doctor_file.txt");
        a.createNewFile();
        File b=new File("patient_file.txt");
        b.createNewFile();
        File c=new File("staff_file.txt");
        c.createNewFile();
        FileWriter aa=new FileWriter("doctor_file.txt");
        FileWriter bb=new FileWriter("patient_file.txt");
        FileWriter cc=new FileWriter("staff_file.txt");
        int choice,countd=0,counts=0,count2=0;
        int status=1;
        while (status==1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctor  2. Staff  3.Patients 4.Exit");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      DOCTOR SECTION");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s1 = 1;
                    while (s1 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing DoctoRupees List");
                        int c1 = sc.nextInt();
                        switch (c1) {
                            case 1: {
                                d[countd] = new Specialization();
                                Doctor dd = d[countd];
                                aa.write("id = " + dd.id + "\n" + "name = " + dd.name + "\n" + "gender = " + dd.gender + "\n" + "\n" + "working time =" + dd.workingtime + "\n" + "speciality =" + dd.speciality + "\n");
                                countd++;

                                break;
                            }
                            case 2: {
                                System.out.print("\n---------------------------------------------------------------------------------------------------------------------------------------------------\n");
                              System.out.print("|  ID");
                                int t = 17;
                                while (t!=0){
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Name");
                                t = 25;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Gender");
                                t = 15;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Specialization");
                                t = 10;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Workingtime");
                                t = 5;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Salary");
//                                t = 29;
//                                while (t != 0) {
//                                    System.out.println(" ");
//                                    t--;
//                                }
//                                System.out.println("| ");
                                System.out.print("\n---------------------------------------------------------------------------------------------------------------------------------------------------\n");
                                for (int i = 0; i < countd; i++) {
                                    d[i].display();
                                }
                                break;
                            }

                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = sc.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      STAFF SECTION");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Staff List");
                        int c2 = sc.nextInt();
                        switch (c2) {
                            case 1: {
                                s[counts] = new Designation();
                                Designation st= s[counts];
                                cc.write("id = "+st.id+"\nname = "+st.name+"\ngender = "+st.gender+"\nworking time = "+st.workingtime+"\ndesignation = "+st.designations+'\n');
                                counts++;
                                break;
                            }
                            case 2: {
                                System.out.print("\n---------------------------------------------------------------------------------------------------------------------------------------------------\n");                                System.out.print("|  ID");
                                int t = 17;
                                while (t!=0){
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Name");
                                t = 25;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Gender");
                                t = 15;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Designation");
                                t = 10;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Workingtime");
                                t = 5;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Salary");
//                                t = 29;
//                                while (t != 0) {
//                                    System.out.println(" ");
//                                    t--;
//                                }
//                                System.out.println("| ");
                                System.out.print("\n---------------------------------------------------------------------------------------------------------------------------------------------------\n");
                                for (int i = 0; i < counts; i++) {
                                    s[i].display();
                                }
                                break;
                            }


                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = sc.nextInt();
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     PATIENT SECTION");
                    System.out.println("--------------------------------------------------------------------------------");

                    int s2 = 1;
                    while (s2 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        int  c1 = sc.nextInt();

                        switch (c1)
                        {
                            case 1:
                            {
                                p[count2]=new Patient();
                                Patient k=p[count2];
                                bb.write("id= "+k.pid+"\n"+"name = "+k.pname+ "\n"+"disease = "+k.disease+"\n"+"sex = "+k.sex+"\n"+"admit status = "+k.admit_status+"\n"+"age = "+k.age+"\n");
                                // if(k.disease.equals(""))
                                String r=k.disease;
                                bb.write("medicines : \n");
                                System.out.println("------- Your medicines are as follows-------");
                                switch(r)
                                {
                                    case "diabetes":
                                        bb.write("Tolbutamide\nGlimepiride\nRepaglinide\nCost=1000 Rupees\n");
                                        System.out.println("Tolbutamide\nGlimepiride\nRepaglinide\n---------Bill--------\nCost=1000 Rupees\n");
                                        break;
                                    case "Thyroid":
                                        bb.write("Levoxyl\nUnithroid\nLevothroid\nWP Thyroid \nCost= 2000 Rupees\n ");
                                        System.out.println("Levoxyl\nUnithroid\nLevothroid\nWP Thyroid \n-------Bill-------\nCost= 2000 Rupees\n ");
                                        break;
                                    case "Infertility drugs":
                                        bb.write("Bravelle (follicle stimulating hormone)\nCetrotide (gonadotropin-releasing hormone antagonist)\nClomid (clomiphene citrate)\nCrinone (progesterone)\nDostinex (prolactin reducing)\nFactrel (gonadotropin-releasing hormone)\nCost = 10,000 Rupees\n");
                                        break;
                                    case "Irreguler menstruation drugs":
                                        bb.write("Prometrium (progesterone) Drug Class: Progesterones\nProvera (medroxyprogesterone) Drug Class: Progestins\nAygestin (norethindrone acetate)Drug Class: Progestins\nCrinons Drug Class: Progesterones\nCost = 7,700 Rupees\n");
                                        break;
                                    case "antidepressant":
                                        bb.write("sertraline (Zoloft)fluoxetine (Prozac, Sarafem)\nCost =5,000 Rupees\n");
                                        break;
                                    case "anti-anxiety":
                                        bb.write("alprazolam (Xanax)\n clonazepam (Klonopin)\nchlordiazepoxide (Librium)\n diazepam (Valium)\nand lorazepam (Ativan)\nCost = 9,500 Rupees\n");
                                        break;
                                    case "mood stabiliser":
                                        bb.write(" Lithium. \nValproate\nLamotrigine\n Cost = 3,400 Rupees\n");
                                        break;
                                    case "amoxicillin":
                                        bb.write("Amoxicillin/Clavulanic Acid,Albuterol,Cephalexin\n Cost= 5,100 Rupees\n");
                                        break;
                                    case "pain and aches":
                                        bb.write("dolo 65\n Cost = 400 Rupees\n");
                                        break;
                                    case "fever":
                                        bb.write("paracetamol, ibuprofen\n Cost =350 Rupees\n");
                                        break;
                                    case "cough and cold":
                                        bb.write("Delsym,Aleve,Echinacea\n Cost =450 Rupees\n");
                                        break;

                                }
                                count2++;
                                break;
                            }
                            case 2:
                            {

                                System.out.print("\n---------------------------------------------------------------------------------------------------------------------------------------------------\n");
                                System.out.print("|  ID");
                                int t = 17;
                                while (t!=0){
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Name");
                                t = 25;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Gender");
                                t = 15;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Disease");
                                t = 21;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Admit Status");
                                t = 2;
                                while (t != 0) {
                                    System.out.print(" ");
                                    t--;
                                }
                                System.out.print("|  Age");
//                                t = 29;
//                                while (t != 0) {
//                                    System.out.println(" ");
//                                    t--;
//                                }
//                                System.out.println("| ");
                                System.out.print("\n---------------------------------------------------------------------------------------------------------------------------------------------------\n");
                                for (int j = 0; j < count2; j++) {
                                    p[j].patient_info();

                                }
                                break;
                            }
                        }

                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = sc.nextInt();
                    }
                    break;
                }
                case 4:
                    break;
            }
            if(choice!=4) {
                System.out.println("\nReturn to MAIN MENU Press 1");
                status = sc.nextInt();
                while(status!=1)
                {
                    System.out.println("Incorrect choice!! Enter correct choice");
                    status = sc.nextInt();
                }
            }
            else
            {
                status=0;
                aa.close();
                bb.close();
                cc.close();
            }
        }

    }
}