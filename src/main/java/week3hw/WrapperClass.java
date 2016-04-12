package week3hw;

	
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

	public class WrapperClass {
		//Defining the global object
		RemoteWebDriver driver;

		//Method for Browser and getting the URL
		public void launchApp(String browser, String url) {

			try {
				if (browser.equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver = new ChromeDriver();
				}

				// "http://demo1.opentaps.org/opentaps/control/main"
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} catch (WebDriverException e) {
				System.out.println("Application could not be launched !!");
			}
		}

        /* Text Input */
		//Method for entering username and password by ID
		public void enterTextById(String id, String value) {
			try {
				driver.findElement(By.id(id)).clear();
				driver.findElement(By.id(id)).sendKeys(value);
			} catch (NoSuchElementException e) {
				System.out.println("The element with id : " + id + " could not be found !!");
			}
		}

		//Method for entering username and password by Classname
		public void enterTextByCname(String cname, String value) {
			try {
				driver.findElement(By.className(cname)).clear();
				driver.findElement(By.className(cname)).sendKeys(value);
			} catch (NoSuchElementException e) {
				System.out.println("The element with classname : " + cname + " could not be found !!");
			}
		}
		
		//Method for entering username and password by Link Text
				public void enterTextByltxt(String ltxt, String value) {
					try {
						driver.findElement(By.linkText(ltxt)).clear();
						driver.findElement(By.linkText(ltxt)).sendKeys(value);
					} catch (NoSuchElementException e) {
						System.out.println("The element with xpath could not be found !!");
					}
				}
				
		

				//Method for entering username and password by Partial Link Text
						public void enterTextBypltxt(String plinktxt, String value) {
							try {
								driver.findElement(By.linkText(plinktxt)).clear();
								driver.findElement(By.linkText(plinktxt)).sendKeys(value);
							} catch (NoSuchElementException e) {
								System.out.println("The element with xpath could not be found !!");
							}
						}
				
				//Method for entering username and password by Name
				public void enterTextByName(String name, String value) {
					try {
						driver.findElement(By.name(name)).clear();
						driver.findElement(By.name(name)).sendKeys(value);
					} catch (NoSuchElementException e) {
						System.out.println("The element with name : " + name + " could not be found !!");
					}
				}
		

				//Method for entering username and password by Tag Name
						public void enterTextByTagName(String tname, String value) {
							try {
								driver.findElement(By.tagName(tname)).clear();
								driver.findElement(By.tagName(tname)).sendKeys(value);
							} catch (NoSuchElementException e) {
								System.out.println("The element with name : " + tname + " could not be found !!");
							}
						}
				

				//Method for entering username and password by Xpath
								public void enterTextByXpath(String xpath, String value) {
									try {
										driver.findElement(By.xpath(xpath)).clear();
										driver.findElement(By.xpath(xpath)).sendKeys(value);
									} catch (NoSuchElementException e) {
										System.out.println("The element with name : " + xpath + " could not be found !!");
									}
								}
								

				//Method for entering username and password by Tag Name
										public void enterTextByCSS(String css, String value) {
											try {
												driver.findElement(By.cssSelector(css)).clear();
												driver.findElement(By.cssSelector(css)).sendKeys(value);
											} catch (NoSuchElementException e) {
												System.out.println("The element with name : " + css + " could not be found !!");
											}
										}
						
						//Method for Login & Logout using classname
		public void clickByClassName(String className) {
			try {

				driver.findElement(By.className(className)).click();
			} catch (NoSuchElementException e) {
				System.out.println("The element with className : " + className + " could not be found !!");
			}
		}
		
		//Method for Button Click (Login & Logout) using id 
		public void clickById(String id) {
			try {

				driver.findElement(By.id(id)).click();
			} catch (NoSuchElementException e) {
				System.out.println("The element with id : " + id + " could not be found !!");
			}
		}
	
		//Method for Click using XPath
				public void clickByxpath(String xpath) {
					try {

						driver.findElement(By.xpath(xpath)).click();
					} catch (NoSuchElementException e) {
						System.out.println("The element with xpath : " + xpath + " could not be found !!");
					}
				}

				//Method for Click using Link Text
				public void clickByltxt(String ltxt) {
					try {
						 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						 driver.findElement(By.linkText(ltxt)).click();
					} catch (NoSuchElementException e) {
						System.out.println("The element with Link Text : " + ltxt + " could not be found !!");
					}
				}

				
				//Method to check the page title
		
		public void verifyBrowserTitle(String expectedTitle){
			
			//boolean returnvalue = false;
			try {
				if (driver.getTitle().equals(expectedTitle)) {
					//returnvalue = true;
					System.out.println("The Page Title '" + expectedTitle + "' is displayed correctly");
				} else
					System.out.println("The title is displayed incorrectly. Expected display title is '" + expectedTitle
							+ "'" + ", but the actual title displayed is '" + driver.getTitle() + "'");
			} catch (Exception e) {
				System.out.println("Browser to be verified is not displayed");
			}
		}
		
		//Method to check the page URL
		
				public void verifyBrowserURL(String expectedurl){
					
					//boolean returnvalue = false;
					try {
						if (driver.getCurrentUrl().equals(expectedurl)) 
						{
							//returnvalue = true;
							System.out.println("The Page URL '" + expectedurl + "' is displayed correctly");
						} else
							System.out.println("The URL is displayed incorrectly. Expected URL is '" + expectedurl
									+ "'" + ", but the actual URL displayed is '" + driver.getCurrentUrl() + "'");
					} catch (Exception e) {
						System.out.println("Browser to be verified is not displayed");
					}
				}
		
				//Method to check the page text
				
				public void verifyBrowserText(String id, String expecttedtxt){
					
					try {
						
				  WebElement text = driver.findElement(By.id(id));
						if (text.getText().equals(expecttedtxt)) 
						{
							System.out.println("The Expected Text '" + expecttedtxt + "' is displayed correctly");
						} else
							System.out.println("The Text is displayed incorrectly. Expected Text is '" + expecttedtxt + "'" + ", but the actual text displayed is '" + text.getText()+"'");
					} catch (Exception e) {
						System.out.println("Text to be verified is not displayed");
					}
				}
		
				/*Methods for Dropdown selection using Index*/
		//Method to get the dropdown values by index using id
		
				public void DropdownbyID(String id, int index)
				{
					try {
						Select se = new Select(driver.findElement(By.id(id)));
						se.selectByIndex(index);
					} catch (NoSuchElementException e) {
						
						System.out.println("The Dropdown item with the id '"+id+"' and index "+index+" is not displayed");
						}
				}
				
				//Method to get the dropdown values by index using name
				
				public void Dropdownbyname(String name, int index)
				{
					try {
						Select se = new Select(driver.findElement(By.name(name)));
						se.selectByIndex(index);
					} catch (NoSuchElementException e) {
									
							System.out.println("The Dropdown item with the Name '"+name+"' and index "+index+" is not displayed");
							}
				
					}
				//Method to get the dropdown values by index using LinkText
				
						public void Dropdownbylinktxt(String ltxt, int index)
						{
							try {
								Select se = new Select(driver.findElement(By.linkText(ltxt)));
								se.selectByIndex(index);
							} catch (NoSuchElementException e) {
											
									System.out.println("The Dropdown item with the LinkText '"+ltxt+"' and index "+index+" is not displayed");
									}
						
							}
						
						//Method to get the dropdown values by index using PartialLinkText
						
						public void Dropdownbyplinktxt(String pltxt, int index)
						{
							try {
								Select se = new Select(driver.findElement(By.partialLinkText(pltxt)));
								se.selectByIndex(index);
							} catch (NoSuchElementException e) {
											
									System.out.println("The Dropdown item with the PartialLinkText '"+pltxt+"' and index "+index+" is not displayed");
									}
						
							}
				
		              //Method to get the dropdown values by index using CSS Selector
						
						public void Dropdownbycss(String css, int index)
						{
							try {
								Select se = new Select(driver.findElement(By.cssSelector(css)));
								se.selectByIndex(index);
							} catch (NoSuchElementException e) {
											
									System.out.println("The Dropdown item with the CSS Selector '"+css+"' and index "+index+" is not displayed");
									}
						
							}
				
		                //Method to get the dropdown values by index using Tag Name
						
						public void Dropdownbytagn(String tagn, int index)
						{
							try {
								Select se = new Select(driver.findElement(By.tagName(tagn)));
								se.selectByIndex(index);
							} catch (NoSuchElementException e) {
											
									System.out.println("The Dropdown item with the Tag Name '"+tagn+"' and index "+index+" is not displayed");
									}
						
							}
						//Method to get the dropdown values by index using classname
				
						public void Dropdownbycname(String cname, int index)
						{
							try {
								Select se = new Select(driver.findElement(By.className(cname)));
								se.selectByIndex(index);
							} catch (NoSuchElementException e) {
											
									System.out.println("The Dropdown item with the Classname '"+cname+"' and index "+index+" is not displayed");
									}
						
							}
						//Method to get the dropdown values by index using XPath
						
						public void Dropdownbyxpath(String xpath, int index)
						{
							try {
								Select se = new Select(driver.findElement(By.xpath(xpath)));
								se.selectByIndex(index);
							} catch (NoSuchElementException e) {
											
									System.out.println("The Dropdown item with the XPath '"+xpath+"' and index "+index+" is not displayed");
									}
						
							}
		
				/*Primary Window Wrppaer Methods*/
				//Method to Swicth to primary window using LinkText
				
				public void PWindowltxt(String ltxt)
				{
					try {
						String pwindowhl = driver.getWindowHandle();
						System.out.println("The window handle of primary window is"+pwindowhl+"window title"+driver.getTitle());
						driver.findElement(By.linkText(ltxt)).click();
						Set<String> allWindows = driver.getWindowHandles();
						System.out.println("The number of windows are :"+allWindows.size());

						// loop through each
						for (String eachWindow : allWindows) {
							driver.switchTo().window(eachWindow);
							System.out.println("The window handle is "+driver.getWindowHandle());
							System.out.println(driver.getTitle());
						}
						
						driver.switchTo().window(pwindowhl);					
						System.out.println(driver.getTitle());
							} 
					catch (NoSuchElementException e) {
						
						System.out.println("The Primary window with the link text '"+ltxt+"' does not exist");
						}
				}
				
				//Method to Swicth to last window using LinkText
				
				public void lWindowltxt(String ltxt)
				{
					try {
						String pwindowhl = driver.getWindowHandle();
						System.out.println("The window handle of primary window is"+pwindowhl+"window title"+driver.getTitle());
						driver.findElement(By.linkText(ltxt)).click();
						Set<String> allWindows = driver.getWindowHandles();
						System.out.println("The number of windows are :"+allWindows.size());

						// loop through each
						for (String eachWindow : allWindows) {
							driver.switchTo().window(eachWindow);
							System.out.println("The window handle is "+driver.getWindowHandle());
							System.out.println(driver.getTitle());
						}
												} 
					catch (NoSuchElementException e) {
						
						System.out.println("The Primary window with the link text '"+ltxt+"' does not exist");
						}
				}				
						/*Methods for Frames*/
				
				//Methods for Switch to frame by element Tag Name
				
				public void frameSwitchEletn(String elementtnm)
				{
						
				try {
					driver.switchTo().frame(driver.findElementByTagName(elementtnm));
				} catch (NoSuchElementException e) {
					System.out.println("The Frame with the Tag Name'"+elementtnm+"'searched for selection does not exist");
					}
						
						
				}
				//Methods for Switch to frame by element by Link Test
				
				public void frameSwitchEleltxt(String elementltxt)
				{
						
				try {
					driver.switchTo().frame(driver.findElementByLinkText(elementltxt));
				} catch (NoSuchElementException e) {
					System.out.println("The Frame with the Link Text'"+elementltxt+"'searched for selection does not exist");
					}
						
						
				}
				//Methods for Switch to frame by id
				
				public void frameSwitchindex(int id)
				{
						
				try {
					List<WebElement> frames = driver.findElementsByTagName("iframe");
					driver.switchTo().frame(id);
				} catch (NoSuchElementException e) {
					System.out.println("The Frame with the Tag Name Iframe and index"+id+"'searched for selection does not exist");
					}
						
						
				}
				
         /*Alert Handling*/
				//Accept Alert. This will work after the button click
			public void alertAccept()
			{
				try {
					Alert alert = driver.switchTo().alert();
					alert.accept();
				} catch (NoAlertPresentException e) {
					System.out.println("The Alert to be closed does not exist");
					}
				
			}
			//Cancel Alert. This will work after the button click
			public void alertCancel()
			{
				try {
					Alert alert = driver.switchTo().alert();
					alert.dismiss();
				} catch (NoAlertPresentException e) {
					System.out.println("The Alert to be closed does not exist");
					}
				
			}
	}
		
		



