package com.gabriel.ws.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import com.gabriel.ws.Calculadora;
import com.gabriel.ws.CalculadoraImplPortBindingStub;
import com.gabriel.ws.CalculadoraImplService;
import com.gabriel.ws.CalculadoraImplServiceLocator;

public class CalculadoraCliente {

	public static void main(String[] args) throws Exception {
		
		//objeto para obtener el consumo de servicio
		CalculadoraImplService servicio = new CalculadoraImplServiceLocator();
		
		Calculadora ws = new CalculadoraImplPortBindingStub(new URL(servicio.getCalculadoraImplPortAddress()), servicio);
		
		try {
			System.out.println("Suma");
			System.out.println(ws.operacion(1, 2, 3));
			
			System.out.println("Resta");
			System.out.println(ws.operacion(2, 5, 1));
			
			System.out.println("Multiplicacion");
			System.out.println(ws.operacion(3, 6, 3));
			
			System.out.println("Division");
			System.out.println(ws.operacion(4, 16, 8));
		} catch (RemoteException e) {
			throw new Exception();
		}
	}
	
}
