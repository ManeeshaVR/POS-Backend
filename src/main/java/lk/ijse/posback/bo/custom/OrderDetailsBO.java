package lk.ijse.posback.bo.custom;

import lk.ijse.posback.bo.SuperBO;
import lk.ijse.posback.dto.OrderDetailsDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface OrderDetailsBO extends SuperBO {
    List<OrderDetailsDTO> getOrderDetails(Connection connection) throws SQLException;

    boolean saveOrderDetails(List<OrderDetailsDTO> details, Connection connection) throws SQLException;
}

