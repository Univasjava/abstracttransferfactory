package br.edu.univas.si6.es4.abstractfactory.transfer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AbstractTransferFactory {

	public abstract ObjectTransfer createObjectTransfer();

	public abstract StringTransfer createStringTransfer();

	public static AbstractTransferFactory getFactory() {
		String fileName = "transferfactory.properties";
		InputStream is = AbstractTransferFactory.class.getClassLoader().
				getResourceAsStream(fileName);
		if (is == null) {
			throw new RuntimeException("Recurso não encontrado.");
		}
		Properties props = new Properties();
		try {
			props.load(is);
			String type = props.getProperty("transferfactory.factorytype");
			if ("Serial".equalsIgnoreCase(type)) {
				return new SerialFactory();
			} else if ("TCP".equalsIgnoreCase(type)) {
				return new TCPFactory();
			} else {
				throw new RuntimeException("Tipo não suportado: " + type);
			}
		} catch (IOException e) {
			throw new RuntimeException("Não foi possível ler as propriedades.", e);
		}
	}

}
