package com.example.ejercicio7mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.ejercicio7mvp.databinding.ActivityMainBinding;

  public class MainActivity extends AppCompatActivity implements VistaPresentador {
  private Presentador presentando;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       presentando= new Presentador (this);
      binding.editTextPass.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        presentando.evaluarContrasena(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
      });
    }

      @Override
      public void mostrarDebil() {

      }

      @Override
      public void mostrarMedia() {

      }

      @Override
      public void mostrarFuerte() {

      }

      @Override
      public void mostrarError() {

      }
  }