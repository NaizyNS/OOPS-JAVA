import java.util.*;  
public class employee {
    String rec_id;
    String name;
    String ph_no;
    String des;
    String dept;

    public void read(){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter record id : "); 
        rec_id = s.nextLine();
        System.out.print("Enter Name : "); 
        name = s.nextLine();
        System.out.print("Enter phn no : "); 
        ph_no = s.nextLine();
        System.out.print("Enter designation : "); 
        des = s.nextLine();
        System.out.print("Enter department : "); 
        dept = s.nextLine();
    }

    public void display(){
        System.out.println("\n");
        System.out.println("employee id:"+rec_id);
        System.out.println("employee name:"+name);
        System.out.println("phone number:"+ph_no);
        System.out.println("designation:"+des);
        System.out.println("department:"+dept);
    }
    public static void main(String []args){
        employee obj = new employee();
        obj.read();
        obj.display();

        
    }
}