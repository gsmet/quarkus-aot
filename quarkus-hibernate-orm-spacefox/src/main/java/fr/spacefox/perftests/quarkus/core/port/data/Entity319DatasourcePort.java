package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service319.model.Model319;
import java.util.Optional;

public interface Entity319DatasourcePort {
    Optional<Model319> find(Long id);
}
