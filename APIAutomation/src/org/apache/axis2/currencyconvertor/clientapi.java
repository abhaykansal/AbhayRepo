package org.apache.axis2.currencyconvertor;

import java.util.Currency;

import org.apache.axis2.currencyconvertor.CurrencyConvertorStub.ConversionRate;
import org.apache.axis2.currencyconvertor.CurrencyConvertorStub.ConversionRateResponse;
//abhay
public class clientapi {
	
	 public static void main(String args[]) {

		  try {

		       //Create the stub object by passing the service end point url
		       CurrencyConvertorStub stub = new CurrencyConvertorStub("http://www.webservicex.net/CurrencyConvertor.asmx");
		       //ConversionRate is the class which we have to use mention the from and to currency
		       //ConversionRhttp://download.eclipse.org/egit/updateshttp://download.eclipse.org/egit/updatesate object will be the parameter for the conversionRate operation
		       ConversionRate conversionRate = new ConversionRate();
		       conversionRate.setFromCurrency(Currency.USD);
		       conversionRate.setToCurrency(Currency.INR);
		       //hello check compare ok
		       
		       //Create the ConversionRateResponse object, which is going to be used to catch the response
		       //call the conversionRate service using the stub object
		       ConversionRateResponse conversionRateResponse = stub.conversionRate(conversionRate);

		       //We can use the conversionRateResponse object to retrieve the response of the ConversionRate Service
		       System.out.println("Conversion Rate from INR to USD : " + conversionRateResponse.getConversionRateResult());

		       } catch (Exception e) {
		       e.printStackTrace();
		      }
		    }
		}
			

}
