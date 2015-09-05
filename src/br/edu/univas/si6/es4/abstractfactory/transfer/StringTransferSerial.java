package br.edu.univas.si6.es4.abstractfactory.transfer;

public class StringTransferSerial implements StringTransfer {

	@Override
	public void sendData(String data) {
		System.out.println("Enviando string via serial...");
	}

	@Override
	public String receiveData() {
		System.out.println("Recebendo string via serial...");
		return null;
	}

}
