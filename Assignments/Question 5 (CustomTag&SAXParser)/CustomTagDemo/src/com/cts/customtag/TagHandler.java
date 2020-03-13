package com.cts.customtag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler  extends TagSupport{
	@Override
	public int doStartTag() throws JspException {
		System.out.println("From doStartTag()");
		JspWriter out=pageContext.getOut();
		try {
			out.write("<h1>"+new Date()+"</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("From doEndTag()");
		
		return SKIP_BODY;
	}

}
