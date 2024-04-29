package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lecturaBusqueda = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la película o serie que desea buscar: ");
        String busqueda = lecturaBusqueda.nextLine();
        String direccionBusqueda = "https://www.omdbapi.com/?t="+busqueda.replace(" ","+")+"&apikey=724175fd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccionBusqueda))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

       /* Gson gson = new Gson();*/
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        Titulo miTitulo = gson.fromJson(json, Titulo.class);

        TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(miTituloOmdb);
        /*System.out.println(miTitulo);*/



    }
}
