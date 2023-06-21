package HWLesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Pet {
        private String species;
        private String type;
        private String nickname;
        private int age;
        private int trickLevel;

        public Pet() {
        }

        public String getNickname() {
                return nickname;
        }
        public void setNickname(String nickname) {this.nickname = nickname;}

        public String getType() {return type;}

        public void setType(String type) {this.type = type;}

        public int getAge() {return age;}

        public void setAge(int age) {this.age = age;}

        public int getTrickLevel() {return trickLevel;}

        public void setTrickLevel(int trickLevel) {this.trickLevel = trickLevel;}

        String[] array = {"to run", "to jump", "to swimm"};

        void eat (){
                System.out.println("Я ї'м!");}
        void respond (){
                System.out.println("Привіт, хазяїн. Я - " + (nickname) + ". Я скучив!");}
        void foul(){
                System.out.println("Потрібно добре замести сліди...");}

        public Pet(String type, String nickname) {
                this.type = type;
                this.nickname = nickname;
        }


}

