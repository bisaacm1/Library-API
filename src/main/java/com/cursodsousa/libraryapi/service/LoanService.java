package com.cursodsousa.libraryapi.service;

import com.cursodsousa.libraryapi.api.dto.LoanFilterDto;
import com.cursodsousa.libraryapi.api.resource.BookController;
import com.cursodsousa.libraryapi.model.entity.Loan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface LoanService {
    Loan save( Loan loan );

    Optional<Loan> getById(Long id);

    Loan update(Loan loan);

    Page<Loan> find(LoanFilterDto filterDto, Pageable pageable);
}
