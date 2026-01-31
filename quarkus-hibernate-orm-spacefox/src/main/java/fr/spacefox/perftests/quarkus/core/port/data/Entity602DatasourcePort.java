package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service602.model.Model602;
import java.util.Optional;

public interface Entity602DatasourcePort {
    Optional<Model602> find(Long id);
}
