package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service750.model.Model750;
import java.util.Optional;

public interface Entity750DatasourcePort {
    Optional<Model750> find(Long id);
}
