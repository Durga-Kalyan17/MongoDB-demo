//package com.movies.services;
//
//import java.net.http.HttpHeaders;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.RequestEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//public class IMDbResponse {
//	
//	 static final String theUrl = "https://imdb8.p.rapidapi.com/title/get-most-popular-movies";
//     RestTemplate restTemplate = new RestTemplate();
//     
//     private static void getRes() {
//    	 try {
//             HttpHeaders headers = createHttpHeaders("12a7a1ffb6mshb783c3d4e515584p1fe300jsn2e9a61e9f658", "imdb8.p.rapidapi.com");
//             HttpEntity<?> entity = new HttpEntity<>(headers);
//             ResponseEntity<String> response = new ResponseEntity<String>(null);
//             try {
//				response = restTemplate.exchange(theUrl, HttpMethod.GET, entity, String.class);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//             System.out.println("Result - status (" + response.getStatusCode() + ") has body: " + response.hasBody());
//         } catch (Exception eek) {
//             System.out.println("** Exception: " + eek.getMessage());
//         }
//     }
// 
//
// private static HttpHeaders createHttpHeaders(String apiKey, String apiHost) {
//	 
//	 List<String> headersList = new ArrayList<>();
//	 
//	 Map<String,List<String>> headersLists
//	 
//     HttpHeaders headers = new HttpHeaders(headersList);
//     headers.firstValue(apiKey);
//     headers.firstValue(apiHost);
//     return headers;
// }
//	
////
////    private static final String API_KEY = "12a7a1ffb6mshb783c3d4e515584p1fe300jsn2e9a61e9f658";
////    private static final String API_HOST = "imdb8.p.rapidapi.com";
//
////    public String getMostPopularMovies() {
////        // Create RestTemplate instance
////        RestTemplate restTemplate = new RestTemplate();
////
////        // Create HttpHeaders object
////        HttpHeaders headers = new HttpHeaders();
////        
////        headers.
////
////        // Set RapidAPI key and host headers
////        headers.set("X-RapidAPI-Key", API_KEY);
////        headers.set("X-RapidAPI-Host", API_HOST);
////
////        // Set content type header
////        headers.setContentType(MediaType.APPLICATION_JSON);
////
////        // Create HttpEntity with headers
////        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
////
////        // Make the HTTP request using RestTemplate
////        String url = "https://imdb8.p.rapidapi.com/title/get-most-popular-movies";
////        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
////
////        // Access the response
////        String response = responseEntity.getBody();
////
////        return response;
//	
////	String url = "https://imdb8.p.rapidapi.com/title/get-most-popular-movies";
////    String apiKey = "12a7a1ffb6mshb783c3d4e515584p1fe300jsn2e9a61e9f658";
////    String apiHost = "imdb8.p.rapidapi.com";
//////    String queryString = "homeCountry=US&purchaseCountry=US&currentCountry=US";
//////
//////    String fullUrl = url + "?" + queryString;
////
////    HttpHeaders headers = new HttpHeaders();
////    headers.set("X-RapidAPI-Key", apiKey);
////    headers.set("X-RapidAPI-Host", apiHost);
////    headers.setContentType(MediaType.APPLICATION_JSON);
////
////    RequestEntity<Void> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, url);
////
////    RestTemplate restTemplate = new RestTemplate();
////    ResponseEntity<String> responseEntity = restTemplate.exchange(requestEntity, String.class);
////
////    String response = responseEntity.getBody();
////    System.out.println(response);
//
//}
//}
