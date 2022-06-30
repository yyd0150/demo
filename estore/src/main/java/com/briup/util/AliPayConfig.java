package com.briup.util;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

public class AliPayConfig {
	/*
	 * 服务网关---沙箱环境
	 */
	
	private static String serverURL = "https://openapi.alipaydev.com/gateway.do";
	/*
	 * 应用ID
	 */
	private static String APP_ID = "2021000120612185";
	/*
	 * 用户私钥，可以替换成你自己的
	 */
	private static String APP_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDpGAeGC0bBGwQaAioUyqN9Icac73sWrq02Qes8DfrWV6EsTc36zBIsK9TckNWt2ZGijIqFuIJtNbaIP1SqEA1IGMAbJh8bb7/hS7YgWGy4Um+eq95xh0iZ9zkKAdtQXNtBspYj99F+Ve+3OdV1Bsw28IQNBMA6pQCbhvYWScEnopty8N9oZ1BWJUSkgppfCz1RjOc+BwFcHC561x1z2JBDMfIOJcUbJltVUFcY2/gIahN8jmT6mFqF0fCEShIa64QwLQW3KzAWrbqllGDFAPanqzgdwcNTv1IgxP1CK7p4TDscGx79e93MHi4pVbxJGw8vlBS7+AfQis/NwQxInYTrAgMBAAECggEAVknb9yZTggcDRLGKbHn7fcY0JUKOOX5ehthuQaQXOKPl+WWwG+jRzWJIgYJoZ9xECn2mhgwg1FbvBI8VQ4N/tzHaY/J/z4NV8Aw8FstFLBLwWTfcuABRwxV/GxJG4wAM9swqwpPqDK+5dwXE3HawwKHW8I7SrqMIj4qtrOCOzaGyqVrBP19ctHgLvH0H9i5DQakPZQrH1tKZsDtHEj2ApJhb3YUyCmRBZbXR5EcLiJRNHhOste4MjW3Lx231QwNrE7s4ASKiNxo1jnoSJ5XOOCs7Ir9GgYkOXojuiVcbT8hIDl084x8BA0N3dbuIiICpyjP7IwHRGRC9nqeacnnlcQKBgQD6dMqI1Q2Df1hTNpVpWm/wxaTjNdVnj6XWObRX01aDAWh/lzxZI+m1dENUPGWWPU+eJ4EwsOB5AkuMSdLIQP05Ze9XK9AovXvYrCf00BCBrYKN0ZQ7HU+BNOSiNQ+YjYnLi4heSnJ+0QOyQJZEzjK2tq37V/k1akHJgZk5izTHYwKBgQDuQNrFArWRwAg7bKGPp+fb7T6P3WoY06ojgdcsxDhedqbn5eVtXOwuaSL2nrPm00hnkYxDGLJWCJS4BM08sX/QCbqLn9SCWtjWtUsylvQsW/MBahaUOQQdHEvDSmuXknG8iL2Z9aGB0gp4GQtKO62vNd1sAyEam4grqw6fyKoW2QKBgQCWGOA4WNacc/kPBatNVDG57fj/Ygfe5KvSUwrNh45VPMbPkGdOVMN/R4oCNZ/8BgptEefOsnIUk1eLX8K+2JPpjjl92HgLsmNCWwonIXqC/OU88NkRBGPdX0GWJI6QMmLeZWT4fU1YyxKYBTUJTzn9XkWuV+62IFQE23JklhSvWQKBgQDtEXVd0TtQAq9uScJcyiroaCH3Ts6yU3MZD6pG7hxUymV7nAL1FiAgchcLJJFH3fZOr8HMRbe16aXpkUWS3d+a5wNKyUfQSYs34X8ooJHnzbp4LtK2vCD+wlgUw2lZkatAeSOIHaSOI6ytIeZdABLro4JmZpq6+gW9xeCwVx//yQKBgQDgXzfXtbMWMUbetP0VRpgVKQ6YDbDMDnTF2w206iNtwZx2nu0nFBs7wnCYhwfMjSy7OeZIpNDpe2BCtAPf3Nvbw67WjaozkZuJxZOTmylsbmd1us7evEMVI/AaB+rTOhBrNLjK91EkWBI2IGDLyZ8tS1TtMZ03O8JlAck2DWddIQ==";
	/*
	 * 发送数据格式
	 */
	private static String format = "json";
	/*
	 * 设置字符集编码的格式 CHARSET
	 */
	private static String CHARSET ="utf-8";
	/*
	 * 支付宝的公钥，大家可以替换成自己的
	 */
	private static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjSCmDqWLZwKOAycMzwaCi9c+hEMuyX+/ovOR1ZUbvvi04Tyxhjp8APz8sjnFcjXIp51rWcBREBrrItibwR6PsNrg4u5oCRqg1fQkCmbSnKRkaMSumFKBx9KLo7bsPNzx0/aBRCxnfhPMtWwIEZHS1I7qJG2cQHarhvzmpJM0T5LDzZlU+cflKQLXHGZ3PZWPsQeNnECBeOuV/8g+NLG5rF5h3jq33ym4LWh1ky7OjICBjgb7Jiq12TfOJOwFa9NJvKXPIVjz3Wy71yFA2AwXzbUwqAJ8PJz7cV5ECMX6DK9P9E/HTKdHIOAq2+nVzFeaUyXl3FYYIiqhwlp9DrIuEwIDAQAB";
	
	/*
	 * 支付宝签名 目前采用的是RSA2
	 */
	private static String signType = "RSA2";
	
	/*
	 *页面跳转同步通知也页面
	 */
	public static String return_url = "http://127.0.0.1:8989/estore/index.jsp";
	
	public static AlipayClient getAlipayClient() {
		return new DefaultAlipayClient(serverURL, APP_ID, APP_PRIVATE_KEY, format, CHARSET, ALIPAY_PUBLIC_KEY, signType);
	}

}
