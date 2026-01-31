package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service901.model.Model901;
import java.util.Optional;

public interface Entity901DatasourcePort {
    Optional<Model901> find(Long id);
}
