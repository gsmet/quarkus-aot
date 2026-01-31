package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service514.model.Model514;
import java.util.Optional;

public interface Entity514DatasourcePort {
    Optional<Model514> find(Long id);
}
