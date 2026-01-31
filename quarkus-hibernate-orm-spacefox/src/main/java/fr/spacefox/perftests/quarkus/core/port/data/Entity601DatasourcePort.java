package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service601.model.Model601;
import java.util.Optional;

public interface Entity601DatasourcePort {
    Optional<Model601> find(Long id);
}
