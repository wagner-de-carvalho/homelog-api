# homelog-api
API de entrega de comidas.

### Iniciar projeto
Para iniciar o projeto, no terminal:
`java -jar meu-projeto.0.0.1-SNAPSHOT.jar`

### Controller
A injeção de dependência do **spring Jakarta JPA** é feita pela anotação **@Autowired**. Porém, para facilitar testes, utilizamos um construtor da classe/interface de repositório, fornecido pela biblioteca **lombok** através da anotação **AllargsConstructor**.
- `@Controller` = esta anotação indica ao **Spring** que a classe em questão é um controlador, portanto apto a receber requisições.
- `@ControllerAdvice` = esta anotação indica ao **Spring** que a classe em questão é um tratador de exceções lançadas por quaisquer rotas.
