package TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Writer.Writer;

public class MySpringWriterBeanWithDependency {

    private Writer writer;

    @Autowired
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void run(){
        String var =  "Sample String";
        writer.write(var);
    }
}
