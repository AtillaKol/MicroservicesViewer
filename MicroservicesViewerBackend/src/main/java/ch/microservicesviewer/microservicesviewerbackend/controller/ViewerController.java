package ch.microservicesviewer.microservicesviewerbackend.controller;

import ch.microservicesviewer.microservicesviewerbackend.dao.model.ViewersDAOModel;
import ch.microservicesviewer.microservicesviewerbackend.dao.repository.ViewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * Controller, falls @RepositoryRestResource geaendert werden muss
 */
@RepositoryRestController
public class ViewerController {

    private final ViewerRepository viewerRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public ViewerController(ViewerRepository viewerRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.viewerRepository = viewerRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    /**
     * Da das Passwort nicht im Klartext gespeichert werden soll, muss der Body noch geaendert werden.
     * @param viewers
     * @param resourceAssembler
     * @return
     */
    @RequestMapping(path = "/viewer", method = RequestMethod.POST)
    @ResponseBody
    public PersistentEntityResource create(@RequestBody ViewersDAOModel viewers,
                                           PersistentEntityResourceAssembler resourceAssembler) {
        viewers.setViewerPassword(bCryptPasswordEncoder.encode(viewers.getViewerPassword()));
        return resourceAssembler.toFullResource(viewerRepository.save(viewers));
    }

}
