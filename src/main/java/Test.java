import java.util.UUID;

import io.xjar.XCryptos;

public class Test {
	
	public static void main(String[] args) {
		try {
			String passwd = UUID.randomUUID().toString();
			System.out.println(passwd);
			
			XCryptos.encryption()
			.from("F:/workspace/seperate/dkywave/dkywave-server/dkywave-netty/target/hhlx-dkywave-netty-1.0.0.jar")
			.use(passwd)
			.include("/com/hhlx/**")
			.include("/mapper/**")
			.include("/application-prjs/*")
//			.include("/*.yml")
//			.exclude("/application.yml")
			.to("F:/workspace/seperate/dkywave/dkywave-server/dkywave-netty/target/hhlx-dkywave-netty-1.0.0-encrypt.jar");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("encrypt over");
	}
}
