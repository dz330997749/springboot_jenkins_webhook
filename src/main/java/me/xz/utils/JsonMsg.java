package me.xz.utils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XZ
 * @Date: 2020/7/16 0:45
 * 这里写的是Controller返回前台时的Map集合的数据格式
 */

@Data
public class JsonMsg {

	private String message;
	private int status;
	private Map<String, Object> extend = new HashMap<>();

//	返回成功的信息
	public static JsonMsg success() {
		JsonMsg result = new JsonMsg();
		result.setMessage("操作成功");
		result.setStatus(100);
		return result;
	}

//	返回失败的信息
	public static JsonMsg fail() {
		JsonMsg result = new JsonMsg();
		result.setStatus(200);
		result.setMessage("操作失败");
		return result;
	}

//	追加其他的信息
	public JsonMsg addInfo(String key, Object value) {
		this.extend.put(key, value);
		return this;
	}

}

















