package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service97.model.Model97;
import java.util.Optional;

public interface Entity97DatasourcePort {
    Optional<Model97> find(Long id);
}
