package com.example.scottsmith.weatherapp.Api_Calls;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DarkSkyApi {

    @GET("{api_key}/{latitude},{longitude}")
    Call<Weather> getWeather (@Path("a[i_key") String apiKet, @Path("latitude") double latitude, @Path("longitude") double longitude);
}
