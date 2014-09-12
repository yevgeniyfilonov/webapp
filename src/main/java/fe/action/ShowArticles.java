package fe.action;

import fe.entity.Articles;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static fe.connector.Conector.getDBConnection;

public class ShowArticles {
    public void ShowArticles() throws SQLException {
        Connection dbConnection = null;
        Statement statement = null;
        String selectTableSQL = "SELECT * from ARTICLES ";
        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();

            // выбираем данные с БД
            ResultSet rs = statement.executeQuery(selectTableSQL);
            // И если что то было получено то цикл while сработает
            while (rs.next()) {
                Articles articles = new Articles();
                articles.setId(rs.getInt("ID"));
                articles.setTitle(rs.getString("TITLE"));
                articles.setText(rs.getString("TEXT"));
                articles.setDate(rs.getDate("DATE"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
