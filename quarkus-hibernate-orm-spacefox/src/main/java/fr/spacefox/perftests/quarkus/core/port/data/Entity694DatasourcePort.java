package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service694.model.Model694;
import java.util.Optional;

public interface Entity694DatasourcePort {
    Optional<Model694> find(Long id);
}
