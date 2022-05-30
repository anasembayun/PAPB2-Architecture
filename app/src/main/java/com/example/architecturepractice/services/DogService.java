package com.example.architecturepractice.services;

import com.example.architecturepractice.modals.DogRandomResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogService {
    @GET("breeds/image/random")
    Call<DogRandomResponse> fetchRandomDog();
}
