package com.exam.kforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import com.google.gson.*;

public class MovieTitile {

	public static void main(String[] args) {

		// String[] sortedTitles = getMovieTitles("Spiderman");

		// System.out.println(sortedTitles);

	}

	/*static String[] getMovieTitles(String substr) {
		String[] titles = null;
		String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr;
		try {
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String response = br.readLine();

			JsonObject obj = new JsonParser().parse(response).getAsJsonObject();
			int total = obj.get("total").getAsInt();
			titles = new String[total];
			int total_pages = obj.get("total_pages").getAsInt();
			int count = 0;
			for (int i = 1; i <= total_pages; i++) {
				con = (HttpURLConnection) new URL(url + "&page=" + i).openConnection();
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				response = br.readLine();
				obj = new JsonParser().parse(response).getAsJsonObject();

				for (JsonElement e : obj.get("data").getAsJsonArray()) {
					titles[count++] = e.getAsJsonObject().get("Title").getAsString();
				}
			}
		} catch (Exception e) {

		}
		Arrays.sort(titles);
		return titles;
	}*/

}
