package com.sofftek;
import com.sofftek.modelo.talleres.CocheT;
import com.sofftek.modelo.moverse.Coche;
import com.sofftek.modelo.talleres.SeguroCoche;
import com.sofftek.modelo.dao.Cliente;
import com.sofftek.modelo.dao.ClienteDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner {

    @Autowired
    private SeguroCoche s1;
    @Autowired
    private Coche coche1;
    @Autowired
    private Cliente cliente1;
    @Autowired
    private ClienteDAO clienteDAO1;


    public static void main(String[] args) {
        SpringApplication.run(FundamentosSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.printf("\nEjercicio de los talleres\n");
        CocheT c1 = new CocheT("222","Seat Ibiza");
        System.out.println(s1.reparar(c1));

        System.out.printf("\nEjercicio del conductor\n");
        System.out.println(coche1.moverse());

        System.out.println("\nEjercicio de los clientes\n");
        System.out.println(clienteDAO1.insertar(cliente1));
    }
}
