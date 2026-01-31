package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service76.model.Model76;
import java.util.Optional;

public interface Entity76DatasourcePort {
    Optional<Model76> find(Long id);
}
