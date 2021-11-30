package ru.myitschool.lesson20211123;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import ru.myitschool.lesson20211123.Animal.Animal;
import ru.myitschool.lesson20211123.Animal.Bird;
import ru.myitschool.lesson20211123.Animal.Dog;
import ru.myitschool.lesson20211123.Animal.Fish;
import ru.myitschool.lesson20211123.Animal.Life;

public class TwoActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnclick;
    EditText editText;
    TextView tv;
    Point point;
    Point3D point3D, point3D2;
    Point4D point4D;
    int count = 0;
    //Animal[] animals = new Animal[10];
    ArrayList<Animal> animalArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        btnclick = findViewById(R.id.btnclick);
        editText = findViewById(R.id.edittext);
        tv = findViewById(R.id.tv);
        tv.setText("");
        btnclick.setOnClickListener(this);
        point = new Point(5, 10);
        point3D = new Point3D(1, -1, 5);
        /*for (int i = 0; i < animals.length; i++) {
            if (i % 2 == 0)
                animals[i] = new Bird();
            else
                animals[i] = new Fish();
        }*/


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnclick: {
                String name = editText.getText().toString();
                if (name.isEmpty()) {
                    Toast.makeText(getApplicationContext(),
                            "Введена пустая строка", Toast.LENGTH_SHORT).show();
                }
                if (count % 3 == 0) {
                    animalArrayList.add(new Bird(name));
                } else if (count % 3 == 1) {
                    animalArrayList.add(new Fish(name));
                } else {
                    animalArrayList.add(new Dog(name, (int) (Math.random() * 50)));
                }
                count++;
/*

                String name = editText.getText().toString();
                if (name.isEmpty()) {
                    Toast.makeText(getApplicationContext(),
                            "Введена пустая строка", Toast.LENGTH_SHORT).show();
                } else {
                    String[] names = name.split(" ");//Разбиение строки на массив строк, через разделитель пробел
                    if (names.length <= 4) {
                        point = new Point(
                                Float.parseFloat(names[0]),
                                Float.parseFloat(names[1]));
                        point3D = new Point3D(
                                Float.parseFloat(names[0]),
                                Float.parseFloat(names[1]),
                                Float.parseFloat(names[2]));
                        point4D = new Point4D(
                                Float.parseFloat(names[0]),
                                Float.parseFloat(names[1]),
                                Float.parseFloat(names[2]),
                                Float.parseFloat(names[3]));
                    }
                    tv.append("Hello, " + name + "\n point "
                            + point.PrintPoint() + "\nPoint3D "
                            + point3D.PrintPoint() + "\nPoint4D "
                            + point4D.PrintPoint() + "\n");
                    for (int i = 0; i < animals.length; i++) {
                        tv.append(animals[i].Say() + "\n");
                    }
*/
                tv.setText("");
                for (Animal a : animalArrayList) {
                    tv.append(a.voice() + "\n");
                }

                editText.setText("");
            }
        }
    }
}

