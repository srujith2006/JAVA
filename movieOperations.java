

import java.sql.*;
import java.util.*;
class DBCon
{
    
    public static Connection connect()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mdb","root","Aditya@123");           
        }catch(Exception e)
        {
            
        }
        return con; 
    }
}
class Movie
{
    Connection con;
    public void insert(int movID,String movieName,String heroName,String heroineName,int budget)
    {
       try{
       con=DBCon.connect();
       PreparedStatement psmt=con.prepareStatement("insert into movies values(?,?,?,?,?)");
        psmt.setInt(1, movID);
        psmt.setString(2,movieName);
        psmt.setString(3,heroName);
        psmt.setString(4,heroineName);
        psmt.setInt(5,budget);
        
        int status=psmt.executeUpdate();
        if(status!=0)
            System.out.println("Record Inserted successfully");
        else
            System.out.println("Record Insertion Failed");
         con.close();
       }
       catch(Exception e)
       {
           
       }
       
       }
    public void update(int movID,int newBudget)
    {
        con=DBCon.connect();
        try
        {
            String query="update movies set budget=? where movID=?";
            PreparedStatement psmt=con.prepareStatement(query);
            psmt.setInt(1,newBudget);
            psmt.setInt(2, movID);
            
            int status=psmt.executeUpdate();
            if(status!=0)
                System.out.println("Record Updated");
            else
                System.out.println("Record Updation Failed");
            
            con.close();
            
        }
        catch(Exception e)
        {
            
        }
    }
    public void delete(int movID)
    {
        con=DBCon.connect();
        try{
           String query="delete from movies where movID=?";
           PreparedStatement psmt=con.prepareStatement(query);
           psmt.setInt(1, movID);
           int status=psmt.executeUpdate();
           if(status!=0)
               System.out.println("Movie Record Deleted Successfully");
           else
               System.out.println("Deletion Failed");
           con.close();
        }
        catch(Exception e)
        {
            
        }
    }
    public void searchMovies(String heroName)
    {
        con=DBCon.connect();
        try{
            String query="select * from movies where heroName=?";
            PreparedStatement psmt=con.prepareStatement(query);
            psmt.setString(1,heroName);
            
            ResultSet rs=psmt.executeQuery();
            System.out.println("MovieID\tMovieName\tHeroName\tHeroineName\tBudget");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
            }
        }
        catch(Exception e)
        {
            
        }
    }
    public void displayMovies()
    {
         con=DBCon.connect();
        try{
            String query="select * from movies";
            PreparedStatement psmt=con.prepareStatement(query);
           
            
            ResultSet rs=psmt.executeQuery();
            System.out.println("MovieID\tMovieName\tHeroName\tHeroineName\tBudget");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
            }
        }
        catch(Exception e)
        {
            
        }

        
    }
}


public class MovieOperations {
    public static void main(String args[])
    {
        int choice;
        Movie m=new Movie();
        int movID,budget,newBudget;
        String movieName,heroName,heroineName;
        Scanner sc=new Scanner(System.in);
        System.out.println("========WELCOME TO MOVIE DATABSE OPERATIONS");
        while(true)
        {
         System.out.println("1.Insert\n2.Update\n3.Delete\n4.Search\n5.Display\n6.Exit");
         System.out.println("Enter your Choice");
         choice=sc.nextInt();
         sc.nextLine();
         switch(choice)
         {
             case 1:
                 System.out.println("Enter movID,Name,Hero,Heroine,Budget");
                 movID=sc.nextInt();
                 sc.nextLine();
                 movieName=sc.nextLine();
                 heroName=sc.nextLine();
                 heroineName=sc.nextLine();
                 budget=sc.nextInt();
                 sc.nextLine();
                 m.insert(movID,movieName,heroName,heroineName,budget);
                 break;
             case 2:
                 System.out.println("Enter Movie ID and the New Budget Value");
                 movID=sc.nextInt();
                 newBudget=sc.nextInt();
                 sc.nextLine();
                 m.update(movID,newBudget);
                 break;
             case 3:
                 System.out.println("Enter the movie ID to delete");
                 movID=sc.nextInt();
                 sc.nextLine();
                 m.delete(movID);
                 break;
             case 4:
                 System.out.println("Enter the heroName to Search the Movies");
                 heroName=sc.nextLine();
                 m.searchMovies(heroName);
                 break;
             case 5:
                 m.displayMovies();
                 break;
             case 6:
                     System.exit(0);
         }
        }    
    }
}


