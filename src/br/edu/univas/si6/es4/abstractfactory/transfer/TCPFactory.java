package br.edu.univas.si6.es4.abstractfactory.transfer;

public class TCPFactory extends AbstractTransferFactory {

	@Override
	public ObjectTransfer createObjectTransfer() {
		return new ObjectTransferTCP();
	}

	@Override
	public StringTransfer createStringTransfer() {
		return new StringTransferTCP();
	}

}
