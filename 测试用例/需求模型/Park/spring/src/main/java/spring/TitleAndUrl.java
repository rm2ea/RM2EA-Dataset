package spring;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class TitleAndUrl {

    public static void main(String[] args) throws InterruptedException {
    	

    	    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
    	
    	 	String path=System.getProperty("user.dir")+"\\chromedriver.exe";
    		File f=new File(path);
    		System.err.println();
//    	    System.setProperty("webdriver.chrome.driver", "E:\\soft_test\\demo\\chromedriver.exe");
    	    System.setProperty("webdriver.chrome.driver", f.getPath());
    	    WebDriver driver = new ChromeDriver();
    	    driver.get("http://localhost:8080");
    	    
    	    System.out.println("maximize browser");
    	    driver.manage().window().maximize();
    	    //--------------------------------------------------------------
       	    WebElement searchBox = driver.findElement(By.id("s_state"));
    	    Actions action = new Actions(driver);
    	    action.moveToElement(searchBox).perform();
    	    action.click().perform();
//    	    Thread.sleep(1000);
        
//            driver.findElement(By.id("Store")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("ProductCatalog")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("CashDesk")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("Cashier")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("Item")).click();
//            Thread.sleep(1000);
            
            driver.findElement(By.id("s_function")).click();
//            Thread.sleep(1000);
            //--------------------------------------------------------------
            driver.findElement(By.id("Administrator")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("manageStore")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("createStore")).click();
            Thread.sleep(1000);
          
    	    driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
    	    driver.findElement(By.id("id")).sendKeys("1");
    	    Thread.sleep(1000);
          
          	driver.findElement(By.id("name")).sendKeys("store");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("address")).sendKeys("山东");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("isopened")).sendKeys("0");
          	Thread.sleep(1000);
    	    
    	    driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
            
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
    	    driver.switchTo().defaultContent();
    	    
    	    driver.findElement(By.id("manageStore")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("manageStore")).click();
            Thread.sleep(1000);
    	    //--------------------------------------------------------------
    	    driver.findElement(By.id("manageProductCatalog")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("createProductCatalog")).click();
            Thread.sleep(1000);
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("id")).sendKeys("1");
    	    Thread.sleep(1000);
          
          	driver.findElement(By.id("name")).sendKeys("水果");
          	Thread.sleep(1000);
            
          	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            
            driver.findElement(By.id("manageProductCatalog")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("manageProductCatalog")).click();
            Thread.sleep(1000);
            //--------------------------------------------------------------
    	    driver.findElement(By.id("manageCashDesk")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("createCashDesk")).click();
            Thread.sleep(1000);
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("id")).sendKeys("1");
    	    Thread.sleep(1000);
          
          	driver.findElement(By.id("name")).sendKeys("desk");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("isopened")).sendKeys("0");
          	Thread.sleep(1000);
          	
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            
            driver.findElement(By.id("manageCashDesk")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("manageCashDesk")).click();
            Thread.sleep(1000);
          	//--------------------------------------------------------------
          	driver.findElement(By.id("manageCashier")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("createCashier")).click();
            Thread.sleep(1000);
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("id")).sendKeys("1");
    	    Thread.sleep(1000);
          
          	driver.findElement(By.id("name")).sendKeys("张三");
          	Thread.sleep(1000);
            
          	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            
            driver.findElement(By.id("manageCashier")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("manageCashier")).click();
            Thread.sleep(1000);
        	//--------------------------------------------------------------
          	driver.findElement(By.id("manageItem")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("createItem")).click();
            Thread.sleep(1000);
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("barcode")).sendKeys("1");
    	    Thread.sleep(1000);
          
          	driver.findElement(By.id("name")).sendKeys("apple");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("price")).sendKeys("2");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("stocknumber")).sendKeys("100");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("orderprice")).sendKeys("1");
          	Thread.sleep(1000);
            
          	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.findElement(By.id("barcode")).clear();
            driver.findElement(By.id("barcode")).sendKeys("2");
    	    Thread.sleep(1000);
          
    	    driver.findElement(By.id("name")).clear();
          	driver.findElement(By.id("name")).sendKeys("orange");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("price")).clear();
          	driver.findElement(By.id("price")).sendKeys("3");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("stocknumber")).clear();
          	driver.findElement(By.id("stocknumber")).sendKeys("100");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("orderprice")).clear();
          	driver.findElement(By.id("orderprice")).sendKeys("2");
          	Thread.sleep(1000);
            
          	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            
            driver.findElement(By.id("manageItem")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("manageItem")).click();
            Thread.sleep(1000);
            //--------------------------------------------------------------  
            driver.findElement(By.id("manageSupplier")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("createSupplier")).click();
            Thread.sleep(1000);
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("id")).sendKeys("1");
    	    Thread.sleep(1000);
          
          	driver.findElement(By.id("name")).sendKeys("supplier");
          	Thread.sleep(1000);         
            
          	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            
            driver.findElement(By.id("manageSupplier")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("Administrator")).click();
            Thread.sleep(1000);
            //--------------------------------------------------------------  
            driver.findElement(By.id("StoreManager")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("openStore")).click();
            Thread.sleep(1000);
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("storeID")).sendKeys("1");
    	    Thread.sleep(1000);    
            
          	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            
            driver.findElement(By.id("StoreManager")).click();
            Thread.sleep(1000);
            //--------------------------------------------------------------  
            driver.findElement(By.id("Cashier")).click();
            Thread.sleep(1000);

            
            driver.findElement(By.id("openCashDesk")).click();
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("cashDeskID")).sendKeys("1");
    	    Thread.sleep(1000);  
    	    
            Thread.sleep(1000);
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            //--------------------------------------------------------------  
            driver.findElement(By.id("processSale")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("makeNewSale")).click();
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            Thread.sleep(1000);
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            //--------------------------------------------------------------  
            
            driver.findElement(By.id("enterItem")).click();
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("barcode")).sendKeys("1");
            Thread.sleep(1000);
           
            driver.findElement(By.id("quantity")).sendKeys("10");
            Thread.sleep(1000);
            
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.findElement(By.id("barcode")).clear();
            Thread.sleep(300);
            driver.findElement(By.id("barcode")).sendKeys("2");
            Thread.sleep(1000);
           
            driver.findElement(By.id("quantity")).clear();
            Thread.sleep(300);
            driver.findElement(By.id("quantity")).sendKeys("5");
            Thread.sleep(1000);
            
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            //--------------------------------------------------------------  
            driver.findElement(By.id("endSale")).click();
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            //--------------------------------------------------------------  
            driver.findElement(By.id("makeCashPayment")).click();
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("amount")).sendKeys("100");
            Thread.sleep(1000);
            
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            //--------------------------------------------------------------  
            
            //--------------------------------------------------------------  
            
            driver.findElement(By.id("makeNewSale")).click();
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            Thread.sleep(1000);
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            //--------------------------------------------------------------  
            
            driver.findElement(By.id("enterItem")).click();
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("barcode")).sendKeys("1");
            Thread.sleep(1000);
           
            driver.findElement(By.id("quantity")).sendKeys("5");
            Thread.sleep(1000);
            
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.findElement(By.id("barcode")).clear();
            Thread.sleep(300);
            driver.findElement(By.id("barcode")).sendKeys("2");
            Thread.sleep(1000);
           
            driver.findElement(By.id("quantity")).clear();
            Thread.sleep(300);
            driver.findElement(By.id("quantity")).sendKeys("5");
            Thread.sleep(1000);
            
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            //--------------------------------------------------------------  
            driver.findElement(By.id("endSale")).click();
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            //--------------------------------------------------------------  
            driver.findElement(By.id("makeCardPayment")).click();
            
            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
            
            driver.findElement(By.id("cardAccountNumber")).sendKeys("567868989898");
            Thread.sleep(1000);
            
            driver.findElement(By.id("expiryDate")).sendKeys("2020-04-17");
            Thread.sleep(1000);
            
            driver.findElement(By.id("fee")).sendKeys("10");
            Thread.sleep(1000);
            
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
            
//            driver.findElement(By.id("Cashier")).click();
//            Thread.sleep(1000);
            
            driver.switchTo().defaultContent();
            //--------------------------------------------------------------  
            driver.findElement(By.id("s_state")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("Sale")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("SalesLineItem")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("CashPayment")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.id("CardPayment")).click();
            Thread.sleep(1000);
            
            System.out.printf("title of current page is %s\n", driver.getTitle());
            System.out.printf("url of current page is %s\n", driver.getCurrentUrl());
            
            
//            System.out.println("browser will be close");
//            driver.quit();    
   }

}