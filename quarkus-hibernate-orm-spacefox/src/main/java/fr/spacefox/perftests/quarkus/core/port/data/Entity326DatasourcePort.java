package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service326.model.Model326;
import java.util.Optional;

public interface Entity326DatasourcePort {
    Optional<Model326> find(Long id);
}
