package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service877.model.Model877;
import java.util.Optional;

public interface Entity877DatasourcePort {
    Optional<Model877> find(Long id);
}
