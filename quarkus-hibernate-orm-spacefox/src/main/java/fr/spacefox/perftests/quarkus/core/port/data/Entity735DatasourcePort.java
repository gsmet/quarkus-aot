package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service735.model.Model735;
import java.util.Optional;

public interface Entity735DatasourcePort {
    Optional<Model735> find(Long id);
}
