package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service693.model.Model693;
import java.util.Optional;

public interface Entity693DatasourcePort {
    Optional<Model693> find(Long id);
}
