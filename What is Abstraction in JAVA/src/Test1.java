public class Test1 {
    interface olaCustomer{
        void bookCab();
        void findARide();
        void rentCab();
        void rateDriver();
        void scheduleCab();
        void cancelCab();
        void addMoneytoWallet();
        void raiseTicket();
        void signup();
        void signIn();
    }

    interface olaDriver{
        void acceptBooking();
        void getCustomerLocation();
        void setAvailableStatus();
        void getMyCommission();
        void raiseMoneyTransferRequest();
        void callCustomer();
        void setUpYourVehicle();
        void customerFeedback();
    }

    interface olaOwner{
        void getDriverRecords();
        void getReportByDriver();
        void getReportByRegion();
        void getTotalRevenue();
        void getCustomerFeedback();
        void addDriver();
        void removeDriver();
        void changeDriverStatus();
    }

public class Test1 implements olaOwner, olaDriver, olaCustomer{
    public static void main(String[] args){
        olaCustomer cust = new Test1();
        olaDriver manoj = new Test1();
    }
}
}
