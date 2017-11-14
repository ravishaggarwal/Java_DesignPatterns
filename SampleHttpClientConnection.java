package mytest.myexample;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.*;

public class SampleHttpClientConnection {
  
  private static String url = "http://google.com/";

  public static void main(String[] args) {
  
    HttpClient httpClient = new HttpClient();
    GetMethod method = new GetMethod(url);
    method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler(3, false));
    try {
	     int statusCode = httpClient.executeMethod(method);
	     if (statusCode != HttpStatus.SC_OK) {
	    	 System.err.println("Call to Method is failed: " + method.getStatusLine());
      }
	  byte[] responseBody = method.getResponseBody();
	  System.out.println("The response body is : " +new String(responseBody));
    } catch (HttpException e) {
      System.err.println("HTTP Connection is not successful. " + e.getMessage());
      e.printStackTrace();
    } catch (IOException e) {
      System.err.println("the I/O Exception being raised while doing read/write operation " + e.getMessage());
      e.printStackTrace();
    } finally {
    	method.releaseConnection();
    }  
  }
}