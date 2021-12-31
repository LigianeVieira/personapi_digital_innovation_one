package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty(message = "FirstName cannot be empty")
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty(message = "LastName cannot be empty")
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty(message = "Cpf cannot be empty")
    @CPF
    private String cpf;

    @NotNull
    private String birthDate;

    @Valid
    @NotEmpty(message = "Phone cannot be empty")
    private List<PhoneDTO> phones;
}
