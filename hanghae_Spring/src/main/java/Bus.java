public class Bus extends Car implements Busride, driveSpeed, Checknow{
    public Bus(int fuelVolume, String carNumber, int speed, int charge, boolean status, int passengerMAX, int passenger) {
        this.fuelVolume = fuelVolume;
        this.carNumber = carNumber;
        this.speed = speed;
        this.charge = charge;
        this.status = status;
        this.passengerMAX = passengerMAX;
        this.passenger = passenger;
    }

    @Override
    public void driveStart() {
        System.out.println("차량 번호 : " + carNumber);
        if(status == true && fuelVolume > 10){
            System.out.println("주유 상태 : " + fuelVolume);
            System.out.println("운행 시작");
        }else {
            System.out.println("주유 상태 : " + fuelVolume);
            System.out.println("주유량을 확인해 주세요");
            System.out.println("차고지행");
            status = false;
        }
    }

    @Override
    public void busRide(int ridepassenger) {
        if(passenger < passengerMAX && status == true){
            passenger += ridepassenger;
            System.out.println("승객이 탑승합니다. ");
            System.out.println("탑승 인원 :  "+ ridepassenger);
            if(passenger > passengerMAX){
                System.out.println("만차입니다.");
                passenger -= passenger;
            }
        }else{
            System.out.println("만차이거나 운행중이 아닙니다.");
        }
    }

    @Override
    public void drivespeed(int plusSpeed) {
        if(fuelVolume > 10 && status == true){
            speed += plusSpeed;
            System.out.println("운행중에 속도 변경 하셨습니다.");
            System.out.println("------------------");
        }else{
            System.out.println("주유량 부족하거나 운행중이 아닙니다.");
            System.out.println("------------------");
            status = false;
        }
    }

    @Override
    public void checknow() {
        System.out.println("차량 번호 : " + carNumber);
        System.out.println("주유량 : " + fuelVolume);
        System.out.println("현재 속도 : " + speed);
        System.out.println("요금 : " + charge);
        System.out.println("운행 상태 : " + status);
        System.out.println("현재 탑승인원 : " + passenger + ", 최대 탑승 인원 : " + passengerMAX);
        System.out.println("------------------");
    }
}
