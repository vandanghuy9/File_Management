package com.example.filemanagement

import retrofit2.http.GET

interface StudentInterface {

    @GET("jsons/users.json")
    suspend fun listUser(): List<>

//    @GET("posts/{userId}")
//    suspend fun listByUser(@Path("userId") userId:String): List<Post>
//
//    @GET("posts/search")  // becomes post/search?filter=query
//    suspend fun search(@Query("filter") search: String): List<Post>
//
//    @POST("posts/new")
//    suspend fun create(@Body post : Post): Post

}