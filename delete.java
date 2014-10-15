package action;

import bean.booksystem;
import com.opensymphony.xwork2.ActionSupport;


public class delete extends ActionSupport{
    private  String ISBN;
    public void setISBN(String ISBN)
    {
        this.ISBN=ISBN;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public String execute()
    {
        booksystem book=new booksystem();
        book.delete(ISBN);
        return "success";
    }
}