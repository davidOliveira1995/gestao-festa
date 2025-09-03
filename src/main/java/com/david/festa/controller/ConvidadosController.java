package com.david.festa.controller;

import com.david.festa.model.Convidado;
import com.david.festa.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadosController {

    @Autowired
    private ConvidadoRepository convidadoRepository;

    @GetMapping("/convidados")
    public ModelAndView listar() {

        ModelAndView mv = new ModelAndView("ListaConvidados");

        mv.addObject("convidados", convidadoRepository.findAll());
        mv.addObject(new Convidado());

        return mv;
    }

    @PostMapping("/convidados")
    public String salvar(Convidado convidado) {
        this.convidadoRepository.save(convidado);
        return "redirect:/convidados";
    }


}
