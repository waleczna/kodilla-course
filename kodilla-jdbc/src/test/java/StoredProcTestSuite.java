import com.kodilla.jdbc.DbManager;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        //  Ten fragment jeszcze nic nie testuje. Przygotowuje nam za to dane testowe.
        //  Ich przygotowanie polega na wypełnieniu kolumny VIP_LEVEL wartością Not set dla wszystkich czytelników.
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);


        // When
        // W sekcji When zamiast polecenia executeQuery(String query) skorzystaliśmy
        // z metody execute(String query).
        // Tej metody należy używać podczas wykonywania procedur składowanych.
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement2.execute(sqlProcedureCall);


        // Then
        // W sekcji Then pobieramy z bazy danych informację o ilości rekordów w tabeli READERS,
        // które mają kolumnę VIP_LEVEL ustawioną na wartość Not set. Jedyną poprawną wartością będzie zero,
        // ponieważ procedura składowana  UpdateVipLevels() powinna zaktualizować tę kolumnę
        // we wszystkich rekordach tabeli. Tak też jest skonstruowana nasza asercja.
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(5, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        // Given
        // When
        // Then
    }
}
