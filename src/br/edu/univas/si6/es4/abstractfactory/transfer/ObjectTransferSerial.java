package br.edu.univas.si6.es4.abstractfactory.transfer;

public class ObjectTransferSerial implements ObjectTransfer {

	@Override
	public void sendData(Object data) {
		System.out.println("Enviando objeto via serial...");
	}

	@Override
	public Object receiveData() {
		System.out.println("Recebendo objeto via serial...");
		return null;
	}

}
