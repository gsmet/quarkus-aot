package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service173.model.Model173;
import java.util.Optional;

public interface Entity173DatasourcePort {
    Optional<Model173> find(Long id);
}
