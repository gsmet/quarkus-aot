package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service654.model.Model654;
import java.util.Optional;

public interface Entity654DatasourcePort {
    Optional<Model654> find(Long id);
}
