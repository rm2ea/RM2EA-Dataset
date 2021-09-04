package spring;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class airportAutoTest {

    public static void main(String[] args) throws InterruptedException {
    	
//jmeter -n -t D:\apache-jmeter-5.4\test\Request.jmx -l D:\apache-jmeter-5.4\result\report.jtl -e -o D:\apache-jmeter-5.4\result
//jmeter -n -t D:\apache-jmeter-5.4\test\prototype.jmx -l D:\apache-jmeter-5.4\test_result\NEW\report.jtl -e -o D:\apache-jmeter-5.4\test_result\NEW\result
//jmeter -n -t D:\apache-jmeter-5.4\test\Airport.jmx -l D:\apache-jmeter-5.4\result\report2.jtl -e -o D:\apache-jmeter-5.4\airport_result\result1
	
//jmeter -n -t D:\apache-jmeter-5.4\test\Airport.jmx -l D:\apache-jmeter-5.4\airport_result\NEW\report1.jtl -e -o D:\apache-jmeter-5.4\airport_result\NEW\result1
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
    	    Thread.sleep(1000);
        
//            driver.findElement(By.id("User")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("Role")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("TbRepair")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("TbRepairExtra")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("ProcessingFees")).click();
//            Thread.sleep(1000);
            
            driver.findElement(By.id("s_function")).click();
            Thread.sleep(1000);
            //--------------------------------------------------------------
            SystemManage(driver);
            //--------------------------------------------------------------  
            share(driver,"zhang4","123456");
            ordinary(driver);
            //--------------------------------------------------------------  
            share(driver,"zhang2","123456");
            Master(driver);
            //--------------------------------------------------------------  
            share(driver,"zhang3","123456");
            Worker(driver);
           
//           
//           
//            
//            driver.findElement(By.id("enterItem")).click();
//            
//            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
//            
//            driver.findElement(By.id("barcode")).sendKeys("1");
//            Thread.sleep(1000);
//           
//            driver.findElement(By.id("quantity")).sendKeys("10");
//            Thread.sleep(1000);
//            
//        	driver.findElement(By.id("executeButton")).click();
//            Thread.sleep(2000);
//             
//            driver.switchTo().alert().accept(); //点击alert确定
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("barcode")).clear();
//            Thread.sleep(300);
//            driver.findElement(By.id("barcode")).sendKeys("2");
//            Thread.sleep(1000);
//           
//            driver.findElement(By.id("quantity")).clear();
//            Thread.sleep(300);
//            driver.findElement(By.id("quantity")).sendKeys("5");
//            Thread.sleep(1000);
//            
//        	driver.findElement(By.id("executeButton")).click();
//            Thread.sleep(2000);
//             
//            driver.switchTo().alert().accept(); //点击alert确定
//            Thread.sleep(1000);
//            
//            driver.switchTo().defaultContent();
//            //--------------------------------------------------------------  
//            driver.findElement(By.id("endSale")).click();
//            
//            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
//            
//        	driver.findElement(By.id("executeButton")).click();
//            Thread.sleep(2000);
//             
//            driver.switchTo().alert().accept(); //点击alert确定
//            Thread.sleep(1000);
//            
//            driver.switchTo().defaultContent();
//            //--------------------------------------------------------------  
//            driver.findElement(By.id("makeCashPayment")).click();
//            
//            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
//            
//            driver.findElement(By.id("amount")).sendKeys("100");
//            Thread.sleep(1000);
//            
//        	driver.findElement(By.id("executeButton")).click();
//            Thread.sleep(2000);
//             
//            driver.switchTo().alert().accept(); //点击alert确定
//            Thread.sleep(1000);
//            
//            driver.switchTo().defaultContent();
//            //--------------------------------------------------------------  
//            
//            //--------------------------------------------------------------  
//            
//            driver.findElement(By.id("makeNewSale")).click();
//            
//            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
//            
//            Thread.sleep(1000);
//        	driver.findElement(By.id("executeButton")).click();
//            Thread.sleep(2000);
//             
//            driver.switchTo().alert().accept(); //点击alert确定
//            Thread.sleep(1000);
//            
//            driver.switchTo().defaultContent();
//            //--------------------------------------------------------------  
//            
//            driver.findElement(By.id("enterItem")).click();
//            
//            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
//            
//            driver.findElement(By.id("barcode")).sendKeys("1");
//            Thread.sleep(1000);
//           
//            driver.findElement(By.id("quantity")).sendKeys("5");
//            Thread.sleep(1000);
//            
//        	driver.findElement(By.id("executeButton")).click();
//            Thread.sleep(2000);
//             
//            driver.switchTo().alert().accept(); //点击alert确定
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("barcode")).clear();
//            Thread.sleep(300);
//            driver.findElement(By.id("barcode")).sendKeys("2");
//            Thread.sleep(1000);
//           
//            driver.findElement(By.id("quantity")).clear();
//            Thread.sleep(300);
//            driver.findElement(By.id("quantity")).sendKeys("5");
//            Thread.sleep(1000);
//            
//        	driver.findElement(By.id("executeButton")).click();
//            Thread.sleep(2000);
//             
//            driver.switchTo().alert().accept(); //点击alert确定
//            Thread.sleep(1000);
//            
//            driver.switchTo().defaultContent();
//            //--------------------------------------------------------------  
//            driver.findElement(By.id("endSale")).click();
//            
//            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
//            
//        	driver.findElement(By.id("executeButton")).click();
//            Thread.sleep(2000);
//             
//            driver.switchTo().alert().accept(); //点击alert确定
//            Thread.sleep(1000);
//            
//            driver.switchTo().defaultContent();
//            //--------------------------------------------------------------  
//            driver.findElement(By.id("makeCardPayment")).click();
//            
//            driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
//            
//            driver.findElement(By.id("cardAccountNumber")).sendKeys("567868989898");
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("expiryDate")).sendKeys("2020-04-17");
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("fee")).sendKeys("10");
//            Thread.sleep(1000);
//            
//        	driver.findElement(By.id("executeButton")).click();
//            Thread.sleep(2000);
//             
//            driver.switchTo().alert().accept(); //点击alert确定
//            Thread.sleep(1000);
//            
////            driver.findElement(By.id("Cashier")).click();
////            Thread.sleep(1000);
//            
//            driver.switchTo().defaultContent();
//            //--------------------------------------------------------------  
//            driver.findElement(By.id("s_state")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.id("Sale")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("SalesLineItem")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("CashPayment")).click();
//            Thread.sleep(1000);
//            
//            driver.findElement(By.id("CardPayment")).click();
//            Thread.sleep(1000);
            
            System.out.printf("title of current page is %s\n", driver.getTitle());
            System.out.printf("url of current page is %s\n", driver.getCurrentUrl());
            
            
