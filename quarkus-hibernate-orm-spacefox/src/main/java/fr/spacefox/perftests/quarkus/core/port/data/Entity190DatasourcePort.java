package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service190.model.Model190;
import java.util.Optional;

public interface Entity190DatasourcePort {
    Optional<Model190> find(Long id);
}
