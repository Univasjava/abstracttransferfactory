package br.edu.univas.si6.es4.abstractfactory.transfer;

public class SerialFactory extends AbstractTransferFactory {

	@Override
	public ObjectTransfer createObjectTransfer() {
		return new ObjectTransferSerial();
	}

	@Override
	public StringTransfer createStringTransfer() {
		return new StringTransferSerial();
	}

}
