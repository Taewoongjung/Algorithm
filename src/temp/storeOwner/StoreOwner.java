package temp.storeOwner;

//package temp.storeOwner;
//
//import java.util.function.Predicate;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//
//@Getter
//@Builder
//@RequiredArgsConstructor
public class StoreOwner {

//    private final String name;
//    private final String phone;
//    private final String email;
//    private final String storeId;
//
//    public static StoreOwner of(
//        final String name,
//        final String phone,
//        final String email,
//        final String storeId
//    ) {
//        require(ifThereIsNoName -> name == null, name, "점주의 이름은 필수값 입니다.");
//        require(ifThereIsNoPhone -> phone == null, phone, "점주의 전화번호는 필수값 입니다.");
//        require(ifThereIsNoEmail -> email == null, email, "점주의 이메일은 필수값 입니다.");
//
//        return StoreOwner.builder()
//            .name(name)
//            .phone(phone)
//            .email(email)
//            .storeId(storeId)
//            .build();
//    }
//
//    private static <T> void require(Predicate<T> predicate, T target, String msg) {
//        if (predicate.test(target)) {
//            throw new IllegalArgumentException(msg);
//        }
//    }
}
