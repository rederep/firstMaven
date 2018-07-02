package model;

//LOMBOK!!!  ато билдер, гетер сетер и т.п.           прописем его в Maven и ставим плагин в Intellij

import lombok.*;

@Builder(toBuilder = true)   //чтобы менять данные в обьекте через билдер (toBuilder = true)
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor         //конструктор со всеми параметрами
@NoArgsConstructor          //конструктор пустой
public class User {
    private int id;
    private String userName;
    private String email;
    private String password;
}
