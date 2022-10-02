package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

    // Primeira forma:
    @GetMapping("/{id}") // EX: http://localhost:8080/clientes/123
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    // Segunda forma:
    @GetMapping(path = "subtrair") // EX: http://localhost:8080/clientes?id=123
    public Cliente obterClientePorId2(
            @RequestParam(name = "id") int id){
        return new Cliente(id, "João Augusto", "111.222.333-44");
    }
}
