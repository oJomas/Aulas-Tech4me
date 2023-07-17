package model;

import java.time.LocalDate;
import java.util.function.Predicate;

public class RemoverPorData implements Predicate<Filme> {

    @Override
    public boolean test(Filme filme) {
       if(filme.getDataLancamento().compareTo(LocalDate.now()) >= 1){
        return true;
       }
       //return filme.getDataLancamento().isAfter(LocalDate.now());
       return false;
    }
    
}
