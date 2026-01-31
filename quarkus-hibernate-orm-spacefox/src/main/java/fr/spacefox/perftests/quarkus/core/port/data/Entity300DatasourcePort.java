package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service300.model.Model300;
import java.util.Optional;

public interface Entity300DatasourcePort {
    Optional<Model300> find(Long id);
}
