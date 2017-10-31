package ren.shiwen.eurekaclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class rootconroller {
	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private EurekaClient eurekaClient;

	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable("applicationName") String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello world";
	}

	@RequestMapping("/gethello")
	public String gethello() {
		
		ServiceInstance instance = discoveryClient.getLocalServiceInstance();
    
		return instance.getHost()+":Hello world:"+instance.getServiceId();
	}

	public String serviceUrl() {
		InstanceInfo instance = eurekaClient.getNextServerFromEureka("", false);
		return instance.getHomePageUrl();
	}
}
