package projetojavaGFT.personapi.Utils;

import projetojavaGFT.personapi.DTO.Request.PersonDTO;
import projetojavaGFT.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

        private static final String FIRST_NAME = "Alex";
        private static final String LAST_NAME = "Ferraro";
        private static final String CPF_NUMBER = "369.333.878-79";
        private static final long PERSON_ID = 1L;
        public static final LocalDate BIRTH_DATE = LocalDate.of(2021, 07, 24);

        public static PersonDTO createFakeDTO() {
            return PersonDTO.builder()
                    .firstName(FIRST_NAME)
                    .lastName(LAST_NAME)
                    .cpf(CPF_NUMBER)
                    .birthDate("04-04-2010")
                    .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                    .build();
        }

        public static Person createFakeEntity() {
            return Person.builder()
                    .id(PERSON_ID)
                    .firstName(FIRST_NAME)
                    .lastName(LAST_NAME)
                    .cpf(CPF_NUMBER)
                    .birthDate(BIRTH_DATE)
                    .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                    .build();
        }
    }

