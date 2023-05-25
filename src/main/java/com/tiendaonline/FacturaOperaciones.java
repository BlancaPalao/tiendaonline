package com.tiendaonline;

import java.util.ArrayList;

public class FacturaOperaciones {

    public boolean actualizarFactura(int codigo, ArrayList<Integer> codigos, String cambios) {

        for (Integer i : codigos)
            if (i == codigo) {
                cambios = "UPDATE factura SET cambios WHERE id_factura = " + cambios;
                System.out.println(cambios);
                return true;
            }

        return false;
    }
}
