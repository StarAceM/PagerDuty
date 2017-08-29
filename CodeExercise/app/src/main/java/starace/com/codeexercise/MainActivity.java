package starace.com.codeexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUserList();

    }

    private void getUserList(){

        RetrofitService retrofitService = RetrofitClient.getClient().create(RetrofitService.class);
        Call<User> call = retrofitService.getUser();
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user = response.body();

                 setRecyclerView();

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });

    }



    private void setRecyclerView(){
        recyclerView = (RecyclerView) findViewById(R.id.user_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
