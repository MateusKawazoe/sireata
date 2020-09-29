package br.edu.utfpr.dv.sireata.dao;

import java.sql.SQLException;

public abstract class CRUD_DAO<Aux> {
    public int salvar(Aux aux) throws SQLException;

    public void excluir(int id) throws SQLException;

    public Aux buscarPorId(int id) throws SQLException;
}