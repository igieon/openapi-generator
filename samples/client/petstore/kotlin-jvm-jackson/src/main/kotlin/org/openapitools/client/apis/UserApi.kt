package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.fasterxml.jackson.annotation.JsonProperty

import org.openapitools.client.models.User

interface UserApi {
    /**
     * POST user
     * Create user
     * This can only be done by the logged in user.
     * Responses:
     *  - 0: successful operation
     *
     * @param user Created user object
     * @return [Call]<[Unit]>
     */
    @POST("user")
    fun createUser(@Body user: User): Call<Unit>

    /**
     * POST user/createWithArray
     * Creates list of users with given input array
     * 
     * Responses:
     *  - 0: successful operation
     *
     * @param user List of user object
     * @return [Call]<[Unit]>
     */
    @POST("user/createWithArray")
    fun createUsersWithArrayInput(@Body user: kotlin.collections.List<User>): Call<Unit>

    /**
     * POST user/createWithList
     * Creates list of users with given input array
     * 
     * Responses:
     *  - 0: successful operation
     *
     * @param user List of user object
     * @return [Call]<[Unit]>
     */
    @POST("user/createWithList")
    fun createUsersWithListInput(@Body user: kotlin.collections.List<User>): Call<Unit>

    /**
     * DELETE user/{username}
     * Delete user
     * This can only be done by the logged in user.
     * Responses:
     *  - 400: Invalid username supplied
     *  - 404: User not found
     *
     * @param username The name that needs to be deleted
     * @return [Call]<[Unit]>
     */
    @DELETE("user/{username}")
    fun deleteUser(@Path("username") username: kotlin.String): Call<Unit>

    /**
     * GET user/{username}
     * Get user by user name
     * 
     * Responses:
     *  - 200: successful operation
     *  - 400: Invalid username supplied
     *  - 404: User not found
     *
     * @param username The name that needs to be fetched. Use user1 for testing.
     * @return [Call]<[User]>
     */
    @GET("user/{username}")
    fun getUserByName(@Path("username") username: kotlin.String): Call<User>

    /**
     * GET user/login
     * Logs user into the system
     * 
     * Responses:
     *  - 200: successful operation
     *  - 400: Invalid username/password supplied
     *
     * @param username The user name for login
     * @param password The password for login in clear text
     * @return [Call]<[kotlin.String]>
     */
    @GET("user/login")
    fun loginUser(@Query("username") username: kotlin.String, @Query("password") password: kotlin.String): Call<kotlin.String>

    /**
     * GET user/logout
     * Logs out current logged in user session
     * 
     * Responses:
     *  - 0: successful operation
     *
     * @return [Call]<[Unit]>
     */
    @GET("user/logout")
    fun logoutUser(): Call<Unit>

    /**
     * PUT user/{username}
     * Updated user
     * This can only be done by the logged in user.
     * Responses:
     *  - 400: Invalid user supplied
     *  - 404: User not found
     *
     * @param username name that need to be deleted
     * @param user Updated user object
     * @return [Call]<[Unit]>
     */
    @PUT("user/{username}")
    fun updateUser(@Path("username") username: kotlin.String, @Body user: User): Call<Unit>

}
