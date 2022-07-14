/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery_details;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tinas
 */
public class Delivery_DetailsTest 
{
    
    private int weight = 0;
    private int price1 = 300;
    private int price2 = 500;
    private int price3 = 700;
    private String deliveryComp;
    private String CapeTown;
    private String Durban;
    private String Pretoria;
    private String kg1 = "0kg - 4kg";
    private String kg2 = "5kg - 9kg";
    private String kg3 = "Over 10kg";
    
    
    @Test
    public void Delivery_Details(String cT,String Pa,String Db, int w , int p1,int p2,int p3 , String d) 
    {
        CapeTown = cT;
        Pretoria = Pa;
        Durban = Db;
        weight = w;
        price1 = p1;
        price2 = p2;
        price3 = p3;
        deliveryComp = d;
    }
    public String getCapeTown()
    {
        return CapeTown;
    }
    public void setCapeTown(String cT)
    {
        CapeTown = cT;
    }
    public String getPretoria()
    {
        return Pretoria;
    }
    public void setPretoria(String Pa)
    {
        Pretoria = Pa;
    }
    public String getDurban()
    {
        return Durban;
    }
    public void setDurban(String Db)
    {
        Durban = Db;
    }
    public int getWeight()
    {
        return weight;
    }
    public void setWeight(int w)
    {
        weight = w;
    }
    public int getPrice1()
    {
        return price1;
        
    }
    public void setPrice1(int p1)
    {
        price1 = p1;
    }
    public int getPrice2()
    {
        return price2;
    }
    public void setPrice2(int p2)
    {
        price2 = p2;
    }
    public int getPrice3()
    {
        return price3;
    }
    public void setPrice3(int p3)
    {
        price3 = p3;
    }
    public String getDeliveryComp()
    {
        return deliveryComp;
    }
}

