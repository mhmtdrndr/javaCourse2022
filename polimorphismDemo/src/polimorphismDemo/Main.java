package polimorphismDemo;

public class Main {
	public static void main(String[] args) {
		
		BaseLogger[] loggers = new BaseLogger[] {
			new DatabaseLogger(),
			new FileLogger(),
			new EmailLogger()
		};
		
		for (BaseLogger logger : loggers) {
			logger.log("Loglama mesajı");
		}
		
		CustomerManager manager = new CustomerManager(new EmailLogger());
		manager.add();
	}

}
