package just_init_db;

import commons.FlywayInitializer;
import commons.JDBCCredentials;
import org.jetbrains.annotations.NotNull;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.*;

public final class Main {

  public static void main(@NotNull String[] args) {
    FlywayInitializer.initDb();
  }
}
