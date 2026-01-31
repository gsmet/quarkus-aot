package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service751.model.Model751;
import java.util.Optional;

public interface Entity751DatasourcePort {
    Optional<Model751> find(Long id);
}
