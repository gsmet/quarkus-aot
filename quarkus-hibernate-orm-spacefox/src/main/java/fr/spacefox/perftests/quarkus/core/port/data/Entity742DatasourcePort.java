package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service742.model.Model742;
import java.util.Optional;

public interface Entity742DatasourcePort {
    Optional<Model742> find(Long id);
}
