package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service744.model.Model744;
import java.util.Optional;

public interface Entity744DatasourcePort {
    Optional<Model744> find(Long id);
}
