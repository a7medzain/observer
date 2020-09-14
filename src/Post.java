import java.util.ArrayList;
import java.util.List;
public class Post implements subject{
    private  String Title, body, postDate;
    private user username;
    private String tracker;
    private List<observer> observerlist;
    public Post(user username, String title, String body, String postDate)
    {
        this.username= username;
        this.Title= title;
        this.body= body;
        this.postDate=postDate;
        this.observerlist= new ArrayList<>();
    }

    @Override
    public void add(observer observer) {
        observerlist.add(observer);
    }

    @Override
    public void remove(observer observer) {
        observerlist.remove(observer);
    }

    @Override
    public void NotifyObservers() {
        for (observer observer: observerlist)
        {
            observer.track(this.tracker);
        }
    }

    public void setTracker(boolean tracker) {
        this.tracker= tracker? "new post ": "no posts ";
        NotifyObservers();
    }
    public void print(Post post)
    {
        System.out.println(post.username);
        System.out.println(post.Title);
        System.out.println(post.body);
        System.out.println(post.postDate);
    }
}
