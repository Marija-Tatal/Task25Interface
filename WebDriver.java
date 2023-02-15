package Class25HW;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(),
     closeBrowser(), maximizeWindow(), findElement().
      Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("User maximize window in Chrome");

    }

    @Override
    public void findElement() {
        System.out.println("User is find the element in Chrome Browser");

    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open FireFox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close FireFox Browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("User maximize window in FireFox");

    }

    @Override
    public void findElement() {
        System.out.println("User is find the elements in FireFox Browser");

    }
}
class WebDriverTester{
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver(), new FireFoxDriver()};
        for (WebDriver user:arr){
            user.openBrowser();
            user.closeBrowser();
            user.findElement();
            user.maximizeWindow();
        }
    }
}
