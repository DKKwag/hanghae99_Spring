public class Taxi extends Car implements driveSpeed, plusCharge, Checknow{
    public Taxi(int fuelVolume, String carNumber, int speed, int charge, boolean status,int distance, int passenger) {
        this.fuelVolume = fuelVolume;
        this.carNumber = carNumber;
        this.speed = speed;
        this.charge = charge;
        this.status = status;
        this.distance = distance;
        this.passenger = passenger;
    }

    @Override
    public void driveStart() {
        System.out.println("차량 번호 : " + carNumber);
        if(fuelVolume > 10 && status == true){
            if(status == true && passenger  == 0){
                System.out.println("주유 상태 : " + fuelVolume);
                System.out.println("일반");
            }else {
                System.out.println("운행 중");
            }
        }else{
            System.out.println("탑승 불가");
            status = false;
        }
    }

    @Override
    public void pluscharge(int plusdistance) {
       if(plusdistance > distance){
           distance += plusdistance;
           if(distance > 20){
               charge += 1000;
               System.out.println("요금이 천원이 더 붙습니다.");
           }
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
        System.out.println("목적지 까지 거리 : " + distance);
        System.out.println("최종 요금 : " + charge);
        System.out.println("운행 상태 : " + status);
        System.out.println("------------------");
    }
}
