package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service907.model.Model907;
import java.util.Optional;

public interface Entity907DatasourcePort {
    Optional<Model907> find(Long id);
}
