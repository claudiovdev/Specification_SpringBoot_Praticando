package com.api.specification.spec;

import com.api.specification.models.UsuarioModel;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigInteger;

public class UsuarioSpecs {
    public static Specification<UsuarioModel> maiorDeIdade(){
        return (root, query, builder) -> builder.greaterThanOrEqualTo(root.get("idade"), BigInteger.valueOf(18));
    }

    public static Specification<UsuarioModel> comNomeSemelhante(String nome){
        return (root, query, builder) -> builder.like(root.get("nome"), "%" + nome + "%");
    }
}
