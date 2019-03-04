package cn.com.slhero.httpnum;

public enum MyEnum {
	
	HTTP_200(200, "请求成功"), HTTP_500(500, "请求失败");
	private Integer httpCode;
	private String httpMsg;

	private MyEnum(Integer httpCode, String httpMsg) {
		System.out.println("MyEnum初始化....");
		this.httpCode = httpCode;
		this.httpMsg = httpMsg;
	}

	public Integer getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(Integer httpCode) {
		this.httpCode = httpCode;
	}

	public String getHttpMsg() {
		return httpMsg;
	}

	public void setHttpMsg(String httpMsg) {
		this.httpMsg = httpMsg;
	}
	public static void main(String[] args) {
		System.out.println(MyEnum.HTTP_200.httpCode);
		System.out.println(MyEnum.HTTP_200.httpCode);
		System.out.println(MyEnum.HTTP_200.httpCode);
		System.out.println(MyEnum.HTTP_500.httpCode);
	}
}
