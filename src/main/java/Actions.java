public class Actions {

	public boolean open(String url, int timeout) throws InterruptedException {
		int y = 10 + (int) (Math.random() * 1000);
		Thread.sleep(y);
		double x = Math.random();
		if (x > timeout) {
			return true;
		}
		return false;
	}

	public  boolean checkLinkPresentByHref(String href) throws InterruptedException {
		int y = 10 + (int) (Math.random() * 1000);
		Thread.sleep(y);
		double x = Math.random();
		if (x > 0.5) {
			return true;
		}
		return false;
	}

	public  boolean checkLinkPresentByName(String name) throws InterruptedException {
		int y = 10 + (int) (Math.random() * 1000);
		Thread.sleep(y);
		double x = Math.random();
		if (x > 0.5) {
			return true;
		}
		return false;
	}

	public  boolean checkPageTitle(String title) throws InterruptedException {
		int y = 10 + (int) (Math.random() * 1000);
		Thread.sleep(y);
		double x = Math.random();
		if (x > 0.5) {
			return true;
		}
		return false;
	}

	public  boolean checkPageContains(String element) throws InterruptedException {
		int y = 10 + (int) (Math.random() * 1000);
		Thread.sleep(y);
		double x = Math.random();
		if (x > 0.5) {
			return true;
		}
		return false;
	}
}
