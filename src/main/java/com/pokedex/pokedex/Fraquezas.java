package com.pokedex.pokedex;

import java.util.ArrayList;

public abstract class Fraquezas implements ConfFraquezas{

    ArrayList<String> fraquezes = new ArrayList<>();

    public ArrayList fraco(String tipo1) {
        fraquezes.clear();
        switch (tipo1) {
            case "Grass" -> {
                fraquezes.add("Flying");
                fraquezes.add("Ice");
                fraquezes.add("Bug");
                fraquezes.add("Poison");
            }
            case "Steel" -> {
                fraquezes.add("Fire");
                fraquezes.add("Ground");
                fraquezes.add("Fighting");
            }
            case "Water" -> {
                fraquezes.add("Electric");
                fraquezes.add("Grass");
            }
            case "Dragon" -> {
                fraquezes.add("Dragon");
                fraquezes.add("Fairy");
                fraquezes.add("Ice");
            }
            case "Electric" -> fraquezes.add("Ground");
            case "Fairy" -> {
                fraquezes.add("Steel");
                fraquezes.add("Poison");
            }
            case "Ghost" -> {
                fraquezes.add("Ghost");
                fraquezes.add("Dark");
            }
            case "Fire" -> {
                fraquezes.add("Water");
                fraquezes.add("Rock");
                fraquezes.add("Ground");
            }
            case "Ice" -> {
                fraquezes.add("Steel");
                fraquezes.add("Fire");
                fraquezes.add("Fighting");
                fraquezes.add("Rock");
            }
            case "Bug" -> {
                fraquezes.add("Fire");
                fraquezes.add("Rock");
                fraquezes.add("Flying");
            }
            case "Fighting" -> {
                fraquezes.add("Fairy");
                fraquezes.add("Psychic");
                fraquezes.add("Flying");
            }
            case "Normal" -> fraquezes.add("Fighting");
            case "Rock" -> {
                fraquezes.add("Steel");
                fraquezes.add("Water");
                fraquezes.add("Fighting");
                fraquezes.add("Grass");
                fraquezes.add("Ground");
            }
            case "Psychic" -> {
                fraquezes.add("Bug");
                fraquezes.add("Ghost");
                fraquezes.add("Dark");
            }
            case "Dark" -> {
                fraquezes.add("Fairy");
                fraquezes.add("Bug");
                fraquezes.add("Dark");
            }
            case "Ground" -> {
                fraquezes.add("Water");
                fraquezes.add("Ice");
                fraquezes.add("Grass");
            }
            case "Poison" -> {
                fraquezes.add("Psychic");
                fraquezes.add("Ground");
            }
            case "Flying" -> {
                fraquezes.add("Electric");
                fraquezes.add("Ice");
                fraquezes.add("Rock");
            }
        }
        return fraquezes;
    }

