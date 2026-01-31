package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service8.model.Model8;
import java.util.Optional;

public interface Entity8DatasourcePort {
    Optional<Model8> find(Long id);
}
