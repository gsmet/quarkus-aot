package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service384.model.Model384;
import java.util.Optional;

public interface Entity384DatasourcePort {
    Optional<Model384> find(Long id);
}