    public ArrayList fraco(String tipo1, String tipo2) {
        fraquezes.clear();
        switch (tipo1) {
            case "Steel" -> {
                switch (tipo2) {
                    case "Water" -> {
                        fraco("Steel");
                        fraco("Water");
                    }
                    case "Dragon" -> {
                        fraco("Steel");
                        fraco("Dragon");
                    }
                    case "Electric" -> {
                        fraco("Steel");
                        fraco("Electric");
                    }
                    case "Fairy" -> {
                        fraco("Steel");
                        fraco("Fairy");
                    }
                    case "Ghost" -> {
                        fraco("Steel");
                        fraco("Ghost");
                    }
                    case "Fire" -> {
                        fraco("Steel");
                        fraco("Fire");
                    }
                    case "Ice" -> {
                        fraco("Steel");
                        fraco("Ice");
                    }
                    case "Bug" -> {
                        fraco("Steel");
                        fraco("Bug");
                    }
                    case "Fighting" -> {
                        fraco("Steel");
                        fraco("Fighting");
                    }
                    case "Normal" -> {
                        fraco("Steel");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Steel");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Steel");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Steel");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Steel");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Steel");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Steel");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Steel");
                        fraco("Flying");
                    }
                }
            }
            case "Water" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Water");
                    }
                    case "Dragon" -> {
                        fraco("Water");
                        fraco("Dragon");
                    }
                    case "Electric" -> {
                        fraco("Water");
                        fraco("Electric");
                    }
                    case "Fairy" -> {
                        fraco("Water");
                        fraco("Fairy");
                    }
                    case "Ghost" -> {
                        fraco("Water");
                        fraco("Ghost");
                    }
                    case "Fire" -> {
                        fraco("Water");
                        fraco("Fire");
                    }
                    case "Ice" -> {
                        fraco("Water");
                        fraco("Ice");
                    }
                    case "Bug" -> {
                        fraco("Water");
                        fraco("Bug");
                    }
                    case "Fighting" -> {
                        fraco("Water");
                        fraco("Fighting");
                    }
                    case "Normal" -> {
                        fraco("Water");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Water");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Water");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Water");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Water");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Water");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Water");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Water");
                        fraco("Flying");
                    }
                }
            }
            case "Dragon" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Dragon");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Dragon");
                    }
                    case "Electric" -> {
                        fraco("Dragon");
                        fraco("Electric");
                    }
                    case "Fairy" -> {
                        fraco("Dragon");
                        fraco("Fairy");
                    }
                    case "Ghost" -> {
                        fraco("Dragon");
                        fraco("Ghost");
                    }
                    case "Fire" -> {
                        fraco("Dragon");
                        fraco("Fire");
                    }
                    case "Ice" -> {
                        fraco("Dragon");
                        fraco("Ice");
                    }
                    case "Bug" -> {
                        fraco("Dragon");
                        fraco("Bug");
                    }
                    case "Fighting" -> {
                        fraco("Dragon");
                        fraco("Fighting");
                    }
                    case "Normal" -> {
                        fraco("Dragon");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Dragon");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Dragon");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Dragon");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Dragon");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Dragon");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Dragon");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Dragon");
                        fraco("Flying");
                    }
                }
            }
            case "Electric" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Electric");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Electric");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Electric");
                    }
                    case "Fairy" -> {
                        fraco("Electric");
                        fraco("Fairy");
                    }
                    case "Ghost" -> {
                        fraco("Electric");
                        fraco("Ghost");
                    }
                    case "Fire" -> {
                        fraco("Electric");
                        fraco("Fire");
                    }
                    case "Ice" -> {
                        fraco("Electric");
                        fraco("Ice");
                    }
                    case "Bug" -> {
                        System.out.println("Fraquezas: ");
                        fraco("Electric");
                        fraco("Bug");
                    }
                    case "Fighting" -> {
                        fraco("Electric");
                        fraco("Fighting");
                    }
                    case "Normal" -> {
                        fraco("Electric");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Electric");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Electric");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Electric");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Electric");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Electric");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Electric");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Electric");
                        fraco("Flying");
                    }
                }
            }
            case "Fairy" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Fairy");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Fairy");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Fairy");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Fairy");
                    }
                    case "Ghost" -> {
                        fraco("Fairy");
                        fraco("Ghost");
                    }
                    case "Fire" -> {
                        fraco("Fairy");
                        fraco("Fire");
                    }
                    case "Ice" -> {
                        fraco("Fairy");
                        fraco("Ice");
                    }
                    case "Bug" -> {
                        fraco("Fairy");
                        fraco("Bug");
                    }
                    case "Fighting" -> {
                        fraco("Fairy");
                        fraco("Fighting");
                    }
                    case "Normal" -> {
                        fraco("Fairy");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Fairy");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Fairy");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Fairy");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Fairy");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Fairy");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Fairy");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Fairy");
                        fraco("Flying");
                    }
                }
            }
            case "Ghost" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Ghost");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Ghost");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Ghost");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Ghost");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Ghost");
                    }
                    case "Fire" -> {
                        fraco("Ghost");
                        fraco("Fire");
                    }
                    case "Ice" -> {
                        fraco("Ghost");
                        fraco("Ice");
                    }
                    case "Bug" -> {
                        fraco("Ghost");
                        fraco("Bug");
                    }
                    case "Fighting" -> {
                        fraco("Ghost");
                        fraco("Fighting");
                    }
                    case "Normal" -> {
                        fraco("Ghost");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Ghost");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Ghost");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Ghost");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Ghost");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Ghost");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Ghost");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Ghost");
                        fraco("Flying");
                    }
                }
            }
            case "Fire" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Fire");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Fire");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Fire");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Fire");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Fire");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Fire");
                    }
                    case "Ice" -> {
                        fraco("Fire");
                        fraco("Ice");
                    }
                    case "Bug" -> {
                        fraco("Fire");
                        fraco("Bug");
                    }
                    case "Fighting" -> {
                        fraco("Fire");
                        fraco("Fighting");
                    }
                    case "Normal" -> {
                        fraco("Fire");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Fire");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Fire");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Fire");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Fire");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Fire");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Fire");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Fire");
                        fraco("Flying");
                    }
                }
            }
            case "Ice" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Ice");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Ice");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Ice");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Ice");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Ice");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Ice");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Ice");
                    }
                    case "Bug" -> {
                        fraco("Ice");
                        fraco("Bug");
                    }
                    case "Fighting" -> {
                        fraco("Ice");
                        fraco("Fighting");
                    }
                    case "Normal" -> {
                        fraco("Ice");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Ice");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Ice");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Ice");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Ice");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Ice");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Ice");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Ice");
                        fraco("Flying");
                    }
                }
            }
            case "Bug" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Bug");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Bug");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Bug");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Bug");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Bug");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Bug");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Bug");
                    }
                    case "Ice" -> {
                        fraco("Ice");
                        fraco("Bug");
                    }
                    case "Fighting" -> {
                        fraco("Bug");
                        fraco("Fighting");
                    }
                    case "Normal" -> {
                        fraco("Bug");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Bug");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Bug");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Bug");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Bug");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Bug");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Bug");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Bug");
                        fraco("Flying");
                    }
                }
            }
            case "Fighting" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Fighting");
                    }
                    case "Water" -> {
                        System.out.println("Fraquezas:");
                        fraco("Water");
                        fraco("Fighting");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Fighting");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Fighting");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Fighting");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Fighting");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Fighting");
                    }
                    case "Ice" -> {
                        fraco("Ice");
                        fraco("Fighting");
                    }
                    case "Bug" -> {
                        System.out.println("Fraquezas: ");
                        fraco("Bug");
                        fraco("Fighting");
                    }
                    case "Normal" -> {
                        fraco("Fighting");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Fighting");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Fighting");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Fighting");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Fighting");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Fighting");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Fighting");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Fighting");
                        fraco("Flying");
                    }
                }
            }
            case "Normal" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Normal");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Normal");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Normal");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Normal");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Normal");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Normal");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Normal");
                    }
                    case "Ice" -> {
                        fraco("Ice");
                        fraco("Normal");
                    }
                    case "Bug" -> {
                        fraco("Bug");
                        fraco("Normal");
                    }
                    case "Fighting" -> {
                        fraco("Fighting");
                        fraco("Normal");
                    }
                    case "Rock" -> {
                        fraco("Normal");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Normal");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Normal");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Normal");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Normal");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Normal");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Normal");
                        fraco("Flying");
                    }
                }
            }
            case "Rock" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Rock");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Rock");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Rock");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Rock");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Rock");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Rock");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Rock");
                    }
                    case "Ice" -> {
                        fraco("Ice");
                        fraco("Rock");
                    }
                    case "Bug" -> {
                        fraco("Bug");
                        fraco("Rock");
                    }
                    case "Fighting" -> {
                        fraco("Fighting");
                        fraco("Rock");
                    }
                    case "Normal" -> {
                        fraco("Normal");
                        fraco("Rock");
                    }
                    case "Grass" -> {
                        fraco("Rock");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Rock");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Rock");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Rock");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Rock");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Rock");
                        fraco("Flying");
                    }
                }
            }
            case "Grass" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Grass");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Grass");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Grass");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Grass");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Grass");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Grass");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Grass");
                    }
                    case "Ice" -> {
                        fraco("Ice");
                        fraco("Grass");
                    }
                    case "Bug" -> {
                        fraco("Bug");
                        fraco("Grass");
                    }
                    case "Fighting" -> {
                        fraco("Fighting");
                        fraco("Grass");
                    }
                    case "Normal" -> {
                        fraco("Normal");
                        fraco("Grass");
                    }
                    case "Rock" -> {
                        fraco("Rock");
                        fraco("Grass");
                    }
                    case "Psychic" -> {
                        fraco("Grass");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Grass");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Grass");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Grass");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Grass");
                        fraco("Flying");
                    }
                }
            }
            case "Psychic" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Psychic");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Psychic");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Psychic");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Psychic");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Psychic");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Psychic");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Psychic");
                    }
                    case "Ice" -> {
                        fraco("Ice");
                        fraco("Psychic");
                    }
                    case "Bug" -> {
                        fraco("Bug");
                        fraco("Psychic");
                    }
                    case "Fighting" -> {
                        fraco("Fighting");
                        fraco("Psychic");
                    }
                    case "Normal" -> {
                        fraco("Normal");
                        fraco("Psychic");
                    }
                    case "Rock" -> {
                        fraco("Rock");
                        fraco("Psychic");
                    }
                    case "Grass" -> {
                        fraco("Grass");
                        fraco("Psychic");
                    }
                    case "Dark" -> {
                        fraco("Psychic");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Psychic");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Psychic");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Psychic");
                        fraco("Flying");
                    }
                }
            }
            case "Dark" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Dark");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Dark");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Dark");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Dark");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Dark");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Dark");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Dark");
                    }
                    case "Ice" -> {
                        fraco("Ice");
                        fraco("Dark");
                    }
                    case "Bug" -> {
                        fraco("Bug");
                        fraco("Dark");
                    }
                    case "Fighting" -> {
                        fraco("Fighting");
                        fraco("Dark");
                    }
                    case "Normal" -> {
                        fraco("Normal");
                        fraco("Dark");
                    }
                    case "Rock" -> {
                        fraco("Rock");
                        fraco("Dark");
                    }
                    case "Grass" -> {
                        fraco("Grass");
                        fraco("Dark");
                    }
                    case "Psychic" -> {
                        fraco("Psychic");
                        fraco("Dark");
                    }
                    case "Ground" -> {
                        fraco("Dark");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Dark");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Dark");
                        fraco("Flying");
                    }
                }
            }
            case "Ground" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Ground");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Ground");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Ground");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Ground");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Ground");
                    }
                    case "Ghost" -> {
                        fraco("Fire");
                        fraco("Ghost");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Ground");
                    }
                    case "Ice" -> {
                        fraco("Ice");
                        fraco("Ground");
                    }
                    case "Bug" -> {
                        fraco("Bug");
                        fraco("Ground");
                    }
                    case "Fighting" -> {
                        fraco("Fighting");
                        fraco("Ground");
                    }
                    case "Normal" -> {
                        fraco("Normal");
                        fraco("Ground");
                    }
                    case "Rock" -> {
                        fraco("Rock");
                        fraco("Ground");
                    }
                    case "Grass" -> {
                        fraco("Grass");
                        fraco("Ground");
                    }
                    case "Psychic" -> {
                        fraco("Psychic");
                        fraco("Ground");
                    }
                    case "Dark" -> {
                        fraco("Dark");
                        fraco("Ground");
                    }
                    case "Poison" -> {
                        fraco("Ground");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Ground");
                        fraco("Flying");
                    }
                }
            }
            case "Poison" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Poison");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Poison");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Poison");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Poison");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Poison");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Poison");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Poison");
                    }
                    case "Ice" -> {
                        fraco("Ice");
                        fraco("Poison");
                    }
                    case "Bug" -> {
                        fraco("Bug");
                        fraco("Poison");
                    }
                    case "Fighting" -> {
                        fraco("Fighting");
                        fraco("Poison");
                    }
                    case "Normal" -> {
                        fraco("Normal");
                        fraco("Poison");
                    }
                    case "Rock" -> {
                        fraco("Rock");
                        fraco("Poison");
                    }
                    case "Grass" -> {
                        fraco("Grass");
                        fraco("Poison");
                    }
                    case "Psychic" -> {
                        fraco("Psychic");
                        fraco("Poison");
                    }
                    case "Dark" -> {
                        fraco("Dark");
                        fraco("Poison");
                    }
                    case "Ground" -> {
                        fraco("Ground");
                        fraco("Poison");
                    }
                    case "Flying" -> {
                        fraco("Poison");
                        fraco("Flying");
                    }
                }
            }
            case "Flying" -> {
                switch (tipo2) {
                    case "Steel" -> {
                        fraco("Steel");
                        fraco("Flying");
                    }
                    case "Water" -> {
                        fraco("Water");
                        fraco("Flying");
                    }
                    case "Dragon" -> {
                        fraco("Dragon");
                        fraco("Flying");
                    }
                    case "Electric" -> {
                        fraco("Electric");
                        fraco("Flying");
                    }
                    case "Fairy" -> {
                        fraco("Fairy");
                        fraco("Flying");
                    }
                    case "Ghost" -> {
                        fraco("Ghost");
                        fraco("Flying");
                    }
                    case "Fire" -> {
                        fraco("Fire");
                        fraco("Flying");
                    }
                    case "Ice" -> {
                        fraco("Ice");
                        fraco("Flying");
                    }
                    case "Bug" -> {
                        fraco("Bug");
                        fraco("Flying");
                    }
                    case "Fighting" -> {
                        fraco("Fighting");
                        fraco("Flying");
                    }
                    case "Normal" -> {
                        fraco("Normal");
                        fraco("Flying");
                    }
                    case "Rock" -> {
                        fraco("Rock");
                        fraco("Flying");
                    }
                    case "Grass" -> {
                        fraco("Grass");
                        fraco("Flying");
                    }
                    case "Psychic" -> {
                        fraco("Psychic");
                        fraco("Flying");
                    }
                    case "Dark" -> {
                        fraco("Dark");
                        fraco("Flying");
                    }
                    case "Ground" -> {
                        fraco("Ground");
                        fraco("Flying");
                    }
                    case "Poison" -> {
                        fraco("Poison");
                        fraco("Flying");
                    }
                }
            }
        }
        return fraquezes;
    }
}