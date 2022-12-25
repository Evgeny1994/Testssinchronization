package instagram.downloader.com.testssinchronization;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import static android.widget.Toast.makeText;
public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    TextView textView1;
    EditText editText1;
    //1. Великая отечественная война началась?
    TextView textView2;
    RadioGroup rg1;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    //2. Первыми удар врага приняли:
    TextView textView3;
    RadioGroup rg2;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;
    //3. Назовите деревню, сожжённую в марте 1943 года фашистким карательным отрядом. Сейчас на этом месте мемориальный комплекс - символическое кладбище всех сожжённых деревень
    TextView textView4;
    RadioGroup rg3;
    RadioButton radioButton7;
    RadioButton radioButton8;
    RadioButton radioButton9;
    //4. Этот лётчик, родившийся в Беларуси, в одном из воздушных боёв в составе группы уничтожил 9 вражестких самолётовв. Имя герояя"/>
    TextView textView5;
    RadioGroup rg4;
    RadioButton radioButton10;
    RadioButton radioButton11;
    RadioButton radioButton12;
    //5. На железнодорожной станции Орша подпольщики организовали изготовление мин, которыми взрывали поезда захватчиков, принимая участие в 'рельсовой войне.' Кто стоял во главе этой подпольной организации?
    TextView textView6;
    RadioGroup rg5;
    RadioButton radioButton13;
    RadioButton radioButton14;
    RadioButton radioButton15;
    //6. На фронте эта девушка была санинструктором и спасла жизнь более чем ста солдатам и командироам. В одном из боёв она была тяжело ранена.
    TextView textView7;
    RadioGroup rg6;
    RadioButton radioButton16;
    RadioButton radioButton17;
    RadioButton radioButton18;
    //7. Этот белорусский детский писатель во время войны был призван в Военноморской флот и служил на Дальнем Востоке. Награждён орденами и медалями. Назовите его имя. "/>
    TextView textView8;
    RadioGroup rg7;
    RadioButton radioButton19;
    RadioButton radioButton20;
    RadioButton radioButton21;
    //8. 11 мая 1944, когда то освобождения родной земли оставалось почти два месяца, этот юный герой возвращался из разведки. Встретился со связным, но вдруг налетели
    //каратели. Когда закончились патроны, бросил гранату. Фашисты всё плотней окружали юного партизана. Он выхватил последнюю гранату. Грянул взрыв. Погибло много врагов. Юный разведчик
    //геройски погиб. В одном из парков Минска стоит бронзовый памятник этому пионеру-герою. Нвзовите его имя.
    TextView textView9;
    RadioGroup rg8;
    RadioButton radioButton22;
    RadioButton radioButton23;
    RadioButton radioButton24;
    //9. В этих местах в июле 1944 года во время операции 'Багратион' в окружение попала 105-тысячная группировка гитлеровских войск. Разгром немецких войск
    //получил название 'Минский костёл' и стал решающим шагом на пути к освобождению Беларуси. После войны здесь был сооружён:
    TextView textView10;
    RadioGroup rg9;
    RadioButton radioButton25;
    RadioButton radioButton26;
    RadioButton radioButton27;
    //10. День освобождения Беларуси от немецко-фашистких захватчиков
    TextView textView11;
    RadioGroup rg10;
    RadioButton radioButton28;
    RadioButton radioButton29;
    RadioButton radioButton30;

    Button button;
    int ll = 0;
    int q = 0; //количество правильных вопросов.
    int w = 0; //количество неправильных вопросов.
    TextView textView14;
    TextView textView15;
    TextView textView16;
    TextView textView17;
    TextView textView18;
    TextView textView19;
    TextView textView20;
    TextView textView21;
    TextView textView22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Фамилия и Имя и отчество
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        textView1 = findViewById(R.id.textView1);
        editText1 = findViewById(R.id.editText1);
        //1. Великая отечественная война началась?
        textView2 = findViewById(R.id.textView2);
        rg1 = findViewById(R.id.rg1);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        //2. Первыми удар врага приняли:
        textView3 = findViewById(R.id.textView3);
        rg2 = findViewById(R.id.rg2);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);
        radioButton6 = findViewById(R.id.radioButton6);
        // 3. Назовите деревню, сожжённую в марте 1943 года фашистким карательным отрядом. Сейчас на этом месте мемориальный комплекс - символическое кладбище всех сожжённых деревень
        textView4 = findViewById(R.id.textView4);
        rg3 = findViewById(R.id.rg3);
        radioButton7 = findViewById(R.id.radioButton7);
        radioButton8 = findViewById(R.id.radioButton8);
        radioButton9 = findViewById(R.id.radioButton9);
        //4. Этот лётчик, родившийся в Беларуси, в одном из воздушных боёв в составе группы уничтожил 9 вражестких самолётовв. Имя герояя"/>
        textView5 = findViewById(R.id.textView5);
        rg4 = findViewById(R.id.rg4);
        radioButton10 = findViewById(R.id.radioButton10);
        radioButton11 = findViewById(R.id.radioButton11);
        radioButton12 = findViewById(R.id.radioButton12);
        //5. На железнодорожной станции Орша подпольщики организовали изготовление мин, которыми взрывали поезда захватчиков, принимая участие в 'рельсовой войне.' Кто стоял во главе этой подпольной организации?
        textView6 = findViewById(R.id.textView6);
        rg5 = findViewById(R.id.rg5);
        radioButton13 = findViewById(R.id.radioButton13);
        radioButton14 = findViewById(R.id.radioButton14);
        radioButton15 = findViewById(R.id.radioButton15);
        //6. На фронте эта девушка была санинструктором и спасла жизнь более чем ста солдатам и командироам. В одном из боёв она была тяжело ранена.
        textView7 = findViewById(R.id.textView7);
        rg6 = findViewById(R.id.rg6);
        radioButton16 = findViewById(R.id.radioButton16);
        radioButton17 = findViewById(R.id.radioButton17);
        radioButton18 = findViewById(R.id.radioButton18);
        //7. Этот белорусский детский писатель во время войны был призван в Военноморской флот и служил на Дальнем Востоке. Награждён орденами и медалями. Назовите его имя. "/>
        textView8 = findViewById(R.id.textView8);
        rg7 = findViewById(R.id.rg7);
        radioButton19 = findViewById(R.id.radioButton19);
        radioButton20 = findViewById(R.id.radioButton20);
        radioButton21 = findViewById(R.id.radioButton21);
        //8. 11 мая 1944, когда то освобождения родной земли оставалось почти два месяца, этот юный герой возвращался из разведки. Встретился со связным, но вдруг налетели
        // каратели. Когда закончились патроны, бросил гранату. Фашисты всё плотней окружали юного партизана. Он выхватил последнюю гранату. Грянул взрыв. Погибло много врагов. Юный разведчик
        // геройски погиб. В одном из парков Минска стоит бронзовый памятник этому пионеру-герою. Нвзовите его имя.
        textView9 = findViewById(R.id.textView9);
        rg8 = findViewById(R.id.rg8);
        radioButton22 = findViewById(R.id.radioButton22);
        radioButton23 = findViewById(R.id.radioButton23);
        radioButton24 = findViewById(R.id.radioButton24);
        //9. В этих местах в июле 1944 года во время операции 'Багратион' в окружение попала 105-тысячная группировка гитлеровских войск. Разгром немецких войск
        //получил название 'Минский костёл' и стал решающим шагом на пути к освобождению Беларуси. После войны здесь был сооружён:
        textView10 = findViewById(R.id.textView10);
        rg9 = findViewById(R.id.rg9);
        radioButton25 = findViewById(R.id.radioButton25);
        radioButton26 = findViewById(R.id.radioButton26);
        radioButton27 = findViewById(R.id.radioButton27);
        //10. День освобождения Беларуси от немецко-фашистких захватчиков
        textView11 = findViewById(R.id.textView11);
        rg10 = findViewById(R.id.rg10);
        radioButton28 = findViewById(R.id.radioButton28);
        radioButton29 = findViewById(R.id.radioButton29);
        radioButton30 = findViewById(R.id.radioButton30);

        button = findViewById(R.id.button);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);
        textView21 = findViewById(R.id.textView21);
        textView22 = findViewById(R.id.textView22);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editText.length() < 25) {
                    System.out.print("переменная =");

                } else {
                    Toast toast = makeText(getApplicationContext(), "Превышение колиество ввода символов", Toast.LENGTH_LONG);
                    toast.show();
                    editText.setEnabled(false);
                }

            }
        });
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editText1.length() < 6) {
                    System.out.print("Переменная =");

                } else {
                    Toast toast = makeText(getApplicationContext(), "Превышение количество символов", Toast.LENGTH_LONG);
                    toast.show();
                    editText1.setEnabled(false);
                }

            }
        });
        //   button.setOnClickListener(new View.OnClickListener() {
        ///        @Override
        //       public void onClick(View view) {
        //1. Великая отечественная война началась?
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton1:
                        q = q + 1;
                        //                          radioButton1.setTextColor(getResources().getColor(R.color.colorPrimary));
                        break;
                    case R.id.radioButton2:
                        w = w + 1;
                        break;
                    case R.id.radioButton3:
                        w = w + 1;
                        break;
                    default:
                        break;

                }
            }
        });
        //2. Первыми удар врага приняли:
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton4:
                        q = q + 1;
                        break;
                    case R.id.radioButton5:
                        w = w + 1;
                        break;
                    case R.id.radioButton6:
                        w = w + 1;
                        break;
                    default:
                        break;
                }
            }
        });
        // 3. Назовите деревню, сожжённую в марте 1943 года фашистким карательным отрядом. Сейчас на этом месте мемориальный комплекс - символическое кладбище всех сожжённых деревень
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton7:
                        q = q + 1;
                        break;
                    case R.id.radioButton8:
                        w = w + 1;
                        break;
                    case R.id.radioButton9:
                        w = w + 1;
                        break;
                    default:
                        break;
                }
            }
        });
        //4. Этот лётчик, родившийся в Беларуси, в одном из воздушных боёв в составе группы уничтожил 9 вражестких самолётовв. Имя герояя"/>
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton10:
                        w = w + 1;
                        break;
                    case R.id.radioButton11:
                        q = q + 1;
                        break;
                    case R.id.radioButton12:
                        w = w + 1;
                        break;
                    default:
                        break;
                }
            }
        });
        //5. На железнодорожной станции Орша подпольщики организовали изготовление мин, которыми взрывали поезда захватчиков, принимая участие в 'рельсовой войне.' Кто стоял во главе этой подпольной организации?
        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton13:
                        q = q + 1;
                        break;
                    case R.id.radioButton14:
                        w = w + 1;
                        break;
                    case R.id.radioButton15:
                        w = w + 1;
                        break;
                }
            }
        });
        //6. На фронте эта девушка была санинструктором и спасла жизнь более чем ста солдатам и командироам. В одном из боёв она была тяжело ранена.
        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton16:
                        w = w + 1;
                        break;
                    case R.id.radioButton17:
                        q = q + 1;
                        break;
                    case R.id.radioButton18:
                        w = w + 1;
                        break;
                    default:
                        break;
                }
            }
        });
        //7. Этот белорусский детский писатель во время войны был призван в Военноморской флот и служил на Дальнем Востоке. Награждён орденами и
        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton19:
                        w = w + 1;
                        break;
                    case R.id.radioButton20:
                        w = w + 1;
                        break;
                    case R.id.radioButton21:
                        q = q + 1;
                        break;
                    default:
                        break;
                }
            }
        });
        //8. 11 мая 1944, когда то освобождения родной земли оставалось почти два месяца, этот юный герой возвращался из ра
        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton22:
                        w = w + 1;
                        break;
                    case R.id.radioButton23:
                        q = q + 1;
                        break;
                    case R.id.radioButton24:
                        w = w + 1;
                        break;
                    default:
                        break;
                }
            }
        });
        //9. В этих местах в июле 1944 года во время операции 'Багратион' в окружение попала 105-тысячная группировка гитлеро
        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton25:
                        w = w + 1;
                        break;
                    case R.id.radioButton26:
                        w = w + 1;
                        break;
                    case R.id.radioButton27:
                        q = q + 1;
                        break;
                    default:
                        break;
                }
            }
        });
        //10. День освобождения Беларуси от немецко-фашистких захватчиков
        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case -1:
                        break;
                    case R.id.radioButton28:
                        w = w + 1;
                        break;
                    case R.id.radioButton29:
                        w = w + 1;
                        break;
                    case R.id.radioButton30:
                        q = q + 1;
                        break;
                    default:
                        break;
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Подстветка верная если пользователь пропустил вариант ответа ему должно прийти на E-mail уведомление что он не ответил на этот вопрос
                //КОД ПОДСТВЕТКИ
                String email = "super-bzyk@yandex.ru";
                //"promajer1@gmail.com";
                String d = "результаты патриотикого анкетирования";
                ArrayList<String> su = new ArrayList<>();
                String S1 = editText.getText().toString();

                textView16.setText(S1);
                String S2 = editText1.getText().toString();

                textView18.setText(S2);
                textView20.setText(String.valueOf(q));
                int S3 = q * 50 / 100;
