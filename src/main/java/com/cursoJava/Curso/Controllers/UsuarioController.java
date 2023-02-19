package com.cursoJava.Curso.Controllers;

import com.cursoJava.Curso.Models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*Esta anotacion llamada "RestController" se utilizo para importar la libreria
    RestController de SpringBoot*/
@RestController

public class UsuarioController {
    /*Esta anotacion llamada "RequestMapping se utiliza para indicar la
    url que deberia ser para devolver este contenido.
        Dentro de los parentesis se indican los parametros del url y seria
        algo asi:
        localhost:8080/prueba
        */
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(1178L);
        usuario.setNombre("Luca");
        usuario.setApellido("Britez");
        usuario.setEmail("programador@gmail.com");
        usuario.setPassword("234js");
        usuario.setTelefono("1128379467");
        return usuario;
    }



    @RequestMapping(value = "usuario/{id}")
    public Usuario editar(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(1178L);
        usuario.setNombre("Luca");
        usuario.setApellido("Britez");
        usuario.setEmail("programador@gmail.com");
        usuario.setPassword("234js");
        usuario.setTelefono("1128379467");
        return usuario;
    }


    @RequestMapping(value = "usuario/{id}")
    public Usuario eliminar(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(1178L);
        usuario.setNombre("Luca");
        usuario.setApellido("Britez");
        usuario.setEmail("programador@gmail.com");
        usuario.setPassword("234js");
        usuario.setTelefono("1128379467");
        return usuario;
    }



    @RequestMapping(value = "usuario/{id}")
    public Usuario buscar(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(1178L);
        usuario.setNombre("Luca");
        usuario.setApellido("Britez");
        usuario.setEmail("programador@gmail.com");
        usuario.setPassword("234js");
        usuario.setTelefono("1128379467");
        return usuario;
    }
}
