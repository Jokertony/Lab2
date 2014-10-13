package action;



import bean.booksystem;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.Map;


public class book_detail extends ActionSupport
{
    private String author,ISBN,title,publisher,date,age,nation;
    private float price;
    public String execute()
    {


        booksystem book=new booksystem();
        ArrayList list=book.book(title);
        ActionContext context=ActionContext.getContext();
        Map session=(Map)context.getSession();
        session.put("list",list);
        return "success";
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setISBN(String ISBN)
    {
        this.ISBN=ISBN;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public void setTitle(String title) {this.title=title;}
    public String getTitle()
    {
        return title;
    }
    public void setPublisher(String publisher)
    {
        this.publisher=publisher;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public void setDATE(String date)
    {
        this.date=date;
    }
    public String getDATE()
    {
        return date;
    }
    public void setAge(String age)
    {
        this.age=age;
    }
    public String getAge(){return age;}
    public void setNation(String nation)
    {
        this.nation=nation;
    }
    public String getNation()
    {
        return nation;
    }
    public void setPrice(float price1)
    {
        this.price=price;
    }
    public float getPrice()
    {
        return price;
    }



}

