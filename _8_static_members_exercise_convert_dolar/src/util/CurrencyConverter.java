package util;

public class CurrencyConverter {
	
	public static double dolarExchange;
	public static double dolarBuy;
	
	
	public static double convert() {
		return dolarExchange * dolarBuy * 1.06;
/*		resultado da conversão em reais vezes 1.06
 * 		(que corresponde a 106%) ou aumento de 6%. */
	}
}
