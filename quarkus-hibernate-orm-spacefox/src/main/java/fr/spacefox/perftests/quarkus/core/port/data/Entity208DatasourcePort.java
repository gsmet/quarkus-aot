package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service208.model.Model208;
import java.util.Optional;

public interface Entity208DatasourcePort {
    Optional<Model208> find(Long id);
}
