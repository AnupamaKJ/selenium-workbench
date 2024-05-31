##### WebDriver details for different browsers

System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\GeckoDriver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();

System.setProperty("webdriver.edge.driver", "E:\\Softwares\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();

##### Enhanced for loop
for (String name :names)

##### Methods and classes
to Access any methods present in a class, you have to create object of the class -  object.class

##### Short cut 
For Format --> Shift+Ctrl+F


#### Strings
// String is an object, that represents the sequence of characters
		
//String literal
String s = "Rahul Shetty Academy";  
String s1 = "Rahul Shetty Academy";  
		
//String with new key word
String s2 = new String("Rahul Shetty Academy");  
String s3 = new String("Rahul Shetty Academy");  

#### TestNg
To get Assertions need to remove scope from the pom.xml file 

#### Naming
ClassName == always with UpperCase
Variable == in lowercase

### Debug ###
1. Put it in debug mode
2. Once it reaches debug mode, right click and click on watch out 
3. In the Expressions, try the required string