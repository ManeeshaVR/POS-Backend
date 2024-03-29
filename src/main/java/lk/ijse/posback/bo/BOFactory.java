package lk.ijse.posback.bo;

import lk.ijse.posback.bo.custom.impl.CustomerBOImpl;
import lk.ijse.posback.bo.custom.impl.ItemBOImpl;
import lk.ijse.posback.bo.custom.impl.OrderBOImpl;
import lk.ijse.posback.bo.custom.impl.OrderDetailsBOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory(){}

    public static BOFactory getBoFactory(){
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes {
        CUSTOMER,ITEM,ORDER,ORDER_DETAILS
    }

    public SuperBO getBO(BOTypes boType){
        switch (boType){
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case ORDER:
                return new OrderBOImpl();
            case ORDER_DETAILS:
                return new OrderDetailsBOImpl();
            default:
                return null;
        }
    }

}


