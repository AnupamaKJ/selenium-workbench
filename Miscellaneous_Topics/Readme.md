##### for File Utils, 
need to import --> Apache Commons IO 

##### To get screen shot of Page

File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(src, new File("G:\\Anupama\\Learning\\Selenium\\selenium-workbench\\seleniumScreenShots\\screenshot.png"));


##### To get screen shot of webelement

File file = name.getScreenshotAs(OutputType.FILE);
		
//for File Utils, need to import --> Apache Commons IO 
FileUtils.copyFile(file, new File("logo.png"));

#####  to get hight and width
name.getRect().getDimension().getHeight();

name.getRect().getDimension().getWidth();

		