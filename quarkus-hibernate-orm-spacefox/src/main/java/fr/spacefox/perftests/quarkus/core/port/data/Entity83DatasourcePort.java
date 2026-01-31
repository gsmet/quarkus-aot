package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service83.model.Model83;
import java.util.Optional;

public interface Entity83DatasourcePort {
    Optional<Model83> find(Long id);
}
