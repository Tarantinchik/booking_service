package com.bookingservice.utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Parser {

    public List<String> getValuesForGivenKey(String jsonArrayStr, String key) {
        JSONArray jsonArray = new JSONArray(jsonArrayStr);
        return IntStream.range(0, jsonArray.length())
                .mapToObj(index -> ((JSONObject)jsonArray.get(index)).optString(key))
                .collect(Collectors.toList());
    }

    public JSONObject editObject(JSONObject jsonObject, String key, String value) {
        jsonObject.getJSONObject("methodProperties").put(key, value);
        return jsonObject;
    }

    public JSONObject editArray(JSONObject jsonObject, String arrayName, String key, String value) {
        JSONObject documents = (JSONObject) jsonObject.getJSONObject("methodProperties").getJSONArray(arrayName).get(0);
        documents.put(key, value);
        return jsonObject;
    }

    public JSONObject addToArray(JSONObject jsonObject, String arrayName, String id) {
        jsonObject.getJSONObject("methodProperties").getJSONArray(arrayName).put(id);
        return jsonObject;
    }

    public List<String> getArrayItemsBySubArrayName(String jsonArrayAsString, String subArrayObjectKey) {
        JSONArray jsonArray = new JSONArray(jsonArrayAsString);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            JSONArray cards = jsonObject.getJSONArray("cards");

            for (int j = 0; j < cards.length(); j++) {
                JSONObject jsonObjectCards = (JSONObject) cards.get(j);
                JSONArray labels = jsonObjectCards.getJSONArray("labels");

                for (int k = 0; k < labels.length(); k++) {
                    JSONObject jsonObjectLabels = (JSONObject) labels.get(k);
                    String key = jsonObjectLabels.get(subArrayObjectKey).toString();
                    System.out.println(key);
                }
            }
            //System.out.println(jsonObject);
        }


        return null;
    }

}