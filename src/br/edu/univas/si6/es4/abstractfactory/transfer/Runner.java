package br.edu.univas.si6.es4.abstractfactory.transfer;

public class Runner {

	public static void main(String[] args) {
		// Cria a fábrica
		AbstractTransferFactory factory = AbstractTransferFactory.
				getFactory();

		// Fabrica o ObjectTransfer
		ObjectTransfer objectTransfer = factory.createObjectTransfer();

		// Fabrica o StringTransfer
		StringTransfer stringTransfer = factory.createStringTransfer();

		// Envia objeto
		objectTransfer.sendData(null);

		// Recebe objeto
		objectTransfer.receiveData();

		// Envia string
		stringTransfer.sendData(null);

		// Recebe string
		stringTransfer.receiveData();
	}

}
