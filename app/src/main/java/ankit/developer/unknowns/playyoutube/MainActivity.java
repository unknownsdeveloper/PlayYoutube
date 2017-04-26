package ankit.developer.unknowns.playyoutube;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnRun,btnStop;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStop=(Button)findViewById(R.id.btnStop);
        imgView = (ImageView)findViewById(R.id.animation);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animatorX = ObjectAnimator.ofFloat(imgView,"scaleX",0.5f,1f).setDuration(1000);
                //animatorX.start();
                ObjectAnimator animatorY = ObjectAnimator.ofFloat(imgView,"scaleY",0.5f,1f).setDuration(1000);
                animatorY.start();


//                AnimatorSet animSet = new AnimatorSet();

//                animSet.playTogether(animatorX,animatorY);

//                animSet.start();

            }
        });
    }
}
