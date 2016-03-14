package com.nh.concurrent.net.bean;
import static org.junit.Assert.*;
import org.junit.Test;

public class RequestTest {
	@Test
	public void testBaseMethod()
	{
		Request.request_Net.Builder builder = Request.request_Net.newBuilder();
		builder.setCmd("ontouch");
		Request .request_Net  request = builder.build();
		byte[] buffer = request.toByteArray();
		try {
			 Request.request_Net req = Request.request_Net.parseFrom(buffer);
			 req.getCmd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
