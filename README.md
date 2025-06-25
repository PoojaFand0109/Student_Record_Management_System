# Student_Record_Management_System
Steps to create Student Record Management System

1.Create Student Class Fields: id, name, marks Constructor & display() method

2.Import Packages import java.util.Scanner; import java.util.ArrayList;

Create ArrayList ArrayList students = new ArrayList<>();

Create Scanner Object Scanner sc = new Scanner(System.in);

Display Menu in Loop Options: Add, View, Update, Delete, Exit

Perform Operations Add: Take input → Create object → Add to ArrayList View: Loop through ArrayList → Display students Update: Search by ID → Modify details Delete: Search by ID → Remove from ArrayList Exit Program

Use System.exit(0); or break the loop

Close Scanner sc.close();
