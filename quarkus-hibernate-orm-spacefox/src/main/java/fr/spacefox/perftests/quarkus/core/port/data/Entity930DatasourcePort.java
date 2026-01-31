package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service930.model.Model930;
import java.util.Optional;

public interface Entity930DatasourcePort {
    Optional<Model930> find(Long id);
}
