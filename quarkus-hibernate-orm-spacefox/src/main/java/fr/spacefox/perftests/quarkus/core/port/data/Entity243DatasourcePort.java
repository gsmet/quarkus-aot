package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service243.model.Model243;
import java.util.Optional;

public interface Entity243DatasourcePort {
    Optional<Model243> find(Long id);
}
