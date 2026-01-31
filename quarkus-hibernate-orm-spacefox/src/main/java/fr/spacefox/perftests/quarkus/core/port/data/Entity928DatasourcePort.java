package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service928.model.Model928;
import java.util.Optional;

public interface Entity928DatasourcePort {
    Optional<Model928> find(Long id);
}
