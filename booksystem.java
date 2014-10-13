package bean;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class booksystem
{

    private String ISBN=null,title=null,author=null,publisher=null,date=null,age=null,nation=null;
    private float price;
    public booksystem()
    {

    }
    public void setNation(String nation)
    {
        this.nation=nation;
    }
    public String getNation()
    {
        return nation;
    }
    public  void setAge(String age)
    {
        this.age=age;
    }
    public String getAge()
    {
        return age;
    }
    public void setISBN(String ISBN)
    {
        this.ISBN=ISBN;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setPublisher(String publisher)
    {
        this.publisher=publisher;
    }
    public  void setPrice(float price)
    {
        this.price=price;
    }
    public void setDate(String date)
    {
        this.date=date;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public String getDate()
    {
        return date;
    }
    public float getPrice()
    {
        return price;
    }

    public ArrayList author_book(String s)
    {
        ArrayList list=new ArrayList();
        try {
            con = getConnection();
            stmt = createStatement("SELECT *FROM books");
            rs = stmt.executeQuery();
            while (rs.next()) {
                if(s.equals(rs.getString(3)))
                {
                    booksystem book=new booksystem();
                    book.setTitle(rs.getString(2));
                    book.setISBN(rs.getString(1));
                    list.add(book);
                }


            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            close();
        }
        return list;
    }

    //删除
    public void delete(String ISBN)
    {
        try {
            con = getConnection();
            String sql = "delete from books where ISBN=\"" + ISBN + "\"";
            System.out.println(sql);
            stmt = createStatement(sql);
            executeUpdate();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    //查找所有详情
    public ArrayList book(String s)
    {
        ArrayList list=new ArrayList();
        try {
            con = getConnection();
            stmt = createStatement("SELECT *FROM books");
            rs = stmt.executeQuery();
            while (rs.next())
            {

                if(s.equals(rs.getString(2)))
                {
                    booksystem book=new booksystem();
                    book.setTitle(rs.getString(2));
                    book.setISBN(rs.getString(1));
                    book.setPublisher(rs.getString(4));
                    book.setDate(rs.getString(6));
                    book.setAuthor(rs.getString(3));
                    book.setPrice(rs.getFloat(5));
                    book.setAge(rs.getString(7));
                    book.setNation(rs.getString(8));
                    list.add(book);
                }


            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            close();
        }
        return list;

    }


    public void new_book(String tempISBN,String temptitle,String tempauthor,String temppublisher,String tempdate,String tempage,String tempnation,float tempprice)
    {
        int flag=0;
        String v="(\""+tempISBN+"\",\""+temptitle+"\",\""+tempauthor+"\",\""+temppublisher+"\",\""+tempprice+"\"," +
                "\""+tempdate+"\"," +
                "\""+tempage+ "\",\""+tempnation+"\")";
        try {
            con = getConnection();
            stmt = createStatement("SELECT *FROM books");
            rs = stmt.executeQuery();
            while (rs.next()) {

                if (tempISBN.equals(rs.getString(1))) {
                    String sql = "update books set " + v;

                    try {

                        con = getConnection();
                        stmt = createStatement(sql);
                        executeUpdate();

                    } catch (Exception e) {
                        System.out.println(e.toString());
                    } finally {
                        close();
                    }

                    flag = 1;
                }


            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            close();
        }


        if(flag==0)
        {

            String sql="insert into books values"+v;
            try {

                con = getConnection();
                stmt = createStatement(sql);
                executeUpdate();

            }
            catch (Exception e) {
                System.out.println(e.toString());
            }
            finally {
                close();
            }

        }


    }





    //数据库连接封装
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    String driverClass = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_jokertony";

    // 完成连接的创建
    public Connection getConnection() throws Exception {
        Class.forName(driverClass);//加载驱动程序
        if (con == null) {
            con = DriverManager.getConnection(url, "0w200k3ko3", "lkiy3y32lyzww240klwz1ixllkxxyjy3wjmhlj2x");
        }
        return con;
    }

    //创建语句对象
    public PreparedStatement createStatement(String sql) throws Exception {
        stmt = getConnection().prepareStatement(sql);
        return stmt;
    }

    //执行带有结果集返回的方法
    public ResultSet executeQuery() throws Exception {
        rs = stmt.executeQuery();
        return rs;
    }

    //执行没有结果集返回的方法
    public int executeUpdate() throws Exception {
        return stmt.executeUpdate();
    }

    //关闭对象
    public void close() {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }



}
