package com.example.myapplication;

import com.example.myapplication.model.Coffee;

import java.util.ArrayList;
import java.util.Arrays;

public class CoffeeData {
    private static ArrayList<Coffee> coffeeList = new ArrayList<>(Arrays.asList(
            new Coffee("Caffe Americano", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "https://lh3.googleusercontent.com/cxXyxZ6ykwLDj1a4KzcGiRWR_MQAUwIoTP_AoeS0aSMvJz5Ycpn3dTHcqRSgNrl9aXsn9A=s128", 1000),
            new Coffee("Cappuccino", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "https://lh3.googleusercontent.com/CuBEckH67UPtbGTQXWZqLNc5Wuk3SpHmLpMN7I-xx-jb7UkxrfiMVXVZBDnSPtPGfA-71w=s85", 1500),
            new Coffee("Espresso", "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.", "https://lh3.googleusercontent.com/yBhvpL2yQsu45cPumzMFCWjRKgNvGxDDIsuOWz5DjpIBX3SlK1AhPqbmuskN4JtV-lHks5k=s109", 2000),
            new Coffee("Latte", "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.", "https://lh3.googleusercontent.com/bt9IulW5-MEnCoTviReaOWvHGNOZHIi7SY3UJt5PVTOl4oQScqRrHB13zNmKwQ7rudv9GA=s85", 2000)
    ));

    public static ArrayList<Coffee> getCoffeeList() {
        return coffeeList;
    }
}
