package test.generic;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample genericSample = new GenericSample();
        genericSample.checkGenericDTO();
    }

    public void checkGenericDTO() {
        CastingGenericDTO<String> castingGenericDTO = new CastingGenericDTO<String>();
        castingGenericDTO.setObject(new String("Aa"));
        String a = castingGenericDTO.getObject();
        System.out.println(a);


        WildCardGeneric<Car> wildCardGeneric = new WildCardGeneric<Car>();
        wildCardGeneric.setWildcard(new Car("Mustang"));
        wildCardMethod(wildCardGeneric);

        WildCardGeneric<Bus> wildCardGeneric1 = new WildCardGeneric<Bus>();
        wildCardGeneric1.setWildcard(new Bus("Siera"));
        wildBusMethod(wildCardGeneric1);
        wildCardMethod(wildCardGeneric1);
    }

    public void wildCardMethod(WildCardGeneric<? extends Car> c) { // Car 클래스를 상속받고 있는 모든게 다 들어올수있음
        Car value = c.getWildcard();
        System.out.println(value);
    }

    public void wildBusMethod(WildCardGeneric<? extends Bus> c) {
        Bus value = c.getWildcard();
        System.out.println(value);

    }
}
