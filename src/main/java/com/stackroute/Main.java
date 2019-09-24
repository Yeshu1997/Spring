package com.stackroute;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie mv=context.getBean("moviebean",Movie.class);
        System.out.println(mv.getActorObj());
    }
}
