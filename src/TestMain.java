import com.google.gson.Gson;


public class TestMain {
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		Bean bean = new Bean();
		bean.setCode(200);
		bean.setMessage("ok");
		String json = gson.toJson(bean);
		System.out.println(json);
	}

	
}


