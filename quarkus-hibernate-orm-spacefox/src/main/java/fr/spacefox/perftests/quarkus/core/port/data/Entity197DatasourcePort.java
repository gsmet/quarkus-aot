package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service197.model.Model197;
import java.util.Optional;

public interface Entity197DatasourcePort {
    Optional<Model197> find(Long id);
}
