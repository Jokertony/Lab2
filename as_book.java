package action;



import bean.booksystem;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.Map;


public class as_book extends ActionSupport
{
    private String author,ISBN;
    public String execute()
    {


        booksystem book=new booksystem();
        System.out.println(author);
        ArrayList list=book.author_book(author);
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


}

