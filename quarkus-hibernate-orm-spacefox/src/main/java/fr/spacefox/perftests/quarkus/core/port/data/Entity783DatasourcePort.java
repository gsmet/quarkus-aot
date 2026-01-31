package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service783.model.Model783;
import java.util.Optional;

public interface Entity783DatasourcePort {
    Optional<Model783> find(Long id);
}