//            System.out.println("browser will be close");
//            driver.quit();    
   }
    
    
    public static void Worker(WebDriver driver) throws InterruptedException {
    	 driver.findElement(By.id("Worker")).click();
         Thread.sleep(1000);
         
         driver.findElement(By.id("receiveTb")).click();
         
         driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
         
 	    driver.findElement(By.id("tbId")).sendKeys("1");
 	    Thread.sleep(1000); 
 	    
     	driver.findElement(By.id("executeButton")).click();
         Thread.sleep(2000);
          
         driver.switchTo().alert().accept(); //点击alert确定
         Thread.sleep(1000);
         
         driver.switchTo().defaultContent();
         
         
         driver.findElement(By.id("completeTb")).click();
         
         driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
         
 	    driver.findElement(By.id("tbId")).sendKeys("1");
 	    Thread.sleep(1000); 
 	    driver.findElement(By.id("cause")).sendKeys("变压器异常");
 	    Thread.sleep(1000); 
 	    driver.findElement(By.id("resolvent")).sendKeys("更换了变压器零件");
 	    Thread.sleep(1000); 
 	    
     	driver.findElement(By.id("executeButton")).click();
         Thread.sleep(2000);
          
         driver.switchTo().alert().accept(); //点击alert确定
         Thread.sleep(1000);
         
         driver.switchTo().defaultContent();
         
         
         driver.findElement(By.id("rocessingFees")).click();
         
         driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
         
 	    driver.findElement(By.id("tbId")).sendKeys("1");
 	    Thread.sleep(1000); 
 	    driver.findElement(By.id("projectName")).sendKeys("更换压器零件");
 	    Thread.sleep(1000); 
 	    driver.findElement(By.id("price")).sendKeys("100");
 	    Thread.sleep(1000); 
 	    driver.findElement(By.id("number")).sendKeys("2");
 	    Thread.sleep(1000); 
 	    driver.findElement(By.id("remake")).sendKeys("变压器异常，需要更换变压器零件");
 	    Thread.sleep(1000); 
 	    
     	driver.findElement(By.id("executeButton")).click();
         Thread.sleep(2000);
          
         driver.switchTo().alert().accept(); //点击alert确定
         Thread.sleep(1000);
         
         driver.switchTo().defaultContent();
         
         
         driver.findElement(By.id("Worker")).click();
         Thread.sleep(1000);
    }
    public static void Master(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("Master")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("allocation")).click();
        
        driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
        
        driver.findElement(By.id("userId")).sendKeys("3");
	    Thread.sleep(1000);  
	    
	    driver.findElement(By.id("tbId")).sendKeys("1");
	    Thread.sleep(1000); 
	    
    	driver.findElement(By.id("executeButton")).click();
        Thread.sleep(2000);
         
        driver.switchTo().alert().accept(); //点击alert确定
        Thread.sleep(1000);
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.id("Master")).click();
        Thread.sleep(1000);
    }
    public static void share(WebDriver driver,String name,String password) throws InterruptedException {
    	
    	driver.findElement(By.id("Share")).click();
        Thread.sleep(1000);
         
        driver.findElement(By.id("userLogin")).click();
        
        driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
        
        driver.findElement(By.id("name")).sendKeys(name);
	    Thread.sleep(1000);  
	    
	    driver.findElement(By.id("password")).sendKeys(password);
	    Thread.sleep(1000); 
	    
    	driver.findElement(By.id("executeButton")).click();
        Thread.sleep(2000);
         
        driver.switchTo().alert().accept(); //点击alert确定
        Thread.sleep(1000);
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.id("Share")).click();
        Thread.sleep(1000);
    }
    public static void ordinary(WebDriver driver) throws InterruptedException {
    	 driver.findElement(By.id("Ordinary")).click();
         Thread.sleep(1000);
         
         driver.findElement(By.id("submitRepair")).click();
         
         driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
         
         driver.findElement(By.id("departmentid")).sendKeys("5");
 	    Thread.sleep(1000);  
 	    driver.findElement(By.id("AssignDepartId")).sendKeys("2");
 	    Thread.sleep(1000);  
 	    
 	    driver.findElement(By.id("repairName")).sendKeys("zhc");
 	    Thread.sleep(1000); 
         
 	    driver.findElement(By.id("phone")).sendKeys("188***11111");
 	    Thread.sleep(1000); 
 	    
 	    driver.findElement(By.id("place")).sendKeys("候机楼");
 	    Thread.sleep(1000); 
 	    
 	    driver.findElement(By.id("repairsStatus")).sendKeys("1");
 	    Thread.sleep(1000); 
 	    
 	    driver.findElement(By.id("DeviceId")).sendKeys("1");
 	    Thread.sleep(1000); 
 	    
 	    driver.findElement(By.id("describeContent")).sendKeys("候机楼");
 	    Thread.sleep(1000); 
 	    
 	    driver.findElement(By.id("FailureTypeId")).sendKeys("1");
 	    Thread.sleep(1000); 
 	    
     	driver.findElement(By.id("executeButton")).click();
         Thread.sleep(2000);
          
         driver.switchTo().alert().accept(); //点击alert确定
         Thread.sleep(1000);
         
         driver.switchTo().defaultContent();
         
         
//         driver.findElement(By.id("submitRepairExtra")).click();
//         
//         driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
//         
//         driver.findElement(By.id("departmentid")).sendKeys("2");
// 	    Thread.sleep(1000);  
// 	    
// 	    driver.findElement(By.id("TbRId")).sendKeys("1");
// 	    Thread.sleep(1000); 
// 	    
//     	driver.findElement(By.id("executeButton")).click();
//         Thread.sleep(2000);
//          
//         driver.switchTo().alert().accept(); //点击alert确定
//         Thread.sleep(1000);
//         
//         driver.switchTo().defaultContent();
         
         driver.findElement(By.id("Ordinary")).click();
         Thread.sleep(1000);
    }
    public static void SystemManage(WebDriver driver) throws InterruptedException {
    	driver.findElement(By.id("SystemManage")).click();
        Thread.sleep(500);
        
        driver.findElement(By.id("manageDepartment")).click();
        Thread.sleep(500);
        
        driver.findElement(By.id("createDepartment")).click();
        Thread.sleep(500);
      
	    driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
        
	    for(int i=1;i<=5;i++) {
	    		driver.findElement(By.id("id")).clear();
	    		driver.findElement(By.id("id")).sendKeys(""+i);
	    	    Thread.sleep(500);
	          
	    	    driver.findElement(By.id("name")).clear();
	          	driver.findElement(By.id("name")).sendKeys("department"+i);
	          	Thread.sleep(500);
	          	
	          	driver.findElement(By.id("contactRerson")).clear();
	          	driver.findElement(By.id("contactRerson")).sendKeys("zhang"+i);
	          	Thread.sleep(500);
	          	
	          	driver.findElement(By.id("principal")).clear();
	          	driver.findElement(By.id("principal")).sendKeys("zhao"+i);
	          	Thread.sleep(500);
	          	
	          	driver.findElement(By.id("phone")).clear();
	          	driver.findElement(By.id("phone")).sendKeys("1886595XXXX");
	          	Thread.sleep(500);
	          	
	          	driver.findElement(By.id("briefInfo")).clear();
	          	driver.findElement(By.id("briefInfo")).sendKeys("该部门主要负责。。。");
	          	Thread.sleep(500);
	          	
	          	driver.findElement(By.id("describeContent")).clear();
	          	driver.findElement(By.id("describeContent")).sendKeys("部门"+i);
	          	Thread.sleep(500);
	    	    
	    	    driver.findElement(By.id("executeButton")).click();
	            Thread.sleep(500);
	            
	            driver.switchTo().alert().accept(); //点击alert确定
	            Thread.sleep(500);
	    }
        
	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.id("manageDepartment")).click();
        Thread.sleep(500);
        driver.findElement(By.id("manageDepartment")).click();
        Thread.sleep(500);
        
        //--------------------------------------------------------------
	    driver.findElement(By.id("manageEquipmentFailureType")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("createEquipmentFailureType")).click();
        Thread.sleep(1000);
        
        driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
        
        
        for(int i=1;i<=4;i++) {
        	driver.findElement(By.id("id")).clear();
            driver.findElement(By.id("id")).sendKeys(""+i);
    	    Thread.sleep(1000);
          
    	    driver.findElement(By.id("name")).clear();
          	driver.findElement(By.id("name")).sendKeys("故障"+i);
          	Thread.sleep(1000);

          	driver.findElement(By.id("describeContent")).clear();
          	driver.findElement(By.id("describeContent")).sendKeys("该故障是由于。。。原因引起的");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("remark")).clear();
          	driver.findElement(By.id("remark")).sendKeys("备注");
          	Thread.sleep(1000);
          	
          	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(2000);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(1000);
        }
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.id("manageEquipmentFailureType")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("manageEquipmentFailureType")).click();
        Thread.sleep(1000);
	    //--------------------------------------------------------------
        driver.findElement(By.id("manageDeviceAssociationGroup")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("createDeviceAssociationGroup")).click();
        Thread.sleep(1000);
        
        driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
        
        
        for(int i=1;i<=4;i++) {
        	driver.findElement(By.id("id")).clear();
        	driver.findElement(By.id("id")).sendKeys(""+i);
        	Thread.sleep(1000);
        	
        	driver.findElement(By.id("name")).clear();
        	driver.findElement(By.id("name")).sendKeys("关联分组"+i);
        	Thread.sleep(1000);
        	
        	driver.findElement(By.id("remark")).clear();
        	driver.findElement(By.id("remark")).sendKeys("备注");
        	Thread.sleep(1000);
        	
        	driver.findElement(By.id("executeButton")).click();
        	Thread.sleep(2000);
        	
        	driver.switchTo().alert().accept(); //点击alert确定
        	Thread.sleep(1000);
        }
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.id("manageDeviceAssociationGroup")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("manageDeviceAssociationGroup")).click();
        Thread.sleep(1000);
        //--------------------------------------------------------------
        driver.findElement(By.id("manageDeviceLocationGroup")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("createDeviceLocationGroup")).click();
        Thread.sleep(1000);
        
        driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
        
        
        for(int i=1;i<=4;i++) {
        	driver.findElement(By.id("id")).clear();
        	driver.findElement(By.id("id")).sendKeys(""+i);
        	Thread.sleep(1000);
        	
        	driver.findElement(By.id("name")).clear();
        	driver.findElement(By.id("name")).sendKeys("位置分组"+i);
        	Thread.sleep(1000);
        	
        	driver.findElement(By.id("remark")).clear();
        	driver.findElement(By.id("remark")).sendKeys("备注");
        	Thread.sleep(1000);
        	
        	driver.findElement(By.id("executeButton")).click();
        	Thread.sleep(2000);
        	
        	driver.switchTo().alert().accept(); //点击alert确定
        	Thread.sleep(1000);
        }
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.id("manageDeviceLocationGroup")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("manageDeviceLocationGroup")).click();
        Thread.sleep(1000);
