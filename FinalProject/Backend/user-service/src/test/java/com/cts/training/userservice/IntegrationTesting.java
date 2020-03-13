package com.cts.training.userservice;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = UserServiceApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
@ExtendWith(SpringExtension.class)
public class IntegrationTesting {

	@LocalServerPort
	private int port;
	HttpHeaders headers=new HttpHeaders();
	TestRestTemplate restTemplate=new TestRestTemplate();
	
	
	@Test
	public void test() throws Exception{
	
		String url="http://localhost:"+port+"/registerUser";
		System.out.println("Port : :"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(null,headers);
		ResponseEntity<String> response= restTemplate.exchange(url,HttpMethod.GET,entity,String.class);
		String expected="{\"id\":1,\"username\":\"Sairam\",\"password\":\"Jagadam\",\"reenterpassword\":\"Jagadam\"";
		System.out.println("TEST 1 :: Response Body :::: " + response.getBody());
		assertTrue(response.getBody().contains(expected));
	
	}
	@Test
	public void test1() throws Exception{
		String url="http://localhost:"+port+"/registerUser/1";
		System.out.println("Port::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(null, headers);
		ResponseEntity<String> response=restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		String expected="{\"id\":1,\"username\":\"Sairam\",\"password\":\"Jagadam\",\"reenterpassword\":\"Jagadam\"";
		System.out.println("Test::Response body:::: "+response.getBody());
		assertTrue(response.getBody().contains(expected));
	}
	@Test
	public void testAdd() throws Exception{
		String url="http://localhost:"+port+"/registerUser";
		System.out.println("Port::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		UserEntity user=new UserEntity(2,"VenkataSairam","KingJagadam","KingJagadam",987665468l,"jagadamsairam@gmail.com","jagadamsairam@gmail.com", url, false, false);
		HttpEntity<UserEntity> entity=new HttpEntity<UserEntity>(user, headers);
		ResponseEntity<String> response=restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
		String expected="\"res\":\"0\"";
		System.out.println("Test::Response body:::: "+response.getBody());
		assertTrue(response.getBody().contains(expected));
	}

}
