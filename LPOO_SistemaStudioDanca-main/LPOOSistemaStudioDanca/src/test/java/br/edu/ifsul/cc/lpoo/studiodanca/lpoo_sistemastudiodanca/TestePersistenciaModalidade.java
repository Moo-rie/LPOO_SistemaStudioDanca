/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model.Modalidade;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author 20212PF.CC0006
 */
public class TestePersistenciaModalidade {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaModalidade() {
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
    public void testePersistenciaModalidade() throws Exception {
        Modalidade m = new Modalidade();
        m.setDescricao("jiujitsu");
        
        jpa.persist(m);
        
        Modalidade persistidoProduto = (Modalidade)jpa.find(Modalidade.class, m.getId());;
        
        Assert.assertEquals(m.getDescricao(), persistidoProduto.getDescricao());
        
    }
}