//        //--------------------------------------------------------------
	    driver.findElement(By.id("manageRole")).click();
        Thread.sleep(500);
        
        driver.findElement(By.id("createRole")).click();
        Thread.sleep(500);
        
        driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
        
        
        for(int i=1;i<=4;i++) {
        	driver.findElement(By.id("id")).clear();
            driver.findElement(By.id("id")).sendKeys(""+i);
    	    Thread.sleep(500);
          
    	    driver.findElement(By.id("remark")).clear();
          	driver.findElement(By.id("remark")).sendKeys("权限"+i);
          	Thread.sleep(500);

          	driver.findElement(By.id("roleCode")).clear();
          	driver.findElement(By.id("roleCode")).sendKeys(i*1000+"");
          	Thread.sleep(500);
          	
          	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(500);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(500);
        }
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.id("manageRole")).click();
        Thread.sleep(500);
        driver.findElement(By.id("manageRole")).click();
        Thread.sleep(500);
        //--------------------------------------------------------------
	    driver.findElement(By.id("manageUser")).click();
        Thread.sleep(500);
        
        driver.findElement(By.id("createUser")).click();
        Thread.sleep(500);
        
        driver.switchTo().frame(driver.findElement(By.id("iframeMain")));
        
        for(int i=1;i<=4;i++) {
        	driver.findElement(By.id("id")).clear();
            driver.findElement(By.id("id")).sendKeys(""+i);
    	    Thread.sleep(500);
          
    	    driver.findElement(By.id("name")).clear();
          	driver.findElement(By.id("name")).sendKeys("zhang"+i);
          	Thread.sleep(500);
          	
          	driver.findElement(By.id("password")).clear();
          	driver.findElement(By.id("password")).sendKeys("123456");
          	Thread.sleep(500);
          	
          	driver.findElement(By.id("phone")).clear();
         	driver.findElement(By.id("phone")).sendKeys("1886595xxxx");
          	Thread.sleep(500);
          	
          	driver.findElement(By.id("roleCode")).clear();
         	driver.findElement(By.id("roleCode")).sendKeys(i*1000+"");
          	Thread.sleep(500);
          	
          	driver.findElement(By.id("departmentid")).clear();
          	if(i==3) {
          		driver.findElement(By.id("departmentid")).sendKeys(""+(i-1));
          	}else {
          		driver.findElement(By.id("departmentid")).sendKeys(""+i);
          	}
          	Thread.sleep(500);
          	
        	driver.findElement(By.id("executeButton")).click();
            Thread.sleep(500);
             
            driver.switchTo().alert().accept(); //点击alert确定
            Thread.sleep(500);
        }
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.id("manageUser")).click();
        Thread.sleep(500);
        driver.findElement(By.id("manageUser")).click();
        Thread.sleep(500);
      	
        driver.findElement(By.id("SystemManage")).click();
        Thread.sleep(500);
//        //--------------------------------------------------------------  

    }
}