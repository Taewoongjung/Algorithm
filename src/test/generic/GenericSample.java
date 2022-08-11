package test.generic;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample genericSample = new GenericSample();
        genericSample.checkGenericDTO();
    }

    public void checkGenericDTO() {
        GenericDTO<String> dto1 = new GenericDTO<String>();
        dto1.setObject(new String("aa"));
        System.out.println(dto1);
        System.out.println(dto1.getObject().getClass().getSimpleName());
    }
}
