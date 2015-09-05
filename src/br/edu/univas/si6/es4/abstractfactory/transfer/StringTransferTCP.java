package br.edu.univas.si6.es4.abstractfactory.transfer;

public class StringTransferTCP implements StringTransfer {

	@Override
	public void sendData(String data) {
		System.out.println("Enviando string via TCP...");
	}

	@Override
	public String receiveData() {
		System.out.println("Recebendo string via TCP...");
		return null;
	}

}
