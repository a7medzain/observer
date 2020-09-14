import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.*;
public class Main {

   public static void main(String args[])
   {
       user Ahmed = new user("Ahmed");
       user khaled =new user("khaled");
       user fadi= new user("fadi");
       List<Post> posts= new ArrayList<>();
       /*
       DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
       LocalDateTime date = LocalDateTime.now();
       Post post= new Post(Ahmed,"Samsung","new galaxy phone",format.format(date));
       post.add(Ahmed);
       post.add(khaled);
       post.add(fadi);
       post.setTracker(true);*/
       int x=0;
       Scanner sc=new Scanner(System.in);
       while ( x!=1)
       {
           System.out.println("Please enter your choice \r\n1. create new post\r\n2. view posts\r\n3. Exit");
            int a =sc.nextInt();
            switch (a)
            {
                case 1:
                {
                    System.out.println("Please enter your user name");
                    Scanner sc1=new Scanner(System.in);
                    String n=sc1.nextLine();

                    System.out.println("Please enter your Post title");
                    String title= sc1.nextLine();
                    System.out.println("Please enter your Post body");
                    String body= sc1.nextLine();
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime date = LocalDateTime.now();
                    user user= new user(n);
                    Post post= new Post(user,title,body,format.format(date));
                    post.add(Ahmed);
                    post.add(khaled);
                    post.add(fadi);
                    post.add(user);
                    post.setTracker(true);
                    posts.add(post);
                    break;
                }
                case 2:
                {
                   for (int loop=0 ; loop< posts.size(); loop++ )
                   {
                      Post p =posts.get(loop);
                      p.print(p);
                   }
                   break;
                }

                case 3:
                {
                    x=1;
                    break;
                }
                default:System.out.println("Wrong!!");
            }
       }
   }
}
