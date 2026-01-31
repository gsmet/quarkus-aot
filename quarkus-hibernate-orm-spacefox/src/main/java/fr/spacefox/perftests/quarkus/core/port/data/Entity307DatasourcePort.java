package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service307.model.Model307;
import java.util.Optional;

public interface Entity307DatasourcePort {
    Optional<Model307> find(Long id);
}
