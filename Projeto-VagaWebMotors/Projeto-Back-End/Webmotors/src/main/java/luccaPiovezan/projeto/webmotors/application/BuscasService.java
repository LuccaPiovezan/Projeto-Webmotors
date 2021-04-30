package luccaPiovezan.projeto.webmotors.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import luccaPiovezan.projeto.webmotors.domain.usuario.Buscas;
import luccaPiovezan.projeto.webmotors.domain.usuario.BuscasRepository;

@Service
public class BuscasService {
	
	@Autowired
	private BuscasRepository buscasRepository;
	
	public void saveBuscas(Buscas buscas) {
		buscasRepository.save(buscas);
	}
}
