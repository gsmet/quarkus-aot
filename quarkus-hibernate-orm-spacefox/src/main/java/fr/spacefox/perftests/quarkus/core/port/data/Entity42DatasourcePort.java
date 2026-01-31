package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service42.model.Model42;
import java.util.Optional;

public interface Entity42DatasourcePort {
    Optional<Model42> find(Long id);
}
