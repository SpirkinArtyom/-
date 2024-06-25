@Stateless
public class LibrarySessionBean {
    @PersistenceContext(unitName = "LibraryPU")
    private EntityManager em;

    public List<Book> getAllBooks() {
        return em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }

    // Методы для добавления, редактирования и удаления книг
}
