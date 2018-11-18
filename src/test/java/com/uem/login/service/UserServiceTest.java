package com.uem.login.service;

import com.uem.login.model.User;
import com.uem.login.repository.RoleRepository;
import com.uem.login.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.MockitoAnnotations.initMocks;

public class UserServiceTest {

    @Mock
    private UserRepository mockUserRepository;
    @Mock
    private RoleRepository mockRoleRepository;
    @Mock
    private BCryptPasswordEncoder mockBCryptPasswordEncoder;

    private UserService userServiceUnderTest;
    private User user;

    @Before
    public void setUp() {
        initMocks(this);
        userServiceUnderTest = new UserService(mockUserRepository,
                                               mockRoleRepository,
                                               mockBCryptPasswordEncoder);
        user = User.builder()
                .id(1)
                .name("Gustavo")
                .cpf("24524394443")
                .email("test@test.com")
                .build();

        Mockito.when(mockUserRepository.save(any()))
                .thenReturn(user);
        Mockito.when(mockUserRepository.findByEmail(anyString()))
                .thenReturn(user);
    }

    @Test
    public void testEncontrarUsuarioPorEmail() {
        // Configuração
        final String email = "test@test.com";

        // Executa o teste
        final User result = userServiceUnderTest.findUserByEmail(email);

        // Verifique os resultados
        assertEquals(email, result.getEmail());
    }

    @Test
    public void testSalvarUsuario() {
        // Configuração
        final String email = "test@test.com";

        // Executa o teste
        User result = userServiceUnderTest.saveUser(User.builder().build());

        // Verifique os resultados
        assertEquals(email, result.getEmail());
    }
}
