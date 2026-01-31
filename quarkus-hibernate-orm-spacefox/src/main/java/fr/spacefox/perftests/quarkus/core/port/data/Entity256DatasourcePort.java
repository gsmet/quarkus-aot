package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service256.model.Model256;
import java.util.Optional;

public interface Entity256DatasourcePort {
    Optional<Model256> find(Long id);
}
