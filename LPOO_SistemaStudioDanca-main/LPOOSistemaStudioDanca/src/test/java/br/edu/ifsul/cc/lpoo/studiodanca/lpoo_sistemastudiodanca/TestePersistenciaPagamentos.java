/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Pagamentos;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author 20212pf.cc0006
 */
    
public class TestePersistenciaPagamentos {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaPagamentos() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    @Test
    public void testePersistenciaPagamentos() throws Exception {
        Pagamentos p = new Pagamentos();
        p.setDataVcto(Calendar.getInstance());
        p.setValor(2000.0);
        p.setDataPgto(Calendar.getInstance());
        p.setValorPgto(2.0);
        
        jpa.persist(p);
        
        Pagamentos persistidoPagamentos = (Pagamentos)jpa.find(Pagamentos.class, p.getId());
        
    }
}
