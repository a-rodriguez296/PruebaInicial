package com.example.alejandrorodriguez.pruebainicial;

import java.io.Serializable;
import lombok.*;


/**
 * Created by alejandrorodriguez on 3/3/15.
 */
public class Model  implements Serializable{


    private static final long serialVersionUID = 1L;

    private String name;

    public Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
