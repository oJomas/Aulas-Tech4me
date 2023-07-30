package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.DadosMedico;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    private List<DadosMedico> medicos = new ArrayList<>();

    @GetMapping("/medicos-cadastrados")
    private List<DadosMedico> obterDadosDosMedicos(){
        return medicos;
    }

    @GetMapping
    private String requisicaoGet(){
        return "Olá, eu sou o método get que foi acessado no controlle";
    }

    @GetMapping("/{nome}")
    private String requisicaoGetComParametro(@PathVariable String nome ){
        return "Essas são as informações do(a) Dr(a) " + nome;
    }

    @PostMapping
    private String requisicaoPost(@RequestBody String nome){
        return "Eu sou a requisição post que pede um nome: " + nome + " como parâmetro!";
    }

    @PostMapping("/cadastro")
    private String requisicaoPostMedicos(@RequestBody DadosMedico medico){
        medicos.add(medico);
        return "Cadastrei o medico: " + medico;
    }

    
}
