package bbhs.appbowl2017;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by adamf on 4/11/2017.
 */

public class MusicActivity extends AppCompatActivity {
    private int score = 0;
    Button song1button, song2button, song3button;
    MediaPlayer mediaPlayer;

    //Initializes variable for score, buttons to select song and the media player

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        song1button = (Button) findViewById(R.id.song1button);
        song2button = (Button) findViewById(R.id.song2button);
        song3button = (Button) findViewById(R.id.song3button);

        //Finds the buttons in the layout

        songsOnClick(); //Runs the songsOnClick method where you pick a song
    }
    public void songsOnClick(){ //Makes all buttons invisible when one is clicked and starts the song of the clicked button
        song1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song1button.setVisibility(View.GONE);
                song2button.setVisibility(View.GONE);
                song3button.setVisibility(View.GONE);
                startGame(1);
            }
        });

        song2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song1button.setVisibility(View.GONE);
                song2button.setVisibility(View.GONE);
                song3button.setVisibility(View.GONE);
                startGame(2);
            }
        });

        song3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song1button.setVisibility(View.GONE);
                song2button.setVisibility(View.GONE);
                song3button.setVisibility(View.GONE);
                startGame(3);
            }
        });
    }
    public void startGame(int song) { //Creates a mediaplayer of the song, playing back all of its notes through an array and a time delay handler
        if (song == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.starspangledbanner);
            mediaPlayer.start();
            int arr[] = {1446, 1968, 2153, 2885, 3596, 4303, 5035, 5746, 6269, 6453, 7185, 7896, 8603, 10047, 10570, 10754, 11486, 11842, 12197, 12904, 13636, 13992, 14347, 15054, 15786, 16498, 17205, 17937, 18648, 18999, 19355, 20087, 20798, 21505, 22237, 22949, 23299, 23655, 24388, 25099, 25806, 26538, 27249, 27600, 27956, 29045, 29399, 30106, 31195, 31550, 32257, 32989, 33700, 34407, 35850, 36557, 37289, 38001, 38708, 39440, 40151, 40858, 41590, 41946, 42301, 42652, 43008, 43740, 44451, 44802, 45158, 45891, 46247, 46602, 46952, 47309, 48041, 48752, 49103, 49459, 50191, 50547, 50902, 51609};
            for (int i : arr) {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        createNote();
                    }
                }, i);
            }
        }
        else if (song == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.takemeout);
            mediaPlayer.start();
            int arr[] = {1138, 1897, 2276, 2655, 3035, 3414, 4552, 5691, 6449, 6829, 7208, 7588, 7967, 9864, 10243, 10623, 11002, 11382, 11761, 12140, 12520, 13279, 13658, 14796, 15555, 15934, 16314, 16693, 17073, 17452, 17831, 18211, 18590, 18970, 19349, 20108, 20487, 20867, 21246, 21625, 22764, 23902, 24661, 25040, 25419, 25799, 26178, 27696, 28075, 28455, 29593, 30731, 31110, 31490, 31869, 32249, 32628, 33007, 34146, 35284, 35663, 36043, 36422, 36801, 37181, 37560, 38698};
            for (int i : arr) {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        createNote();
                    }
                }, i);
            }
        }
        else if (song == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.furelise);
            mediaPlayer.start();
            int arr[] = {1001, 1252, 1502, 1753, 2003, 2253, 2504, 2754, 3005, 3756, 4006, 4257, 4507, 5259, 5509, 5759, 6010, 6761, 7012, 7262, 7512, 7763, 8013, 8264, 8514, 8765, 9015, 9766, 10017, 10267, 10518, 11269, 11519, 11770, 12020, 13022, 13272, 13523, 13773, 14024, 14274, 14525, 14775, 15025, 15777, 16027, 16278, 16528, 17279, 17530, 17780, 18031, 18782, 19032, 19283, 19533, 19784, 20034, 20285, 20535, 20785, 21036, 21787, 22038, 22288, 22538, 23290, 23540, 23791, 24041, 24792, 25043, 25293, 25544, 26295, 26545, 26796, 27046, 27797, 28048, 28298, 28549, 29300, 29551, 29801, 30051, 30803, 31053, 31804, 32055, 32806, 33057, 33808, 34058, 34309, 34559, 34810, 35060, 35310, 35561, 35811, 36062, 36813, 37063, 37314, 37564, 38316, 38566, 38816, 39067, 39818, 40069, 40319, 40570, 40820, 41070, 41321, 41571, 41822, 42072, 42823, 43074, 43324, 43575, 44326, 44576, 44827, 45077, 45829, 46079, 46329, 46580, 47331, 47582, 47832, 48082, 48834, 49084, 49335, 49585, 50336, 50587, 50837, 51088, 51839, 52089, 52841, 53091, 53842, 54093, 54844, 55095, 55345, 55595, 55846, 56096, 56347, 56597, 56848, 57098, 57849, 58100, 58350, 58601, 59352, 59602, 59853, 60103, 60855, 61105, 61355, 61606, 61856, 62107, 62357, 62608, 62858, 63108, 63860, 64110, 64361, 64611, 65362, 65613, 65863, 66114, 66865, 67115, 67366, 67574, 67616, 68618, 68994, 69119, 69620, 70121, 70496, 70621, 70872, 71122, 71373, 71623, 71874, 72124, 72625, 73042, 73126, 73251, 73376, 73501, 73627, 74628, 74879, 75129, 75880, 76131, 76381, 76632, 77383, 77467, 77508, 77550, 77633, 78009, 78134, 78260, 78385, 78510, 78635, 78760, 78886, 79011, 79136, 79261, 79387, 79512, 79637, 79762, 79887, 80013, 80138, 80263, 80388, 80513, 80639, 80764, 80889, 81014, 81140, 81265, 81390, 81515, 81640, 81766, 81891, 82016, 82141, 82266, 82392, 82517, 82642, 82767, 82893, 83018, 83143, 83268, 83393, 83519, 83644, 83769, 83894, 84020, 84145, 84270, 84395, 84520, 84646, 84771, 84896, 85021, 85146, 85272, 85397, 85522, 85647, 86399, 86649, 86899, 87150, 87901, 88152, 88903, 89153, 89905, 90155, 90406, 90656, 90906, 91157, 91407, 91658, 92409, 92659, 92910, 93160, 93912, 94162, 94412, 94663, 95414, 95665, 95915, 96165, 96416, 96666, 96917, 97167, 97418, 97668, 98419, 98670, 98920, 99171, 99922, 100172, 100423, 100673, 101425, 101675, 101925, 102176, 102927, 103178, 103428, 103678, 104430, 104680, 104931, 105181, 105932, 106183, 106433, 106684, 107435, 107685, 108437, 108687, 109438, 109689, 110440, 110691, 110941, 111191, 111442, 111692, 111943, 112193, 112444, 112694, 113445, 113696, 113946, 114197, 114948, 115198, 115449, 115699, 116450, 116701, 116951, 117202, 117452, 117703, 117953, 118204, 118454, 118704, 119456, 119706, 119957, 120207, 120958, 121209, 121459, 121710, 123212, 124715, 125716, 125967, 126217, 127219, 127720, 129223, 130224, 130475, 130725, 131727, 132228, 132729, 133229, 133730, 135233, 136736, 137737, 137988, 138238, 139240, 139741, 141243, 142245, 142495, 142746, 143748, 144248, 145250, 145751, 147254, 148756, 148923, 149090, 149257, 149424, 149591, 149758, 149925, 150092, 150259, 150426, 150593, 150760, 150927, 151094, 151261, 151428, 151594, 151761, 151928, 152095, 152262, 152429, 152596, 152763, 152930, 153097, 153264, 153431, 153598, 153765, 153932, 154099, 154266, 154433, 154600, 154767, 154934, 155101, 155267, 155434, 155601, 155768, 155935, 156102, 156269, 156520, 156770, 157021, 157271, 157521, 157772, 158523, 158774, 159024, 159274, 160026, 160276, 160527, 160777, 161528, 161779, 162029, 162280, 162530, 162780, 163031, 163281, 163532, 163782, 164533, 164784, 165034, 165285, 166036, 166287, 166537, 166787, 167539, 167789, 168040, 168290, 169041, 169292, 169542, 169793, 170544, 170794, 171045, 171295, 172046, 172297, 172547, 172798, 173549, 173799, 174551, 174801, 175552, 175803, 176554, 176805, 177055, 177306, 177556, 177806, 178057, 178307, 178558, 178808, 179559, 179810, 180060, 180311, 181062, 181312, 181563, 181813, 182565, 182815, 183065, 183316, 183566, 183817, 184067, 184318, 184568, 184818, 185570, 185820, 186071, 186321, 187072, 187323, 187573, 187824};
            for (int i : arr) {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        createNote();
                    }
                }, i);
            }
        }



    }
    public void createNote(){ //Creates a button for the user to tap in tempo
        final Button note = new Button(this);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics); //Gets the window parameters
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(metrics.widthPixels/3, metrics.widthPixels/3); //Sets the button size responsively
        params.topMargin = new Random().nextInt(metrics.heightPixels - metrics.widthPixels/3); //Sets the margin to a random range
        params.leftMargin = new Random().nextInt(metrics.widthPixels - metrics.widthPixels/3); //Sets the margin to a random range
        note.setText("♫");
        note.setTextSize(metrics.widthPixels/3 * .2F);
        int colorFrom = 0xaaaaaaaa;
        int colorTo = 0xffFF0000;
        int duration = 2000;
        ObjectAnimator anim = ObjectAnimator.ofObject(note, "backgroundColor", new ArgbEvaluator(), colorFrom, colorTo);
        anim.setDuration(duration).start();


        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.game4);
        layout.addView(note, params); //Adds the button to the layout so it is now visible

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //When clicked, increment score and remove the button from the layout, thus it is now invisible
                ViewGroup parentView = (ViewGroup) view.getParent();
                parentView.removeView(view);
                score++;
                TextView scoreText = (TextView) findViewById(R.id.scoreText);
                scoreText.setText("Score: " + score); //Display the new score

            }
        });
        final Handler noteHandlerB = new Handler();
        noteHandlerB.postDelayed(new Runnable() {
            @Override
            public void run() {
                note.setVisibility(View.GONE);
            }
        }, 2000); //The note disappears as time has run out


    }
    public void finishGame(int score){ //Will pass score to a score activity

    }
    @Override
    public void onBackPressed() { //Stops the song when returning to a previous activity
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        super.onBackPressed();
    }

}
