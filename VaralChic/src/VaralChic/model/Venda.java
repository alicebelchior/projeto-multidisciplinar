
package VaralChic.model;

import java.sql.Date;

/**
 *
 * @author alice
 */

//RESPONSÁVEL PELO CADASTRO DE CLIENTE E TRAZER AS INFORMAÇÕES DOS CAMPOS DA TELA "ControleVenda"
public class Venda {
    //ATRIBUTOS ESTÁTICOS
    public static int codigo_venda;
    public static Integer codigo_cliente;
    public static Integer codigo_produto;
    public static Date data_venda;
    public static Float valor;
    public static String metodo_pagamento;
}
