package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.DadosProcedimento;

@RestController
@RequestMapping("/procedimentos")
public class ProcedimentosController {
    private List <DadosProcedimento> procedimentos = new ArrayList<>();
   


    @GetMapping("/procedimentos-cadastrados")
    private List<DadosProcedimento> obterProcedimentos(){
        return procedimentos;
    }


    @PostMapping("/cadastrar-procedimentos")
    private String requisicaoPostProcedimentos(@RequestBody DadosProcedimento procedimento){
        procedimentos.add(procedimento);
        return "O procedimento " + procedimento + " foi cadastrado com sucesso!";
    }
}
