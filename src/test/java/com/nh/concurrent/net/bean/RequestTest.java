package com.nh.concurrent.net.bean;
import static junit.framework.Assert.*;

import junit.framework.TestCase;

public class RequestTest extends TestCase{

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
