package com.example.training.bl;

import com.example.training.repository.JcContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class Model implements ModelInterface {

    final JcContactRepository jcContactRepository;

    @Override
    public String get() {
        return jcContactRepository.findById(1L)
                .get()
                .getEmail();
    }
}
