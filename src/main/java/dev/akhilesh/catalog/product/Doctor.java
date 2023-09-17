package dev.akhilesh.catalog.product;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware
{
    public String name;

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                '}';
    }

    public void assist(){
        System.out.println(" doc is assisting");
    }

    public void checkout(String st1){
        System.out.println(" doc is logging "+st1);
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("set bean name aware"+name);
    }


}
