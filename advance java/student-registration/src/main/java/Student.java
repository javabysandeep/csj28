import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
}
