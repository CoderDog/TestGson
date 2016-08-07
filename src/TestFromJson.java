import com.google.gson.Gson;


public class TestFromJson {
	public static void main(String[] args) {
		String json = "{\"code\":201,\"message\":\"ok\"}";
		Bean bean = new Bean();
		Gson gson = new Gson();
		bean = gson.fromJson(json, Bean.class);
		System.out.println("code:"+bean.code);
		System.out.println("message:"+bean.message);
	}

}
