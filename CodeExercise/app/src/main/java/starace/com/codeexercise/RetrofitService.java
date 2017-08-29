package starace.com.codeexercise;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mstarace on 8/29/17.
 */

public interface RetrofitService {

    @GET("users/")
    Call<User> getUser();

}
