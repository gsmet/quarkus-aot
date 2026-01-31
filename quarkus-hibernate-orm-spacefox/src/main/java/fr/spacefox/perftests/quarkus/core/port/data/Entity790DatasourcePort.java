package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service790.model.Model790;
import java.util.Optional;

public interface Entity790DatasourcePort {
    Optional<Model790> find(Long id);
}
