package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service420.model.Model420;
import java.util.Optional;

public interface Entity420DatasourcePort {
    Optional<Model420> find(Long id);
}
