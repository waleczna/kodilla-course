package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {
    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }
    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        /*Select U.FirstName,  U.LastName, Count(*) As Posts_Number
        From Users U Join Posts P On U.Id = P.USER_ID
        Group by U.Id
        Having Count(*) >= 2
        Order by U.LastName, U.FirstName;*/

        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "Select U.Id, U.FirstName,  U.LastName, Count(*) As Posts_Number\n" +
                "        From Users U Join Posts P On U.Id = P.USER_ID\n" +
                "        Group by U.Id\n" +
                "        Having Count(*) >= 2\n" +
                "        Order by U.LastName, U.FirstName";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getString("Posts_Number"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(2, counter);
    }
}
