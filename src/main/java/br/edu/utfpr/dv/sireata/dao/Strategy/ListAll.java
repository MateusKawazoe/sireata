package br.edu.utfpr.dv.sireata.dao;

import java.sql.SQLException;
import java.util.List;

public abstract class CRUD_DAO<Aux> {
    public List<aux> listarTodos(boolean apenasAtivos) throws SQLException;
}