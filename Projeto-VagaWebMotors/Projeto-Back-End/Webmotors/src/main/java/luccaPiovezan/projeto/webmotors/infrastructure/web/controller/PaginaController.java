package luccaPiovezan.projeto.webmotors.infrastructure.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import luccaPiovezan.projeto.webmotors.application.BuscasService;
import luccaPiovezan.projeto.webmotors.domain.usuario.Buscas;

@Controller
public class PaginaController {
	
	@Autowired
	private BuscasService buscasService;
	
	@GetMapping(path = {"/login", "/", "/pagina", "/pagina-inicial","/busca","/procura"})
	public String login(Model model) {
		model.addAttribute("buscas", new Buscas());
		return "pagina-inicial";
	}
	@PostMapping(path = "/login/db")
	public String saveDB(@ModelAttribute("buscas") Buscas buscas) {
		buscasService.saveBuscas(buscas);	
		return "pagina-inicial";
	}
}
