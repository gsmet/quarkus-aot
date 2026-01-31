package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service789.model.Model789;
import java.util.Optional;

public interface Entity789DatasourcePort {
    Optional<Model789> find(Long id);
}
