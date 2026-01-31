package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service488.model.Model488;
import java.util.Optional;

public interface Entity488DatasourcePort {
    Optional<Model488> find(Long id);
}
