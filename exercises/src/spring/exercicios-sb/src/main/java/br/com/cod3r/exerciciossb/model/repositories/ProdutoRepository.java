package br.com.cod3r.exerciciossb.model.repositories;

import br.com.cod3r.exerciciossb.model.entities.Produto;

// import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository
        // extends CrudRepository<Produto, Integer> {
        extends PagingAndSortingRepository<Produto, Integer> {
    Iterable<Produto> findByNomeContaining(String parteNome);

}
