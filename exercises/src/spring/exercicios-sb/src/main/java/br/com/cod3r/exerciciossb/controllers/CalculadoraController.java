package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    // primeiro: /calculadora/somar/10/20
    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }


    // segundo: /calculadora/subtrair?a=100&b=39
    @GetMapping("/subtrair")
    public int subtrair(@RequestParam (name = "a") int a,
                        @RequestParam (name = "b") int b) {
        return a - b;
    }
}
