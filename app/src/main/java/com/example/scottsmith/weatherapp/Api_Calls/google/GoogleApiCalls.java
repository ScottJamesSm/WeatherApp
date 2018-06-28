package com.example.scottsmith.weatherapp.Api_Calls;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoogleApiCalls {
    @GET('joson')
    Call<GoogleAddress> getAddress(@Query("address") String address, @Query("api_key") String apiKey);
}
