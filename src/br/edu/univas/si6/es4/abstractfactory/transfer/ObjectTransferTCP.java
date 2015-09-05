package br.edu.univas.si6.es4.abstractfactory.transfer;

public class ObjectTransferTCP implements ObjectTransfer {

	@Override
	public void sendData(Object data) {
		System.out.println("Enviando objeto via TCP...");
	}

	@Override
	public Object receiveData() {
		System.out.println("Recebendo objeto via TCP...");
		return null;
	}

}
