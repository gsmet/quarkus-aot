package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service450.model.Model450;
import java.util.Optional;

public interface Entity450DatasourcePort {
    Optional<Model450> find(Long id);
}
