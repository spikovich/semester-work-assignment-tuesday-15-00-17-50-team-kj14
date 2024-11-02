package com.example.libraryserver.config;

import org.hibernate.dialect.Dialect;
import java.sql.Types;

public class SQLiteDialect extends Dialect {
    public SQLiteDialect() {
        registerColumnType(Types.INTEGER, "integer");
        registerColumnType(Types.VARCHAR, "varchar");
        registerColumnType(Types.FLOAT, "float");
        registerColumnType(Types.DOUBLE, "double");
        registerColumnType(Types.BOOLEAN, "boolean");
        // Добавьте остальные типы данных по необходимости
    }

    @Override
    public boolean supportsIdentityColumns() {
        return true;
    }

    // Реализуйте остальные методы, если требуется
}
