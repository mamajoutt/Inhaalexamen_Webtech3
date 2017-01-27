package edu.ap.client;

import java.rmi.RemoteException;

import edu.ap.ws.RegistratieProxy;

public class RegistratieClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			RegistratieProxy proxy = new RegistratieProxy();
			String registratie = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
			registratie += "<registratie interventiedatum=\"16/08/2016 14:00:00\" naamvanpatient=\"Mohamed Amajoutt\" geboortedatumvanpatient=\"27/03/1993\" verpleegkundige=\"Dr.De Preter\" diagnose=\"GRIEP\" allergieen=\"NEEN\">";
			registratie += "</registratie>";
			proxy.addRegistratie(registratie);
			String registratie2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
			registratie2 += "<registratie interventiedatum=\"16/08/2016 14:00:00\" naamvanpatient=\"Mohamed Amajoutt\" geboortedatumvanpatient=\"27/03/1993\" verpleegkundige=\"Dr.De Preter\" diagnose=\"GRIEP\" allergieen=\"NEEN\">";
			registratie2 += "</registratie>";
			proxy.addRegistratie(registratie2);
			System.out.println(proxy.getRegistraties());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
