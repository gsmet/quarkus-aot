package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service188.model.Model188;
import java.util.Optional;

public interface Entity188DatasourcePort {
    Optional<Model188> find(Long id);
}
