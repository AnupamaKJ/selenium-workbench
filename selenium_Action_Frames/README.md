#### Actions ####

How to MouseOver on object with Selenium

Performning mouse and keyboard interaction with Selenium

context click on element

Double click on element

Drag and dropping the elements

Actions a = new Actions(driver);

a.moveToElement(move).contextClick().build().perform();


#### Switching between Windows ####

https://the-internet.herokuapp.com/windows

Set<String> windows = driver.getWindowHandles(); //[ParentID, childID]
		
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID =it.next();
		driver.switchTo().window(childID);



#### Frames ####

https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/1979338#overview

https://jqueryui.com/droppable/


What are frames --> Frames are hosted on the web pages, independent of HTML code
--> Selenium cann't identify the frames

How to identify frames in application

how to handle frames

best practices when working with frames application

