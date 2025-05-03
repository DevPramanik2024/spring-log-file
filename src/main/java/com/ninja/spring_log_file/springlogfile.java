package com.ninja.spring_log_file;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springlogfile 
{
	@RequestMapping("/devops")
	public String devops()
	{
		return "we are devops file";
	}
	
	@RequestMapping("/dev")
	public String dev()
	{
		return "we are dev file";
	}
}
