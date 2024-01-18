package lk.ijse.posback.dao.custom;

import lk.ijse.posback.dao.CrudDAO;
import lk.ijse.posback.entity.OrderDetails;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface OrderDetailsDAO extends CrudDAO<OrderDetails, String> {
    List<OrderDetails> get(Connection connection, String orderId) throws SQLException;
}

