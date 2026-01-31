package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service205.model.Model205;
import java.util.Optional;

public interface Entity205DatasourcePort {
    Optional<Model205> find(Long id);
}
