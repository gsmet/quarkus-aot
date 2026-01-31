package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service383.model.Model383;
import java.util.Optional;

public interface Entity383DatasourcePort {
    Optional<Model383> find(Long id);
}
