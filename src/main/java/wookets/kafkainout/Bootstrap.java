package wookets.kafkainout;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Bootstrap {

	public static void main(String[] args) throws Exception {
		String hostname = args[0];
		int port = Integer.valueOf(args[1]);
		Injector injector = Guice.createInjector(new BootstrapNettyModule(hostname, port));
		final BootstrapNettyServer server = injector.getInstance(BootstrapNettyServer.class);
		server.run();
		System.out.println("Hey");
	}

}