//                textView22.setText(String.valueOf(S3));

                String S10 = textView14.getText().toString();
                String S11 = textView15.getText().toString();
                String S12 = textView16.getText().toString();
                String S13 = textView17.getText().toString();
                String S14 = textView18.getText().toString();
                String S15 = textView19.getText().toString();
                String S16 = textView20.getText().toString();
//                String S17 = textView21.getText().toString();
//                String S18 = textView22.getText().toString();

                //  String email = "kavrus74@bk.ru";
                //   String d = "результаты патриотикого анкетирования";
                //    ArrayList<String> su = new ArrayList<>();
                su.add(S10);
                su.add("\n");
                su.add(S11);
                su.add("\n");
                su.add(S12);
                su.add("\n");
                su.add(S13);
                su.add("\n");
                su.add(S14);
                su.add("\n");
                su.add(S15);
                su.add("\n");
                su.add(S16);
                su.add("\n");
                //      su.add(S17);
                //       su.add("\n");
                //      su.add(S18);
                //        su.add("\n");


                String F1 = "данный ответ верен";
                String F2 = "данный ответ не верен";

                //#1
                String S19 = textView2.getText().toString();
                su.add(S19);
                su.add("\n");
                if (rg1.getCheckedRadioButtonId() == R.id.radioButton1) {
                    radioButton1.setTextColor(getResources().getColor(R.color.cyan));
                    String S20 = radioButton1.getText().toString();
                    su.add(S20);
                    su.add(F1);
                    su.add("\n");
                } else if (rg1.getCheckedRadioButtonId() == R.id.radioButton2) {
                    radioButton2.setTextColor(getResources().getColor(R.color.red));
                    String S21 = radioButton2.getText().toString();
                    su.add(S21);
                    su.add(F2);
                    su.add("\n");
                } else if (rg1.getCheckedRadioButtonId() == R.id.radioButton3) {
                    radioButton3.setTextColor(getResources().getColor(R.color.red));
                    String S22 = radioButton3.getText().toString();
                    su.add(S22);
                    su.add(F2);
                    su.add("\n");
                } else {
                    String S22 = "Пользователь на данный вопрос не ответил";
                    su.add(S22);
                    su.add("\n");
                }
                //#2
                String S23 = textView3.getText().toString();
                su.add(S23);
                su.add("\n");
                if (rg2.getCheckedRadioButtonId() == R.id.radioButton4) {
                    radioButton4.setTextColor(getResources().getColor(R.color.cyan));
                    String S24 = radioButton4.getText().toString();
                    su.add(S24);
                    su.add(F1);
                    su.add("\n");
                } else if (rg2.getCheckedRadioButtonId() == R.id.radioButton5) {
                    radioButton5.setTextColor(getResources().getColor(R.color.red));
                    String S25 = radioButton5.getText().toString();
                    su.add(S25);
                    su.add(F2);
                    su.add("\n");

                } else if (rg2.getCheckedRadioButtonId() == R.id.radioButton6) {
                    radioButton6.setTextColor(getResources().getColor(R.color.red));
                    String S26 = radioButton6.getText().toString();
                    su.add(S26);
                    su.add(F2);
                    su.add("\n");
                } else {
                    String S27 = "Пользователь на данный вопрос не ответил";
                    su.add(S27);
                    su.add("\n");
                }
                //#3
                String S28 = textView4.getText().toString();
                su.add(S28);
                su.add("\n");
                if (rg3.getCheckedRadioButtonId() == R.id.radioButton7) {
                    radioButton7.setTextColor(getResources().getColor(R.color.cyan));
                    String S29 = radioButton7.getText().toString();
                    su.add(S29);
                    su.add(F1);
                    su.add("\n");

                } else if (rg3.getCheckedRadioButtonId() == R.id.radioButton8) {
                    radioButton8.setTextColor(getResources().getColor(R.color.red));
                    String S30 = radioButton8.getText().toString();
                    su.add(S30);
                    su.add(F2);
                    su.add("\n");
                } else if (rg3.getCheckedRadioButtonId() == R.id.radioButton9) {
                    radioButton9.setTextColor(getResources().getColor(R.color.red));
                    String S31 = radioButton9.getText().toString();
                    su.add(S31);
                    su.add(F2);
                    su.add("\n");
                } else {
                    String S32 = "Пользователь на данный вопрос не ответил";
                    su.add(S32);
                    su.add("\n");
                }
                //#4

                String S33 = textView5.getText().toString();
                su.add(S33);
                su.add("\n");
                if (rg4.getCheckedRadioButtonId() == R.id.radioButton10) {
                    radioButton10.setTextColor(getResources().getColor(R.color.red));
                    String S34 = radioButton10.getText().toString();
                    su.add(S34);
                    su.add(F2);
                    su.add("\n");
                } else if (rg4.getCheckedRadioButtonId() == R.id.radioButton11) {
                    radioButton11.setTextColor(getResources().getColor(R.color.cyan));
                    String S35 = radioButton11.getText().toString();
                    su.add(S35);
                    su.add(F1);
                    su.add("\n");
                } else if (rg4.getCheckedRadioButtonId() == R.id.radioButton12) {
                    radioButton12.setTextColor(getResources().getColor(R.color.red));
                    String S36 = radioButton12.getText().toString();
                    su.add(S36);
                    su.add(F2);
                    su.add("\n");
                } else {
                    String S37 = "Пользователь на данный вопрос не ответил";
                    su.add(S37);
                }
                //#5
                String S38 = textView6.getText().toString();
                su.add(S38);
                su.add("\n");
                if (rg5.getCheckedRadioButtonId() == R.id.radioButton13) {
                    radioButton13.setTextColor(getResources().getColor(R.color.cyan));
                    String S39 = radioButton13.getText().toString();
                    su.add(S39);
                    su.add(F1);
                    su.add("\n");
                } else if (rg5.getCheckedRadioButtonId() == R.id.radioButton14) {
                    radioButton14.setTextColor(getResources().getColor(R.color.red));
                    String S40 = radioButton14.getText().toString();
                    su.add(S40);
                    su.add(F2);
                    su.add("\n");
                } else if (rg5.getCheckedRadioButtonId() == R.id.radioButton15) {
                    radioButton15.setTextColor(getResources().getColor(R.color.red));
                    String S41 = radioButton15.getText().toString();
                    su.add(S41);
                    su.add(F2);
                    su.add("\n");
                } else {
                    String S42 = "Пользователь на данный вопрос не ответил";
                    su.add(S42);
                    su.add("\n");
                }
                //#6
                String S43 = textView7.getText().toString();
                su.add(S43);
                su.add("\n");
                if (rg6.getCheckedRadioButtonId() == R.id.radioButton16) {
                    radioButton16.setTextColor(getResources().getColor(R.color.red));
                    String S44 = radioButton16.getText().toString();
                    su.add(S44);
                    su.add(F2);
                    su.add("\n");
                } else if (rg6.getCheckedRadioButtonId() == R.id.radioButton17) {
                    radioButton17.setTextColor(getResources().getColor(R.color.cyan));
                    String S45 = radioButton17.getText().toString();
                    su.add(S45);
                    su.add(F1);
                    su.add("\n");
                } else if (rg6.getCheckedRadioButtonId() == R.id.radioButton18) {
                    radioButton18.setTextColor(getResources().getColor(R.color.red));
                    String S46 = radioButton18.getText().toString();
                    su.add(S46);
                    su.add(F2);
                    su.add("\n");
                } else {
                    String S47 = "Пользователь на данный вопрос не ответил";
                    su.add(S47);
                    su.add("\n");
                }
                //#7
                String S48 = textView8.getText().toString();
                su.add(S48);
                su.add("\n");
                if (rg7.getCheckedRadioButtonId() == R.id.radioButton19) {
                    radioButton19.setTextColor(getResources().getColor(R.color.red));
                    String S49 = radioButton19.getText().toString();
                    su.add(S49);
                    su.add(F2);
                    su.add("\n");
                }
                if (rg7.getCheckedRadioButtonId() == R.id.radioButton20) {
                    radioButton20.setTextColor(getResources().getColor(R.color.red));
                    String S50 = radioButton20.getText().toString();
                    su.add(S50);
                    su.add(F2);
                    su.add("\n");
                }
                if (rg7.getCheckedRadioButtonId() == R.id.radioButton21) {
                    radioButton21.setTextColor(getResources().getColor(R.color.cyan));
                    String S51 = radioButton21.getText().toString();
                    su.add(S51);
                    su.add(F1);
                    su.add("\n");
                } else {
                    String S52 = "Пользователь на данный вопрос не ответил";
                    su.add(S52);
                    su.add("\n");
                }
                //#8
                String S53 = textView9.getText().toString();
                su.add(S53);
                su.add("\n");
                if (rg8.getCheckedRadioButtonId() == R.id.radioButton22) {
                    radioButton22.setTextColor(getResources().getColor(R.color.red));
                    String S54 = radioButton22.getText().toString();
                    su.add(S54);
                    su.add(F2);
                    su.add("\n");
                } else if (rg8.getCheckedRadioButtonId() == R.id.radioButton23) {
                    radioButton23.setTextColor(getResources().getColor(R.color.cyan));
                    String S55 = radioButton23.getText().toString();
                    su.add(S55);
                    su.add(F1);
                    su.add("\n");
                } else if (rg8.getCheckedRadioButtonId() == R.id.radioButton24) {
                    radioButton24.setTextColor(getResources().getColor(R.color.red));
                    String S56 = radioButton24.getText().toString();
                    su.add(S56);
                    su.add(F2);
                    su.add("\n");
                } else {
                    String S57 = "Пользователь на данный вопрос не ответил";
                    su.add(S57);
                    su.add("\n");

                }
                //#9
                String S58 = textView10.getText().toString();
                su.add(S58);
                su.add("\n");
                if (rg9.getCheckedRadioButtonId() == R.id.radioButton25) {
                    radioButton25.setTextColor(getResources().getColor(R.color.red));
                    String S59 = radioButton25.getText().toString();
                    su.add(S59);
                    su.add(F2);
                    su.add("\n");
                } else if (rg9.getCheckedRadioButtonId() == R.id.radioButton26) {
                    radioButton26.setTextColor(getResources().getColor(R.color.red));
                    String S60 = radioButton26.getText().toString();
                    su.add(S60);
                    su.add(F2);
                    su.add("\n");
                } else if (rg9.getCheckedRadioButtonId() == R.id.radioButton27) {
                    radioButton27.setTextColor(getResources().getColor(R.color.cyan));
                    String S61 = radioButton27.getText().toString();
                    su.add(S61);
                    su.add(F1);
                    su.add("\n");
                } else {
                    String S62 = "Пользователь на данный вопрос не ответил";
                    su.add(S62);
                    su.add("\n");

                }
                //#10
                String S62 = textView11.getText().toString();
                su.add(S62);
                su.add("\n");
                if (rg10.getCheckedRadioButtonId() == R.id.radioButton28) {
                    radioButton28.setTextColor(getResources().getColor(R.color.red));
                    String S63 = radioButton28.getText().toString();
                    su.add(S63);
                    su.add(F2);
                    su.add("\n");
                } else if (rg10.getCheckedRadioButtonId() == R.id.radioButton29) {
                    radioButton29.setTextColor(getResources().getColor(R.color.red));
                    String S64 = radioButton29.getText().toString();
                    su.add(S64);
                    su.add(F2);
                    su.add("\n");
                } else if (rg10.getCheckedRadioButtonId() == R.id.radioButton30) {
                    radioButton30.setTextColor(getResources().getColor(R.color.cyan));
                    String S65 = radioButton30.getText().toString();
                    su.add(S65);
                    su.add(F1);
                    su.add("\n");
                } else {
                    String S66 = "Пользователь на данный вопрос не ответил";
                    su.add(S66);
                    su.add("\n");

                }
                SendMail sm = new SendMail(MainActivity.this, email, d, su);
                sm.execute();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action:
                //new MyTask1().execute();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
